package com.devesh.batch.dto;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(value = Include.NON_NULL)
public class NotificationRequestPayLoad {

	private String mobileNo;
	private String emailTO;
	List<NotificationRequestKeyValuePare> mapElements = new ArrayList<>();

	public NotificationRequestPayLoad() {
	}

	public NotificationRequestPayLoad(String mobileNo, List<NotificationRequestKeyValuePare> mapElements) {
		super();
		this.mobileNo = mobileNo;
		this.mapElements = mapElements;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<NotificationRequestKeyValuePare> getMapElements() {
		return mapElements;
	}

	public void setMapElements(List<NotificationRequestKeyValuePare> mapElements) {
		this.mapElements = mapElements;
	}

	public String getEmailTO() {
		return emailTO;
	}

	public void setEmailTO(String emailTO) {
		this.emailTO = emailTO;
	}

	
	

}
