package com.devesh.batch.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.devesh.batch.dto.NotificationRequestBody;
import com.devesh.batch.dto.NotificationRequestHeader;
import com.devesh.batch.dto.NotificationRequestKeyValuePare;
import com.devesh.batch.dto.NotificationRequestPayLoad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NotificationServiceImpl implements NotificationService {

	// Email Configuration
	@Value("${email.notification.request.header.template-id}")
	private String emailTemplateId;
	@Value("${email.notification.request.header.src-app-name}")
	private String emailSrcAppName;
	@Value("${email.notification.request.header.channel-id}")
	private String emailChannelId;
	@Value("${email.notification.request.header.priority}")
	private int emailPriority;
	@Value("${email.notification.request.header.user-id}")
	private String emailUserId;

	// Mobile Configuration
	@Value("${mobile.notification.request.header.template-id}")
	private String mobileTemplateId;
	@Value("${mobile.notification.request.header.src-app-name}")
	private String mobileSrcAppName;
	@Value("${mobile.notification.request.header.channel-id}")
	private String mobileChannelId;
	@Value("${mobile.notification.request.header.priority}")
	private int mobilePriority;
	@Value("${mobile.notification.request.header.user-id}")
	private String mobileUserId;

	@Value("${short.link.base.mobile.url}")
	private String mobileLink;
	@Value("${short.link.base.email.url}")
	private String emailLink;

	@Value("${notification.rest.api.url}")
	private String restCallURL;

	@Value("${notification.allow.to.send}")
	private boolean isAllowToSendNofication;
	
	private NotificationRequestHeader mobileNotificationRequestHeader;

	private NotificationRequestHeader emailNotificationRequestHeader;

	@Autowired
	private RestTemplate restTemplate;

	public NotificationServiceImpl() {
	}

	@Override
	public boolean sendMobileNotification(String mobile, String shortlink, String uuid, String mId,
			String kra_helpDesk_Id) {
		if (ObjectUtils.isEmpty(mobile)) {
			return false;
		}

		log.info(mobile);
		this.mobileNotificationRequestHeader = new NotificationRequestHeader(mobileTemplateId, mobileSrcAppName,
				mobileChannelId, mobilePriority, mobileUserId, "sms");
		this.mobileNotificationRequestHeader.setTimestamp(new Date().toString());
		this.mobileNotificationRequestHeader.setRequestId(uuid);
		NotificationRequestPayLoad notificationRequestPayLoad = new NotificationRequestPayLoad();

		notificationRequestPayLoad.setMobileNo(mobile);
		List<NotificationRequestKeyValuePare> mapElements = new ArrayList<>();
		mapElements.add(new NotificationRequestKeyValuePare("DP_NAME", mId));
		mapElements.add(new NotificationRequestKeyValuePare("URL", emailLink + shortlink));
		notificationRequestPayLoad.setMapElements(mapElements);

		NotificationRequestBody notificationRequestBody = new NotificationRequestBody();
		notificationRequestBody.setHeader(mobileNotificationRequestHeader);
		notificationRequestBody.setPayload(notificationRequestPayLoad);

		return sendNotification(notificationRequestBody);
	}

	@Override
	public boolean sendEmailNotification(String email, String shortlink, String uuid, Timestamp timestamp, String mId,
			String kra_helpDesk_Id) {
		if (ObjectUtils.isEmpty(email)) {
			return false;
		}
		this.emailNotificationRequestHeader = new NotificationRequestHeader(emailTemplateId, emailSrcAppName,
				emailChannelId, emailPriority, emailUserId, "email");
		this.emailNotificationRequestHeader.setTimestamp(new Date().toString());
		this.emailNotificationRequestHeader.setRequestId(uuid);
		NotificationRequestPayLoad notificationRequestPayLoad = new NotificationRequestPayLoad();
		notificationRequestPayLoad.setEmailTO(email); //
		List<NotificationRequestKeyValuePare> mapElements = new ArrayList<>();
		mapElements.add(new NotificationRequestKeyValuePare("DP_NAME", mId));
		mapElements.add(new NotificationRequestKeyValuePare("DP_EMAILID", kra_helpDesk_Id));
		mapElements.add(new NotificationRequestKeyValuePare("URL", emailLink + shortlink));
		mapElements.add(new NotificationRequestKeyValuePare("CREATED_DATE", emailLink + shortlink));
		notificationRequestPayLoad.setMapElements(mapElements);
		NotificationRequestBody notificationRequestBody = new NotificationRequestBody();
		notificationRequestBody.setHeader(emailNotificationRequestHeader);
		notificationRequestBody.setPayload(notificationRequestPayLoad);
		
		return sendNotification(notificationRequestBody);
	}

	/**
	 * sendNotification
	 * 
	 * @param notificationRequestBody
	 * @return
	 */
	public boolean sendNotification(NotificationRequestBody notificationRequestBody) {
		log.info("Notification API Url :" + restCallURL);
		try {
			HttpEntity<NotificationRequestBody> request = new HttpEntity<>(notificationRequestBody);
			log.info(request.getBody().toString());
			log.info("Sending Notification... Start ");
			Thread.sleep(500);
			ResponseEntity<String> response = restTemplate.exchange(restCallURL, HttpMethod.POST, request, String.class);
			boolean status = response.getStatusCode().equals(HttpStatus.OK);
			if (status) {
				log.info("Notification Sent Successfully : " + response.getStatusCode());
			}
			return status;
		} catch (RestClientException | InterruptedException e) {
			log.info("Error sending notification :  " + e.getMessage());
			return false;
		}
	}

}
