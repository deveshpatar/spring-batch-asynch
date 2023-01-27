package com.devesh.batch.dto;

public class NotificationRequestBody {
	NotificationRequestHeader header;
	NotificationRequestPayLoad payload;

	
	public NotificationRequestHeader getHeader() {
		return header;
	}

	public void setHeader(NotificationRequestHeader header) {
		this.header = header;
	}

	public NotificationRequestPayLoad getPayload() {
		return payload;
	}

	public void setPayload(NotificationRequestPayLoad payload) {
		this.payload = payload;
	}

	

}
