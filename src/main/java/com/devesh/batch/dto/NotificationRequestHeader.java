package com.devesh.batch.dto;

public class NotificationRequestHeader {


	private String templateId;
	private String srcAppName;
	private String channelId;
	private String messageType;
	private int priority;
	private String requestId;
	private String timestamp;
	private String userId;
	
	public NotificationRequestHeader() {
	}

	public NotificationRequestHeader(String templateId, String srcAppName, String channelId,
			int priority, String userId, String messageType) {
		super();
		this.templateId = templateId;
		this.srcAppName = srcAppName;
		this.channelId = channelId;
		this.priority = priority;
		this.userId = userId;
		this.messageType = messageType;
	}

	// Getter Methods

	public String getTemplateId() {
		return templateId;
	}

	public String getSrcAppName() {
		return srcAppName;
	}

	public String getChannelId() {
		return channelId;
	}

	public String getMessageType() {
		return messageType;
	}

	public int getPriority() {
		return priority;
	}

	public String getRequestId() {
		return requestId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public String getUserId() {
		return userId;
	}

	// Setter Methods

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public void setSrcAppName(String srcAppName) {
		this.srcAppName = srcAppName;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
