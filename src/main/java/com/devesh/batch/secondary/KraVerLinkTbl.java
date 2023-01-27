package com.devesh.batch.secondary;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kra_ver_link_tbl")
public class KraVerLinkTbl {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ack_no;
	private String shortlink;
	private Timestamp crtd_ts;
	private Timestamp updt_ts;
	private Long klvd_kkvd_seq_no;
	private String kvld_link_chnl;
	private int count;
	private String klvd_rcrd_type;
	private String ntfn_status;

	public String getNtfn_status() {
		return ntfn_status;
	}

	public void setNtfn_status(String ntfn_status) {
		this.ntfn_status = ntfn_status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAck_no() {
		return ack_no;
	}

	public void setAck_no(String ack_no) {
		this.ack_no = ack_no;
	}

	public String getShortlink() {
		return shortlink;
	}

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}

	public Timestamp getCrtd_ts() {
		return crtd_ts;
	}

	public void setCrtd_ts(Timestamp crtd_ts) {
		this.crtd_ts = crtd_ts;
	}

	public Timestamp getUpdt_ts() {
		return updt_ts;
	}

	public void setUpdt_ts(Timestamp updt_ts) {
		this.updt_ts = updt_ts;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Long getKlvd_kkvd_seq_no() {
		return klvd_kkvd_seq_no;
	}

	public void setKlvd_kkvd_seq_no(Long klvd_kkvd_seq_no) {
		this.klvd_kkvd_seq_no = klvd_kkvd_seq_no;
	}

	public String getKvld_link_chnl() {
		return kvld_link_chnl;
	}

	public void setKvld_link_chnl(String kvld_link_chnl) {
		this.kvld_link_chnl = kvld_link_chnl;
	}

	public String getKlvd_rcrd_type() {
		return klvd_rcrd_type;
	}

	public void setKlvd_rcrd_type(String klvd_rcrd_type) {
		this.klvd_rcrd_type = klvd_rcrd_type;
	}

}
