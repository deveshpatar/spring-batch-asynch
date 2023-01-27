package com.devesh.batch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.devesh.batch.service.ReminderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Ascra_DeveshP
 *
 */
@Slf4j
@Configuration
@EnableScheduling
public class SchedulerConfig {
	
	@Autowired
	private ReminderService reminderService;

	@Scheduled(fixedDelay = 5000, initialDelay = 5000)
	public void scheduleByFixedRate() throws Exception {
		log.info("Reminder Batch job starting...");
		
		reminderService.sendReminderEmailNotification();
		
		log.info("Reminder Batch job executed successfully...");

		System.exit(1);
	}

}
