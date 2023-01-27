package com.devesh.batch.primary;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kra_mstr_intrm_tbl")
public class MstrIntrmTbl {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long kmit_instr_id;
	private String kmit_bp_id;
	private String kmit_ack_num;
	private String kmit_indvl_ind;
	private String kmit_clnt_nm;
	private String kmit_fthr_nm;
	private String kmit_gndr_ind;
	private String kmit_mrtl_ind;
	private Date kmit_clnt_cmpy_dob;
	private String kmit_nat;
	private String kmit_resi_ind;
	private String kmit_pan;
	private String kmit_uid;
	private String kmit_clnt_pep;
	private String kmit_gros_inc_ind;
	private Date kmit_nt_wrth_dt;
	private Double kmit_nt_wrth;
	private int kmit_clnt_occ;
	private String kmit_clnt_othr_occ;
	private String kmit_othr_dtl;
	private String kmit_incrp_plc;
	private Date kmit_cmnc_date;
	private String kmit_cin;
	private int kmit_cmpy_stat;
	private String kmit_cmpy_stat_val;
	private int kmit_doc_uploaded;
	private String kmit_form_rcvd;
	private int kmit_instr_stat;
	private String kmit_cap_authid;
	private Date kmit_cap_date;
	private Timestamp kmit_cap_tmstmp;
	private String kmit_upd_authid;
	private Date kmit_upd_date;
	private Timestamp kmit_upd_tmstmp;
	private String kmit_vr_authid;
	private Date kmit_vr_date;
	private Timestamp kmit_vr_tmstmp;
	private Date kmit_dclrtn_date;
	private Date kmit_doc_rcvd_date;
	private String kmit_true_cop_rcvd;
	private String kmit_slf_cert_doc_rcvd;
	private long kmit_file_ref_id;
	private String kmit_sign_gnrtd_chckr;
	private String kmit_pan_xmpt_val;
	private String kmit_pan_xmpt_chk;
	private Double kmit_ln_num;
	private long kmit_kra_instr_stat;
	private String kmit_kra_cap_authid;
	private Timestamp kmit_kra_cap_tmstmp;
	private String kmit_kra_upd_authid;
	private Timestamp kmit_kra_upd_tmstmp;
	private String kmit_kra_vr_authid;
	private Timestamp kmit_kra_vr_tmstmp;
	private String kmit_kra_intrnl_rmk;
	private String kmit_rta_id;
	private String kmit_ipv_flag;
	private String kmit_person_ipv;
	private String kmit_desig_ipv;
	private String kmit_org_name_ipv;
	private Date kmit_date_ipv;
	private Timestamp kmit_client_act_date;
	private Timestamp kmit_client_upd_date;
	private String kmit_scan_images_uploaded;
	private String kmit_flag_old_new_record;
	private String kmit_fundcode;
	private String kmit_crtn_ip_addr;
	private String kmit_upd_ip_addr;
	private String kmit_modf_flag;
	private String kmit_modf_frm_ack_num;
	private String kmit_reg_vr_authid;
	private Timestamp kmit_reg_vr_tmstmp;
	private String kmit_kra_reg_vr_authid;
	private Timestamp kmit_kra_reg_vr_tmstmp;
	private String kmit_itd_verification_status;
	private String kmit_ekyc_type;
	private String kmit_ubo;
	private String kmit_consent_value;
	private String kmit_consent_name;
	private String kmit_consent_email;
	private String kmit_consent_mobile;
	private String kmit_is_online_kyc_reg;
	private String kmit_is_data_completely_sumbitted;
	private Double kmit_father_spouse_flag;
	private String kmit_father_spouse_prefix;
	private String kmit_clnt_prefix;
	private String kmit_mother_prefix;
	private String kmit_mother_name;
	private String kmit_mother_first_name;
	private String kmit_mother_middle_name;
	private String kmit_mother_last_name;
	private String kmit_submit_document;
	private String kmit_place_of_declaration;
	private String kmit_ismakerocrprocessed;
	private String kmit_ischeckerocrprocessed;
	public Long getKmit_instr_id() {
		return kmit_instr_id;
	}
	public void setKmit_instr_id(Long kmit_instr_id) {
		this.kmit_instr_id = kmit_instr_id;
	}
	public String getKmit_bp_id() {
		return kmit_bp_id;
	}
	public void setKmit_bp_id(String kmit_bp_id) {
		this.kmit_bp_id = kmit_bp_id;
	}
	public String getKmit_ack_num() {
		return kmit_ack_num;
	}
	public void setKmit_ack_num(String kmit_ack_num) {
		this.kmit_ack_num = kmit_ack_num;
	}
	public String getKmit_indvl_ind() {
		return kmit_indvl_ind;
	}
	public void setKmit_indvl_ind(String kmit_indvl_ind) {
		this.kmit_indvl_ind = kmit_indvl_ind;
	}
	public String getKmit_clnt_nm() {
		return kmit_clnt_nm;
	}
	public void setKmit_clnt_nm(String kmit_clnt_nm) {
		this.kmit_clnt_nm = kmit_clnt_nm;
	}
	public String getKmit_fthr_nm() {
		return kmit_fthr_nm;
	}
	public void setKmit_fthr_nm(String kmit_fthr_nm) {
		this.kmit_fthr_nm = kmit_fthr_nm;
	}
	public String getKmit_gndr_ind() {
		return kmit_gndr_ind;
	}
	public void setKmit_gndr_ind(String kmit_gndr_ind) {
		this.kmit_gndr_ind = kmit_gndr_ind;
	}
	public String getKmit_mrtl_ind() {
		return kmit_mrtl_ind;
	}
	public void setKmit_mrtl_ind(String kmit_mrtl_ind) {
		this.kmit_mrtl_ind = kmit_mrtl_ind;
	}
	public Date getKmit_clnt_cmpy_dob() {
		return kmit_clnt_cmpy_dob;
	}
	public void setKmit_clnt_cmpy_dob(Date kmit_clnt_cmpy_dob) {
		this.kmit_clnt_cmpy_dob = kmit_clnt_cmpy_dob;
	}
	public String getKmit_nat() {
		return kmit_nat;
	}
	public void setKmit_nat(String kmit_nat) {
		this.kmit_nat = kmit_nat;
	}
	public String getKmit_resi_ind() {
		return kmit_resi_ind;
	}
	public void setKmit_resi_ind(String kmit_resi_ind) {
		this.kmit_resi_ind = kmit_resi_ind;
	}
	public String getKmit_pan() {
		return kmit_pan;
	}
	public void setKmit_pan(String kmit_pan) {
		this.kmit_pan = kmit_pan;
	}
	public String getKmit_uid() {
		return kmit_uid;
	}
	public void setKmit_uid(String kmit_uid) {
		this.kmit_uid = kmit_uid;
	}
	public String getKmit_clnt_pep() {
		return kmit_clnt_pep;
	}
	public void setKmit_clnt_pep(String kmit_clnt_pep) {
		this.kmit_clnt_pep = kmit_clnt_pep;
	}
	public String getKmit_gros_inc_ind() {
		return kmit_gros_inc_ind;
	}
	public void setKmit_gros_inc_ind(String kmit_gros_inc_ind) {
		this.kmit_gros_inc_ind = kmit_gros_inc_ind;
	}
	public Date getKmit_nt_wrth_dt() {
		return kmit_nt_wrth_dt;
	}
	public void setKmit_nt_wrth_dt(Date kmit_nt_wrth_dt) {
		this.kmit_nt_wrth_dt = kmit_nt_wrth_dt;
	}
	public Double getKmit_nt_wrth() {
		return kmit_nt_wrth;
	}
	public void setKmit_nt_wrth(Double kmit_nt_wrth) {
		this.kmit_nt_wrth = kmit_nt_wrth;
	}
	public int getKmit_clnt_occ() {
		return kmit_clnt_occ;
	}
	public void setKmit_clnt_occ(int kmit_clnt_occ) {
		this.kmit_clnt_occ = kmit_clnt_occ;
	}
	public String getKmit_clnt_othr_occ() {
		return kmit_clnt_othr_occ;
	}
	public void setKmit_clnt_othr_occ(String kmit_clnt_othr_occ) {
		this.kmit_clnt_othr_occ = kmit_clnt_othr_occ;
	}
	public String getKmit_othr_dtl() {
		return kmit_othr_dtl;
	}
	public void setKmit_othr_dtl(String kmit_othr_dtl) {
		this.kmit_othr_dtl = kmit_othr_dtl;
	}
	public String getKmit_incrp_plc() {
		return kmit_incrp_plc;
	}
	public void setKmit_incrp_plc(String kmit_incrp_plc) {
		this.kmit_incrp_plc = kmit_incrp_plc;
	}
	public Date getKmit_cmnc_date() {
		return kmit_cmnc_date;
	}
	public void setKmit_cmnc_date(Date kmit_cmnc_date) {
		this.kmit_cmnc_date = kmit_cmnc_date;
	}
	public String getKmit_cin() {
		return kmit_cin;
	}
	public void setKmit_cin(String kmit_cin) {
		this.kmit_cin = kmit_cin;
	}
	public int getKmit_cmpy_stat() {
		return kmit_cmpy_stat;
	}
	public void setKmit_cmpy_stat(int kmit_cmpy_stat) {
		this.kmit_cmpy_stat = kmit_cmpy_stat;
	}
	public String getKmit_cmpy_stat_val() {
		return kmit_cmpy_stat_val;
	}
	public void setKmit_cmpy_stat_val(String kmit_cmpy_stat_val) {
		this.kmit_cmpy_stat_val = kmit_cmpy_stat_val;
	}
	public int getKmit_doc_uploaded() {
		return kmit_doc_uploaded;
	}
	public void setKmit_doc_uploaded(int kmit_doc_uploaded) {
		this.kmit_doc_uploaded = kmit_doc_uploaded;
	}
	public String getKmit_form_rcvd() {
		return kmit_form_rcvd;
	}
	public void setKmit_form_rcvd(String kmit_form_rcvd) {
		this.kmit_form_rcvd = kmit_form_rcvd;
	}
	public int getKmit_instr_stat() {
		return kmit_instr_stat;
	}
	public void setKmit_instr_stat(int kmit_instr_stat) {
		this.kmit_instr_stat = kmit_instr_stat;
	}
	public String getKmit_cap_authid() {
		return kmit_cap_authid;
	}
	public void setKmit_cap_authid(String kmit_cap_authid) {
		this.kmit_cap_authid = kmit_cap_authid;
	}
	public Date getKmit_cap_date() {
		return kmit_cap_date;
	}
	public void setKmit_cap_date(Date kmit_cap_date) {
		this.kmit_cap_date = kmit_cap_date;
	}
	public Timestamp getKmit_cap_tmstmp() {
		return kmit_cap_tmstmp;
	}
	public void setKmit_cap_tmstmp(Timestamp kmit_cap_tmstmp) {
		this.kmit_cap_tmstmp = kmit_cap_tmstmp;
	}
	public String getKmit_upd_authid() {
		return kmit_upd_authid;
	}
	public void setKmit_upd_authid(String kmit_upd_authid) {
		this.kmit_upd_authid = kmit_upd_authid;
	}
	public Date getKmit_upd_date() {
		return kmit_upd_date;
	}
	public void setKmit_upd_date(Date kmit_upd_date) {
		this.kmit_upd_date = kmit_upd_date;
	}
	public Timestamp getKmit_upd_tmstmp() {
		return kmit_upd_tmstmp;
	}
	public void setKmit_upd_tmstmp(Timestamp kmit_upd_tmstmp) {
		this.kmit_upd_tmstmp = kmit_upd_tmstmp;
	}
	public String getKmit_vr_authid() {
		return kmit_vr_authid;
	}
	public void setKmit_vr_authid(String kmit_vr_authid) {
		this.kmit_vr_authid = kmit_vr_authid;
	}
	public Date getKmit_vr_date() {
		return kmit_vr_date;
	}
	public void setKmit_vr_date(Date kmit_vr_date) {
		this.kmit_vr_date = kmit_vr_date;
	}
	public Timestamp getKmit_vr_tmstmp() {
		return kmit_vr_tmstmp;
	}
	public void setKmit_vr_tmstmp(Timestamp kmit_vr_tmstmp) {
		this.kmit_vr_tmstmp = kmit_vr_tmstmp;
	}
	public Date getKmit_dclrtn_date() {
		return kmit_dclrtn_date;
	}
	public void setKmit_dclrtn_date(Date kmit_dclrtn_date) {
		this.kmit_dclrtn_date = kmit_dclrtn_date;
	}
	public Date getKmit_doc_rcvd_date() {
		return kmit_doc_rcvd_date;
	}
	public void setKmit_doc_rcvd_date(Date kmit_doc_rcvd_date) {
		this.kmit_doc_rcvd_date = kmit_doc_rcvd_date;
	}
	public String getKmit_true_cop_rcvd() {
		return kmit_true_cop_rcvd;
	}
	public void setKmit_true_cop_rcvd(String kmit_true_cop_rcvd) {
		this.kmit_true_cop_rcvd = kmit_true_cop_rcvd;
	}
	public String getKmit_slf_cert_doc_rcvd() {
		return kmit_slf_cert_doc_rcvd;
	}
	public void setKmit_slf_cert_doc_rcvd(String kmit_slf_cert_doc_rcvd) {
		this.kmit_slf_cert_doc_rcvd = kmit_slf_cert_doc_rcvd;
	}
	public long getKmit_file_ref_id() {
		return kmit_file_ref_id;
	}
	public void setKmit_file_ref_id(long kmit_file_ref_id) {
		this.kmit_file_ref_id = kmit_file_ref_id;
	}
	public String getKmit_sign_gnrtd_chckr() {
		return kmit_sign_gnrtd_chckr;
	}
	public void setKmit_sign_gnrtd_chckr(String kmit_sign_gnrtd_chckr) {
		this.kmit_sign_gnrtd_chckr = kmit_sign_gnrtd_chckr;
	}
	public String getKmit_pan_xmpt_val() {
		return kmit_pan_xmpt_val;
	}
	public void setKmit_pan_xmpt_val(String kmit_pan_xmpt_val) {
		this.kmit_pan_xmpt_val = kmit_pan_xmpt_val;
	}
	public String getKmit_pan_xmpt_chk() {
		return kmit_pan_xmpt_chk;
	}
	public void setKmit_pan_xmpt_chk(String kmit_pan_xmpt_chk) {
		this.kmit_pan_xmpt_chk = kmit_pan_xmpt_chk;
	}
	public Double getKmit_ln_num() {
		return kmit_ln_num;
	}
	public void setKmit_ln_num(Double kmit_ln_num) {
		this.kmit_ln_num = kmit_ln_num;
	}
	public long getKmit_kra_instr_stat() {
		return kmit_kra_instr_stat;
	}
	public void setKmit_kra_instr_stat(long kmit_kra_instr_stat) {
		this.kmit_kra_instr_stat = kmit_kra_instr_stat;
	}
	public String getKmit_kra_cap_authid() {
		return kmit_kra_cap_authid;
	}
	public void setKmit_kra_cap_authid(String kmit_kra_cap_authid) {
		this.kmit_kra_cap_authid = kmit_kra_cap_authid;
	}
	public Timestamp getKmit_kra_cap_tmstmp() {
		return kmit_kra_cap_tmstmp;
	}
	public void setKmit_kra_cap_tmstmp(Timestamp kmit_kra_cap_tmstmp) {
		this.kmit_kra_cap_tmstmp = kmit_kra_cap_tmstmp;
	}
	public String getKmit_kra_upd_authid() {
		return kmit_kra_upd_authid;
	}
	public void setKmit_kra_upd_authid(String kmit_kra_upd_authid) {
		this.kmit_kra_upd_authid = kmit_kra_upd_authid;
	}
	public Timestamp getKmit_kra_upd_tmstmp() {
		return kmit_kra_upd_tmstmp;
	}
	public void setKmit_kra_upd_tmstmp(Timestamp kmit_kra_upd_tmstmp) {
		this.kmit_kra_upd_tmstmp = kmit_kra_upd_tmstmp;
	}
	public String getKmit_kra_vr_authid() {
		return kmit_kra_vr_authid;
	}
	public void setKmit_kra_vr_authid(String kmit_kra_vr_authid) {
		this.kmit_kra_vr_authid = kmit_kra_vr_authid;
	}
	public Timestamp getKmit_kra_vr_tmstmp() {
		return kmit_kra_vr_tmstmp;
	}
	public void setKmit_kra_vr_tmstmp(Timestamp kmit_kra_vr_tmstmp) {
		this.kmit_kra_vr_tmstmp = kmit_kra_vr_tmstmp;
	}
	public String getKmit_kra_intrnl_rmk() {
		return kmit_kra_intrnl_rmk;
	}
	public void setKmit_kra_intrnl_rmk(String kmit_kra_intrnl_rmk) {
		this.kmit_kra_intrnl_rmk = kmit_kra_intrnl_rmk;
	}
	public String getKmit_rta_id() {
		return kmit_rta_id;
	}
	public void setKmit_rta_id(String kmit_rta_id) {
		this.kmit_rta_id = kmit_rta_id;
	}
	public String getKmit_ipv_flag() {
		return kmit_ipv_flag;
	}
	public void setKmit_ipv_flag(String kmit_ipv_flag) {
		this.kmit_ipv_flag = kmit_ipv_flag;
	}
	public String getKmit_person_ipv() {
		return kmit_person_ipv;
	}
	public void setKmit_person_ipv(String kmit_person_ipv) {
		this.kmit_person_ipv = kmit_person_ipv;
	}
	public String getKmit_desig_ipv() {
		return kmit_desig_ipv;
	}
	public void setKmit_desig_ipv(String kmit_desig_ipv) {
		this.kmit_desig_ipv = kmit_desig_ipv;
	}
	public String getKmit_org_name_ipv() {
		return kmit_org_name_ipv;
	}
	public void setKmit_org_name_ipv(String kmit_org_name_ipv) {
		this.kmit_org_name_ipv = kmit_org_name_ipv;
	}
	public Date getKmit_date_ipv() {
		return kmit_date_ipv;
	}
	public void setKmit_date_ipv(Date kmit_date_ipv) {
		this.kmit_date_ipv = kmit_date_ipv;
	}
	public Timestamp getKmit_client_act_date() {
		return kmit_client_act_date;
	}
	public void setKmit_client_act_date(Timestamp kmit_client_act_date) {
		this.kmit_client_act_date = kmit_client_act_date;
	}
	public Timestamp getKmit_client_upd_date() {
		return kmit_client_upd_date;
	}
	public void setKmit_client_upd_date(Timestamp kmit_client_upd_date) {
		this.kmit_client_upd_date = kmit_client_upd_date;
	}
	public String getKmit_scan_images_uploaded() {
		return kmit_scan_images_uploaded;
	}
	public void setKmit_scan_images_uploaded(String kmit_scan_images_uploaded) {
		this.kmit_scan_images_uploaded = kmit_scan_images_uploaded;
	}
	public String getKmit_flag_old_new_record() {
		return kmit_flag_old_new_record;
	}
	public void setKmit_flag_old_new_record(String kmit_flag_old_new_record) {
		this.kmit_flag_old_new_record = kmit_flag_old_new_record;
	}
	public String getKmit_fundcode() {
		return kmit_fundcode;
	}
	public void setKmit_fundcode(String kmit_fundcode) {
		this.kmit_fundcode = kmit_fundcode;
	}
	public String getKmit_crtn_ip_addr() {
		return kmit_crtn_ip_addr;
	}
	public void setKmit_crtn_ip_addr(String kmit_crtn_ip_addr) {
		this.kmit_crtn_ip_addr = kmit_crtn_ip_addr;
	}
	public String getKmit_upd_ip_addr() {
		return kmit_upd_ip_addr;
	}
	public void setKmit_upd_ip_addr(String kmit_upd_ip_addr) {
		this.kmit_upd_ip_addr = kmit_upd_ip_addr;
	}
	public String getKmit_modf_flag() {
		return kmit_modf_flag;
	}
	public void setKmit_modf_flag(String kmit_modf_flag) {
		this.kmit_modf_flag = kmit_modf_flag;
	}
	public String getKmit_modf_frm_ack_num() {
		return kmit_modf_frm_ack_num;
	}
	public void setKmit_modf_frm_ack_num(String kmit_modf_frm_ack_num) {
		this.kmit_modf_frm_ack_num = kmit_modf_frm_ack_num;
	}
	public String getKmit_reg_vr_authid() {
		return kmit_reg_vr_authid;
	}
	public void setKmit_reg_vr_authid(String kmit_reg_vr_authid) {
		this.kmit_reg_vr_authid = kmit_reg_vr_authid;
	}
	public Timestamp getKmit_reg_vr_tmstmp() {
		return kmit_reg_vr_tmstmp;
	}
	public void setKmit_reg_vr_tmstmp(Timestamp kmit_reg_vr_tmstmp) {
		this.kmit_reg_vr_tmstmp = kmit_reg_vr_tmstmp;
	}
	public String getKmit_kra_reg_vr_authid() {
		return kmit_kra_reg_vr_authid;
	}
	public void setKmit_kra_reg_vr_authid(String kmit_kra_reg_vr_authid) {
		this.kmit_kra_reg_vr_authid = kmit_kra_reg_vr_authid;
	}
	public Timestamp getKmit_kra_reg_vr_tmstmp() {
		return kmit_kra_reg_vr_tmstmp;
	}
	public void setKmit_kra_reg_vr_tmstmp(Timestamp kmit_kra_reg_vr_tmstmp) {
		this.kmit_kra_reg_vr_tmstmp = kmit_kra_reg_vr_tmstmp;
	}
	public String getKmit_itd_verification_status() {
		return kmit_itd_verification_status;
	}
	public void setKmit_itd_verification_status(String kmit_itd_verification_status) {
		this.kmit_itd_verification_status = kmit_itd_verification_status;
	}
	public String getKmit_ekyc_type() {
		return kmit_ekyc_type;
	}
	public void setKmit_ekyc_type(String kmit_ekyc_type) {
		this.kmit_ekyc_type = kmit_ekyc_type;
	}
	public String getKmit_ubo() {
		return kmit_ubo;
	}
	public void setKmit_ubo(String kmit_ubo) {
		this.kmit_ubo = kmit_ubo;
	}
	public String getKmit_consent_value() {
		return kmit_consent_value;
	}
	public void setKmit_consent_value(String kmit_consent_value) {
		this.kmit_consent_value = kmit_consent_value;
	}
	public String getKmit_consent_name() {
		return kmit_consent_name;
	}
	public void setKmit_consent_name(String kmit_consent_name) {
		this.kmit_consent_name = kmit_consent_name;
	}
	public String getKmit_consent_email() {
		return kmit_consent_email;
	}
	public void setKmit_consent_email(String kmit_consent_email) {
		this.kmit_consent_email = kmit_consent_email;
	}
	public String getKmit_consent_mobile() {
		return kmit_consent_mobile;
	}
	public void setKmit_consent_mobile(String kmit_consent_mobile) {
		this.kmit_consent_mobile = kmit_consent_mobile;
	}
	public String getKmit_is_online_kyc_reg() {
		return kmit_is_online_kyc_reg;
	}
	public void setKmit_is_online_kyc_reg(String kmit_is_online_kyc_reg) {
		this.kmit_is_online_kyc_reg = kmit_is_online_kyc_reg;
	}
	public String getKmit_is_data_completely_sumbitted() {
		return kmit_is_data_completely_sumbitted;
	}
	public void setKmit_is_data_completely_sumbitted(String kmit_is_data_completely_sumbitted) {
		this.kmit_is_data_completely_sumbitted = kmit_is_data_completely_sumbitted;
	}
	public Double getKmit_father_spouse_flag() {
		return kmit_father_spouse_flag;
	}
	public void setKmit_father_spouse_flag(Double kmit_father_spouse_flag) {
		this.kmit_father_spouse_flag = kmit_father_spouse_flag;
	}
	public String getKmit_father_spouse_prefix() {
		return kmit_father_spouse_prefix;
	}
	public void setKmit_father_spouse_prefix(String kmit_father_spouse_prefix) {
		this.kmit_father_spouse_prefix = kmit_father_spouse_prefix;
	}
	public String getKmit_clnt_prefix() {
		return kmit_clnt_prefix;
	}
	public void setKmit_clnt_prefix(String kmit_clnt_prefix) {
		this.kmit_clnt_prefix = kmit_clnt_prefix;
	}
	public String getKmit_mother_prefix() {
		return kmit_mother_prefix;
	}
	public void setKmit_mother_prefix(String kmit_mother_prefix) {
		this.kmit_mother_prefix = kmit_mother_prefix;
	}
	public String getKmit_mother_name() {
		return kmit_mother_name;
	}
	public void setKmit_mother_name(String kmit_mother_name) {
		this.kmit_mother_name = kmit_mother_name;
	}
	public String getKmit_mother_first_name() {
		return kmit_mother_first_name;
	}
	public void setKmit_mother_first_name(String kmit_mother_first_name) {
		this.kmit_mother_first_name = kmit_mother_first_name;
	}
	public String getKmit_mother_middle_name() {
		return kmit_mother_middle_name;
	}
	public void setKmit_mother_middle_name(String kmit_mother_middle_name) {
		this.kmit_mother_middle_name = kmit_mother_middle_name;
	}
	public String getKmit_mother_last_name() {
		return kmit_mother_last_name;
	}
	public void setKmit_mother_last_name(String kmit_mother_last_name) {
		this.kmit_mother_last_name = kmit_mother_last_name;
	}
	public String getKmit_submit_document() {
		return kmit_submit_document;
	}
	public void setKmit_submit_document(String kmit_submit_document) {
		this.kmit_submit_document = kmit_submit_document;
	}
	public String getKmit_place_of_declaration() {
		return kmit_place_of_declaration;
	}
	public void setKmit_place_of_declaration(String kmit_place_of_declaration) {
		this.kmit_place_of_declaration = kmit_place_of_declaration;
	}
	public String getKmit_ismakerocrprocessed() {
		return kmit_ismakerocrprocessed;
	}
	public void setKmit_ismakerocrprocessed(String kmit_ismakerocrprocessed) {
		this.kmit_ismakerocrprocessed = kmit_ismakerocrprocessed;
	}
	public String getKmit_ischeckerocrprocessed() {
		return kmit_ischeckerocrprocessed;
	}
	public void setKmit_ischeckerocrprocessed(String kmit_ischeckerocrprocessed) {
		this.kmit_ischeckerocrprocessed = kmit_ischeckerocrprocessed;
	}
	
}