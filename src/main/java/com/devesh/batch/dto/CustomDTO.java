package com.devesh.batch.dto;

public class CustomDTO {

	private String bpId;
	private String ackNum;
	private String capAuthId;
	private String pan;
	private String mobileNum;
	private String emailId;
	private String recordtype;

	public String getBpId() {
		return bpId;
	}

	public void setBpId(String bpId) {
		this.bpId = bpId;
	}

	public String getAckNum() {
		return ackNum;
	}

	public void setAckNum(String ackNum) {
		this.ackNum = ackNum;
	}

	public String getCapAuthId() {
		return capAuthId;
	}

	public void setCapAuthId(String capAuthId) {
		this.capAuthId = capAuthId;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRecordtype() {
		return recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	@Override
	public String toString() {
		return "CustomDTO [bpId=" + bpId + ", ackNum=" + ackNum + ", capAuthId=" + capAuthId + ", pan=" + pan
				+ ", mobileNum=" + mobileNum + ", emailId=" + emailId + ", recordtype=" + recordtype + "]";
	}

}
