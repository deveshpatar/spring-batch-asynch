package com.devesh.batch.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devesh.batch.secondary.KraKycVerDtls;
import com.devesh.batch.secondary.KraVerLinkTbl;
import com.devesh.batch.secondary.repository.BpMstrTblRepository;
import com.devesh.batch.secondary.repository.KraKycVerDtlsRepository;
import com.devesh.batch.secondary.repository.KraVerLinkRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Ascra_DeveshP
 *
 */
@Slf4j
@Service
public class ReminderService {

	@Value("${notification.email.count}")
	private Long emailCount;
	
	@Value("${kra.helpdesk.id}")
	private String kraHelpdeskId;

	@Autowired
	private NotificationService notificationService;

	private static final String EMAIL_TYPE = "E";

	@Autowired
	private KraVerLinkRepository kraVerLinkRepository;
	
	@Autowired
	private KraKycVerDtlsRepository kraKycVerDtlsRepository;
	
	@Autowired
	private BpMstrTblRepository bpMstrTblRepository;
	
	public void sendReminderEmailNotification() {
		log.info("Inside sendReminderEmailNotification .........");
		
		List<KraVerLinkTbl>  verLinkList = kraVerLinkRepository.getVerLinkList(PageRequest.of(0, 3));
		
		if (verLinkList != null) {
			for(KraVerLinkTbl kraVerLinkTbl : verLinkList) {
				log.info("KraVerLinkTbl ack No : " + kraVerLinkTbl.getAck_no());
				if (kraVerLinkTbl != null) {
					KraKycVerDtls kycVerDtls = kraKycVerDtlsRepository.findByAckNum(kraVerLinkTbl.getAck_no(), PageRequest.of(0, 3));
					
					String bmtShrtNm = bpMstrTblRepository.getBmtShortName(kycVerDtls.getKkvd_mi_id());
					log.info("bmtShrtNm : " + bmtShrtNm);
					 
					if (emailCount > 0 && emailCount >= kraVerLinkTbl.getCount()) {
						log.info("Inside updateKraVerLinkTblAndSendReminderEmail .........");
						updateKraVerLinkTblAndSendReminderEmail(kraVerLinkTbl, kycVerDtls.getKkvd_email_id(), kycVerDtls.getKkvd_rcrd_type(), bmtShrtNm, kraHelpdeskId);
					}
				}
			}
		}
	}
	
	public boolean updateKraVerLinkTblAndSendReminderEmail(KraVerLinkTbl oldkraVerLinkTbl, String email, String recordType, String bmtShrtNm, String kra_helpDesk_Id) {

		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		KraVerLinkTbl kraVerLinkTbl = new KraVerLinkTbl();
		int count = oldkraVerLinkTbl.getCount();
		kraVerLinkTbl.setAck_no(oldkraVerLinkTbl.getAck_no());
		kraVerLinkTbl.setCount(count + 1);
		kraVerLinkTbl.setCrtd_ts(oldkraVerLinkTbl.getCrtd_ts());
		kraVerLinkTbl.setShortlink(oldkraVerLinkTbl.getShortlink());
		kraVerLinkTbl.setUpdt_ts(time);
		kraVerLinkTbl.setKvld_link_chnl(EMAIL_TYPE);
		kraVerLinkTbl.setKlvd_kkvd_seq_no(oldkraVerLinkTbl.getKlvd_kkvd_seq_no());
		kraVerLinkTbl.setKlvd_rcrd_type(recordType);
		kraVerLinkTbl.setNtfn_status("Y");
		kraVerLinkRepository.save(kraVerLinkTbl);
		
		log.info("Sending reminder email .........");
		if (recordType.equals("R")) {
			// Registration Email Call
			notificationService.sendEmailNotification(email, kraVerLinkTbl.getShortlink(),
					UUID.randomUUID().toString(), kraVerLinkTbl.getCrtd_ts(), bmtShrtNm, kra_helpDesk_Id);
		} else {
			// Modification Email Call
			notificationService.sendEmailNotification(email, kraVerLinkTbl.getShortlink(),
					UUID.randomUUID().toString(), kraVerLinkTbl.getCrtd_ts(), bmtShrtNm, kra_helpDesk_Id);
		}
		return true;
	}

}
