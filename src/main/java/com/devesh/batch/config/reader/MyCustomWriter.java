package com.devesh.batch.config.reader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devesh.batch.dto.NotificationDto;
import com.devesh.batch.secondary.KraKycVerDtls;
import com.devesh.batch.secondary.repository.BpMstrTblRepository;
import com.devesh.batch.service.NotificationAsyncService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MyCustomWriter implements ItemWriter<KraKycVerDtls> {
	
	@Autowired
	private BpMstrTblRepository bpMstrTblRepository;

	@Autowired
	private NotificationAsyncService notificationAsyncService;
	
	private Set<Long> duplicatHandle = new HashSet<>();

	@Override
	public void write(List<? extends KraKycVerDtls> list) throws Exception {
		log.info("Write Called Start");
		List<NotificationDto> sendNotification = new ArrayList<>();
		for (KraKycVerDtls data : list) {
			if (duplicatHandle.contains(data.getKkvd_sr_no())) {
				continue;
			}
			duplicatHandle.add(data.getKkvd_sr_no());
			String bmtShrtNm = bpMstrTblRepository.getBmtShortName(data.getKkvd_mi_id());
			log.info("bmtShrtNm " + bmtShrtNm);
			sendNotification.add(new NotificationDto(data.getKkvd_kra_ack_no(), data.getKkvd_sr_no(),
					data.getKkvd_mob_no(), data.getKkvd_email_id(), data.getKkvd_rcrd_type(), bmtShrtNm));
//			myCustomLinkCreator.setLinkTableAndSendNotification(data.getKkvd_kra_ack_no(), data.getKkvd_sr_no(),
//					data.getKkvd_mob_no(), data.getKkvd_email_id(), data.getKkvd_rcrd_type(), bmtShrtNm);
		}
		log.info("Send Notification Size"+sendNotification.size());
		notificationAsyncService.sendNotification(sendNotification);
		log.info("Write Called End");
	}
}
