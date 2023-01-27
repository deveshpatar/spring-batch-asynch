package com.devesh.batch.config.reader;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devesh.batch.dto.ShortLink;
import com.devesh.batch.secondary.KraVerLinkTbl;
import com.devesh.batch.secondary.repository.KraVerLinkRepository;
import com.devesh.batch.service.NotificationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MyCustomLinkCreator {
	
	@Value("${kra.helpdesk.id}")
	private String kraHelpdeskId;

	@Value("${short.link.base.email.url}")
	private String emailBaseUrl;
	@Value("${short.link.base.mobile.url}")
	private String mobileBaseUrl;
	@Value("${notification.mobile.count}")
	private Long mobileCount;
	@Value("${notification.email.count}")
	private Long emailCount;

	@Autowired
	private NotificationService notificationService;

	private static final String MOBILE_TYPE = "M";
	private static final String EMAIL_TYPE = "E";

	@Autowired
	private KraVerLinkRepository kraVerLinkRepository;

	/**
	 * 
	 * @param kkvd_kra_ack_no
	 * @param seqno
	 * @param mobile
	 * @param email
	 * @param mId 
	 */
	public void setLinkTableAndSendNotification(String kkvd_kra_ack_no, Long seqno, String mobile, String email, String recordType, String mId) {
		
		log.info("Email Base Url : " + emailBaseUrl);
		log.info("Mobile Base Url : " + mobileBaseUrl);
		
		boolean flag = kraVerLinkRepository.checkAckNo(kkvd_kra_ack_no);
		log.info("Is ack is present in KraVerLinkTbl : " + flag);
		if (flag) {
			log.info("Notifications are already trigerred for ack no : " + kkvd_kra_ack_no);
		} else {
			KraVerLinkTbl mobilekraVerLinkTbl = kraVerLinkRepository.findByAckNo(kkvd_kra_ack_no, MOBILE_TYPE,
					PageRequest.of(0, 1));
			KraVerLinkTbl emailkraVerLinkTbl = kraVerLinkRepository.findByAckNo(kkvd_kra_ack_no, EMAIL_TYPE,
					PageRequest.of(0, 1));

			if (mobileCount > 0) {
				if (mobilekraVerLinkTbl == null) {
					addKraVerLinkTbl(kkvd_kra_ack_no, seqno, mobile, email, MOBILE_TYPE, mobileBaseUrl, recordType, mId, kraHelpdeskId);
				} else if (mobileCount > mobilekraVerLinkTbl.getCount()) {
					updateKraVerLinkTbl(mobilekraVerLinkTbl, MOBILE_TYPE, mobile, email, recordType, mId, kraHelpdeskId);
				}
			}

			if (emailCount > 0) {
				if (emailkraVerLinkTbl == null)
					addKraVerLinkTbl(kkvd_kra_ack_no, seqno, mobile, email, EMAIL_TYPE, mobileBaseUrl, recordType, mId, kraHelpdeskId);
				else if (emailCount > emailkraVerLinkTbl.getCount()) {
					updateKraVerLinkTbl(emailkraVerLinkTbl, EMAIL_TYPE, mobile, email, recordType, mId, kraHelpdeskId);
				}
			}
		}
	}
	

	/**
	 * addKraVerLinkTbl
	 * 
	 * @param kkvd_kra_ack_no
	 * @param seqno
	 * @param mobile
	 * @param email
	 * @param notificationType
	 * @param baseUrl
	 * @param mId 
	 * @return
	 */
	public boolean addKraVerLinkTbl(String kkvd_kra_ack_no, Long seqno, String mobile, String email,
			String notificationType, String baseUrl, String recordType, String mId, String kra_helpDesk_Id) {
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		ShortLink shortLink = new ShortLink();
		String strTimestamp = new SimpleDateFormat("ddMMyyhhmmsss").format(date);
		String shortlink = shortLink.getKey(baseUrl + kkvd_kra_ack_no) + strTimestamp;
		KraVerLinkTbl kraVerLinkTbl = new KraVerLinkTbl();
		kraVerLinkTbl.setAck_no(kkvd_kra_ack_no);
		kraVerLinkTbl.setCount(1);
		kraVerLinkTbl.setCrtd_ts(time);
		kraVerLinkTbl.setShortlink(shortlink);
		kraVerLinkTbl.setUpdt_ts(time);
		kraVerLinkTbl.setKvld_link_chnl(notificationType);// M/E
		kraVerLinkTbl.setKlvd_kkvd_seq_no(seqno);
		kraVerLinkTbl.setKlvd_rcrd_type(recordType);
		kraVerLinkRepository.save(kraVerLinkTbl);
		
		if (notificationType.equals(MOBILE_TYPE)) {
			notificationService.sendMobileNotification(mobile, shortlink, UUID.randomUUID().toString(), mId, kra_helpDesk_Id);
		} else if (notificationType.equals(EMAIL_TYPE)) {
			notificationService.sendEmailNotification(email, shortlink, UUID.randomUUID().toString(),  kraVerLinkTbl.getCrtd_ts(), mId, kra_helpDesk_Id);
		}
		return true;
	}

	/**
	 * updateKraVerLinkTbl
	 * 
	 * @param oldkraVerLinkTbl
	 * @param notificationType
	 * @param mobile
	 * @param email
	 * @param mId 
	 * @return
	 */
	public boolean updateKraVerLinkTbl(KraVerLinkTbl oldkraVerLinkTbl, String notificationType, String mobile,
			String email, String recordType, String mName, String kra_helpDesk_Id) {
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		KraVerLinkTbl kraVerLinkTbl = new KraVerLinkTbl();
		int count = oldkraVerLinkTbl.getCount();
		kraVerLinkTbl.setAck_no(oldkraVerLinkTbl.getAck_no());
		kraVerLinkTbl.setCount(count + 1);
		kraVerLinkTbl.setCrtd_ts(oldkraVerLinkTbl.getCrtd_ts());
		kraVerLinkTbl.setShortlink(oldkraVerLinkTbl.getShortlink());
		kraVerLinkTbl.setUpdt_ts(time);
		kraVerLinkTbl.setKvld_link_chnl(notificationType);
		kraVerLinkTbl.setKlvd_kkvd_seq_no(oldkraVerLinkTbl.getKlvd_kkvd_seq_no());
		kraVerLinkTbl.setKlvd_rcrd_type(recordType);
		//kraVerLinkRepository.updateKraVerLinkTbl(kraVerLinkTbl.getCount(), kra_helpDesk_Id);
		kraVerLinkRepository.save(kraVerLinkTbl);
		
		if (notificationType.equals(MOBILE_TYPE)) {
			notificationService.sendMobileNotification(mobile, kraVerLinkTbl.getShortlink(),
					UUID.randomUUID().toString(), mName, kra_helpDesk_Id);
		} else if (notificationType.equals(EMAIL_TYPE)) {
			notificationService.sendEmailNotification(email, kraVerLinkTbl.getShortlink(),
					UUID.randomUUID().toString(), kraVerLinkTbl.getCrtd_ts(), mName, kra_helpDesk_Id);
		}
		
		return true;
	}

}
