package com.devesh.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.devesh.batch.config.reader.MyCustomLinkCreator;
import com.devesh.batch.dto.NotificationDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NotificationAsyncServiceImpl implements NotificationAsyncService {

	@Autowired
	private MyCustomLinkCreator myCustomLinkCreator;

	@Override
	@Async("asyncExecutor")
	public void sendNotification(List<NotificationDto> sendNotification) {
		log.info("Total Size : " + sendNotification.size());
		sendNotification.stream().forEach(notication -> {
			log.info("Ack No" + notication.getAckNo() + "============== Start ==============" + System.nanoTime());
			myCustomLinkCreator.setLinkTableAndSendNotification(notication.getAckNo(), notication.getSrNo(),
					notication.getMobileNo(), notication.getEmailId(), notication.getRecordType(),
					notication.getBmtShrtNm());
			log.info("Ack No" + notication.getAckNo() + "========== End ==========" + System.nanoTime());
		});
		System.exit(1);
	}

}
