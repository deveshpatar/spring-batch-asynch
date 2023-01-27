package com.devesh.batch.secondary;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kra_kyc_ver_dtls")
public class KraKycVerDtls {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long kkvd_sr_no;
	private String kkvd_mi_id;
	private String kkvd_sub_kua_code;
	private String kkvd_auth_type;
	private String kkvd_kyc_type;
	private String kkvd_req_txn_ref;
	private String kkvd_mode_of_kyc;
	private String kkvd_pan_no;
	private String kkvd_itd_sts;
	private String kkvd_aadhaar_seeding_sts;
	private String kkvd_name_as_per_pan;
	private String kkvd_iop_sts;
	private String kkvd_mob_no;
	private String kkvd_email_id;
	private String kkvd_mob_ver_sts;
	private String kkvd_email_ver_sts;
	private String kkvd_txn_id;
	private String kkvd_kra_ack_no;
	private String kkvd_txn_err_cd;
	private String kkvd_txn_err_msg;
	private Timestamp kkvd_res_time;
	private String kkvd_kra_sts_pending;
	private String kkvd_kyc_ver_sts;
	private String kkvd_kyc_ver_sub_sts;
	private String kkvd_kyc_name;
	private String kkvd_aadhar_holder_gender;
	private String kkvd_aadhar_holder_dob;
	private String kkvd_aadhar_holder_photo;
	private String kkvd_city;
	private String kkvd_pincode;
	private String kkvd_state;
	private String kkvd_crtd_by;
	private Timestamp kkvd_crtd_time;
	private String kkvd_updt_by;
	private Timestamp kkvd_updt_time;
	private String kkvd_res_type;
	private String kkvd_aadhar_xml_storage;
	private String kkvd_kyc_src;
	private String kkvd_mob_delv_sts;
	private String kkvd_email_delv_sts;
	private String kkvd_rcrd_type;
	
	public Long getKkvd_sr_no() {
		return kkvd_sr_no;
	}
	public void setKkvd_sr_no(Long kkvd_sr_no) {
		this.kkvd_sr_no = kkvd_sr_no;
	}
	public String getKkvd_mi_id() {
		return kkvd_mi_id;
	}
	public void setKkvd_mi_id(String kkvd_mi_id) {
		this.kkvd_mi_id = kkvd_mi_id;
	}
	public String getKkvd_sub_kua_code() {
		return kkvd_sub_kua_code;
	}
	public void setKkvd_sub_kua_code(String kkvd_sub_kua_code) {
		this.kkvd_sub_kua_code = kkvd_sub_kua_code;
	}
	public String getKkvd_auth_type() {
		return kkvd_auth_type;
	}
	public void setKkvd_auth_type(String kkvd_auth_type) {
		this.kkvd_auth_type = kkvd_auth_type;
	}
	public String getKkvd_kyc_type() {
		return kkvd_kyc_type;
	}
	public void setKkvd_kyc_type(String kkvd_kyc_type) {
		this.kkvd_kyc_type = kkvd_kyc_type;
	}
	public String getKkvd_req_txn_ref() {
		return kkvd_req_txn_ref;
	}
	public void setKkvd_req_txn_ref(String kkvd_req_txn_ref) {
		this.kkvd_req_txn_ref = kkvd_req_txn_ref;
	}
	public String getKkvd_mode_of_kyc() {
		return kkvd_mode_of_kyc;
	}
	public void setKkvd_mode_of_kyc(String kkvd_mode_of_kyc) {
		this.kkvd_mode_of_kyc = kkvd_mode_of_kyc;
	}
	public String getKkvd_pan_no() {
		return kkvd_pan_no;
	}
	public void setKkvd_pan_no(String kkvd_pan_no) {
		this.kkvd_pan_no = kkvd_pan_no;
	}
	public String getKkvd_itd_sts() {
		return kkvd_itd_sts;
	}
	public void setKkvd_itd_sts(String kkvd_itd_sts) {
		this.kkvd_itd_sts = kkvd_itd_sts;
	}
	public String getKkvd_aadhaar_seeding_sts() {
		return kkvd_aadhaar_seeding_sts;
	}
	public void setKkvd_aadhaar_seeding_sts(String kkvd_aadhaar_seeding_sts) {
		this.kkvd_aadhaar_seeding_sts = kkvd_aadhaar_seeding_sts;
	}
	public String getKkvd_name_as_per_pan() {
		return kkvd_name_as_per_pan;
	}
	public void setKkvd_name_as_per_pan(String kkvd_name_as_per_pan) {
		this.kkvd_name_as_per_pan = kkvd_name_as_per_pan;
	}
	public String getKkvd_iop_sts() {
		return kkvd_iop_sts;
	}
	public void setKkvd_iop_sts(String kkvd_iop_sts) {
		this.kkvd_iop_sts = kkvd_iop_sts;
	}
	public String getKkvd_mob_no() {
		return kkvd_mob_no;
	}
	public void setKkvd_mob_no(String kkvd_mob_no) {
		this.kkvd_mob_no = kkvd_mob_no;
	}
	public String getKkvd_email_id() {
		return kkvd_email_id;
	}
	public void setKkvd_email_id(String kkvd_email_id) {
		this.kkvd_email_id = kkvd_email_id;
	}
	public String getKkvd_mob_ver_sts() {
		return kkvd_mob_ver_sts;
	}
	public void setKkvd_mob_ver_sts(String kkvd_mob_ver_sts) {
		this.kkvd_mob_ver_sts = kkvd_mob_ver_sts;
	}
	public String getKkvd_email_ver_sts() {
		return kkvd_email_ver_sts;
	}
	public void setKkvd_email_ver_sts(String kkvd_email_ver_sts) {
		this.kkvd_email_ver_sts = kkvd_email_ver_sts;
	}
	public String getKkvd_txn_id() {
		return kkvd_txn_id;
	}
	public void setKkvd_txn_id(String kkvd_txn_id) {
		this.kkvd_txn_id = kkvd_txn_id;
	}
	public String getKkvd_kra_ack_no() {
		return kkvd_kra_ack_no;
	}
	public void setKkvd_kra_ack_no(String kkvd_kra_ack_no) {
		this.kkvd_kra_ack_no = kkvd_kra_ack_no;
	}
	public String getKkvd_txn_err_cd() {
		return kkvd_txn_err_cd;
	}
	public void setKkvd_txn_err_cd(String kkvd_txn_err_cd) {
		this.kkvd_txn_err_cd = kkvd_txn_err_cd;
	}
	public String getKkvd_txn_err_msg() {
		return kkvd_txn_err_msg;
	}
	public void setKkvd_txn_err_msg(String kkvd_txn_err_msg) {
		this.kkvd_txn_err_msg = kkvd_txn_err_msg;
	}
	public Timestamp getKkvd_res_time() {
		return kkvd_res_time;
	}
	public void setKkvd_res_time(Timestamp kkvd_res_time) {
		this.kkvd_res_time = kkvd_res_time;
	}
	public String getKkvd_kra_sts_pending() {
		return kkvd_kra_sts_pending;
	}
	public void setKkvd_kra_sts_pending(String kkvd_kra_sts_pending) {
		this.kkvd_kra_sts_pending = kkvd_kra_sts_pending;
	}
	public String getKkvd_kyc_ver_sts() {
		return kkvd_kyc_ver_sts;
	}
	public void setKkvd_kyc_ver_sts(String kkvd_kyc_ver_sts) {
		this.kkvd_kyc_ver_sts = kkvd_kyc_ver_sts;
	}
	public String getKkvd_kyc_ver_sub_sts() {
		return kkvd_kyc_ver_sub_sts;
	}
	public void setKkvd_kyc_ver_sub_sts(String kkvd_kyc_ver_sub_sts) {
		this.kkvd_kyc_ver_sub_sts = kkvd_kyc_ver_sub_sts;
	}
	public String getKkvd_kyc_name() {
		return kkvd_kyc_name;
	}
	public void setKkvd_kyc_name(String kkvd_kyc_name) {
		this.kkvd_kyc_name = kkvd_kyc_name;
	}
	public String getKkvd_aadhar_holder_gender() {
		return kkvd_aadhar_holder_gender;
	}
	public void setKkvd_aadhar_holder_gender(String kkvd_aadhar_holder_gender) {
		this.kkvd_aadhar_holder_gender = kkvd_aadhar_holder_gender;
	}
	public String getKkvd_aadhar_holder_dob() {
		return kkvd_aadhar_holder_dob;
	}
	public void setKkvd_aadhar_holder_dob(String kkvd_aadhar_holder_dob) {
		this.kkvd_aadhar_holder_dob = kkvd_aadhar_holder_dob;
	}
	public String getKkvd_aadhar_holder_photo() {
		return kkvd_aadhar_holder_photo;
	}
	public void setKkvd_aadhar_holder_photo(String kkvd_aadhar_holder_photo) {
		this.kkvd_aadhar_holder_photo = kkvd_aadhar_holder_photo;
	}
	public String getKkvd_city() {
		return kkvd_city;
	}
	public void setKkvd_city(String kkvd_city) {
		this.kkvd_city = kkvd_city;
	}
	public String getKkvd_pincode() {
		return kkvd_pincode;
	}
	public void setKkvd_pincode(String kkvd_pincode) {
		this.kkvd_pincode = kkvd_pincode;
	}
	public String getKkvd_state() {
		return kkvd_state;
	}
	public void setKkvd_state(String kkvd_state) {
		this.kkvd_state = kkvd_state;
	}
	public String getKkvd_crtd_by() {
		return kkvd_crtd_by;
	}
	public void setKkvd_crtd_by(String kkvd_crtd_by) {
		this.kkvd_crtd_by = kkvd_crtd_by;
	}
	public Timestamp getKkvd_crtd_time() {
		return kkvd_crtd_time;
	}
	public void setKkvd_crtd_time(Timestamp kkvd_crtd_time) {
		this.kkvd_crtd_time = kkvd_crtd_time;
	}
	public String getKkvd_updt_by() {
		return kkvd_updt_by;
	}
	public void setKkvd_updt_by(String kkvd_updt_by) {
		this.kkvd_updt_by = kkvd_updt_by;
	}
	public Timestamp getKkvd_updt_time() {
		return kkvd_updt_time;
	}
	public void setKkvd_updt_time(Timestamp kkvd_updt_time) {
		this.kkvd_updt_time = kkvd_updt_time;
	}
	public String getKkvd_res_type() {
		return kkvd_res_type;
	}
	public void setKkvd_res_type(String kkvd_res_type) {
		this.kkvd_res_type = kkvd_res_type;
	}
	public String getKkvd_aadhar_xml_storage() {
		return kkvd_aadhar_xml_storage;
	}
	public void setKkvd_aadhar_xml_storage(String kkvd_aadhar_xml_storage) {
		this.kkvd_aadhar_xml_storage = kkvd_aadhar_xml_storage;
	}
	public String getKkvd_kyc_src() {
		return kkvd_kyc_src;
	}
	public void setKkvd_kyc_src(String kkvd_kyc_src) {
		this.kkvd_kyc_src = kkvd_kyc_src;
	}
	public String getKkvd_mob_delv_sts() {
		return kkvd_mob_delv_sts;
	}
	public void setKkvd_mob_delv_sts(String kkvd_mob_delv_sts) {
		this.kkvd_mob_delv_sts = kkvd_mob_delv_sts;
	}
	public String getKkvd_email_delv_sts() {
		return kkvd_email_delv_sts;
	}
	public void setKkvd_email_delv_sts(String kkvd_email_delv_sts) {
		this.kkvd_email_delv_sts = kkvd_email_delv_sts;
	}
	
	public String getKkvd_rcrd_type() {
		return kkvd_rcrd_type;
	}
	public void setKkvd_rcrd_type(String kkvd_rcrd_type) {
		this.kkvd_rcrd_type = kkvd_rcrd_type;
	}
	@Override
	public String toString() {
		return "KraKycVerDtls [kkvd_sr_no=" + kkvd_sr_no + ", kkvd_mi_id=" + kkvd_mi_id + ", kkvd_sub_kua_code="
				+ kkvd_sub_kua_code + ", kkvd_auth_type=" + kkvd_auth_type + ", kkvd_kyc_type=" + kkvd_kyc_type
				+ ", kkvd_req_txn_ref=" + kkvd_req_txn_ref + ", kkvd_mode_of_kyc=" + kkvd_mode_of_kyc + ", kkvd_pan_no="
				+ kkvd_pan_no + ", kkvd_itd_sts=" + kkvd_itd_sts + ", kkvd_aadhaar_seeding_sts="
				+ kkvd_aadhaar_seeding_sts + ", kkvd_name_as_per_pan=" + kkvd_name_as_per_pan + ", kkvd_iop_sts="
				+ kkvd_iop_sts + ", kkvd_mob_no=" + kkvd_mob_no + ", kkvd_email_id=" + kkvd_email_id
				+ ", kkvd_mob_ver_sts=" + kkvd_mob_ver_sts + ", kkvd_email_ver_sts=" + kkvd_email_ver_sts
				+ ", kkvd_txn_id=" + kkvd_txn_id + ", kkvd_kra_ack_no=" + kkvd_kra_ack_no + ", kkvd_txn_err_cd="
				+ kkvd_txn_err_cd + ", kkvd_txn_err_msg=" + kkvd_txn_err_msg + ", kkvd_res_time=" + kkvd_res_time
				+ ", kkvd_kra_sts_pending=" + kkvd_kra_sts_pending + ", kkvd_kyc_ver_sts=" + kkvd_kyc_ver_sts
				+ ", kkvd_kyc_ver_sub_sts=" + kkvd_kyc_ver_sub_sts + ", kkvd_kyc_name=" + kkvd_kyc_name
				+ ", kkvd_aadhar_holder_gender=" + kkvd_aadhar_holder_gender + ", kkvd_aadhar_holder_dob="
				+ kkvd_aadhar_holder_dob + ", kkvd_aadhar_holder_photo=" + kkvd_aadhar_holder_photo + ", kkvd_city="
				+ kkvd_city + ", kkvd_pincode=" + kkvd_pincode + ", kkvd_state=" + kkvd_state + ", kkvd_crtd_by="
				+ kkvd_crtd_by + ", kkvd_crtd_time=" + kkvd_crtd_time + ", kkvd_updt_by=" + kkvd_updt_by
				+ ", kkvd_updt_time=" + kkvd_updt_time + ", kkvd_res_type=" + kkvd_res_type
				+ ", kkvd_aadhar_xml_storage=" + kkvd_aadhar_xml_storage + ", kkvd_kyc_src=" + kkvd_kyc_src
				+ ", kkvd_mob_delv_sts=" + kkvd_mob_delv_sts + ", kkvd_email_delv_sts=" + kkvd_email_delv_sts
				+ ", kkvd_rcrd_type=" + kkvd_rcrd_type + "]";
	}
	

}
