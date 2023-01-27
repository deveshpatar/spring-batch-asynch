package com.devesh.batch.service;

import java.sql.Timestamp;

/**
 * 
 * @author Ascra_AkramF
 *
 */
public interface NotificationService {
	/**
	 * sendMobileNotification
	 * @param mobile
	 * @param shortlink
	 * @param strTimestamp
	 * @param uuid
	 * @param mId 
	 * @return
	 */
	public boolean sendMobileNotification(String mobile, String shortlink, String uuid, String mId, String kra_helpDesk_Id);
	/**
	 * sendEmailNotification
	 * @param email
	 * @param shortlink
	 * @param strTimestamp
	 * @param uuid
	 * @param timestamp 
	 * @param mId 
	 * @return
	 */
	public boolean sendEmailNotification(String email, String shortlink, String uuid, Timestamp timestamp, String mId, String kra_helpDesk_Id);

}
