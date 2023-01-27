package com.devesh.batch.secondary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bp_mstr_tbl")
public class BpMstrTbl {

	@Id
	private String bmt_bp_id;
	private String bmt_shrt_nm;

	public String getBmt_bp_id() {
		return bmt_bp_id;
	}

	public void setBmt_bp_id(String bmt_bp_id) {
		this.bmt_bp_id = bmt_bp_id;
	}

	public String getBmt_shrt_nm() {
		return bmt_shrt_nm;
	}

	public void setBmt_shrt_nm(String bmt_shrt_nm) {
		this.bmt_shrt_nm = bmt_shrt_nm;
	}
	
}
