package com.devesh.batch.dto;

public class NotificationDto {

	private String ackNo;
	private Long srNo;
	private String mobileNo;
	private String emailId;
	private String recordType;
	private String bmtShrtNm;
	
	public NotificationDto(String ackNo, Long srNo, String mobileNo, String emailId, String recordType,
			String bmtShrtNm) {
		super();
		this.ackNo = ackNo;
		this.srNo = srNo;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.recordType = recordType;
		this.bmtShrtNm = bmtShrtNm;
	}
	public String getAckNo() {
		return ackNo;
	}
	public void setAckNo(String ackNo) {
		this.ackNo = ackNo;
	}
	public Long getSrNo() {
		return srNo;
	}
	public void setSrNo(Long srNo) {
		this.srNo = srNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getBmtShrtNm() {
		return bmtShrtNm;
	}
	public void setBmtShrtNm(String bmtShrtNm) {
		this.bmtShrtNm = bmtShrtNm;
	}
	@Override
	public String toString() {
		return "NotificationDto [ackNo=" + ackNo + ", srNo=" + srNo + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", recordType=" + recordType + ", bmtShrtNm=" + bmtShrtNm + "]";
	}
	
}
