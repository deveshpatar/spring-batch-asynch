-- Table: prdkra.kra_ver_link_tbl

-- DROP TABLE prdkra.kra_ver_link_tbl;

CREATE TABLE IF NOT EXISTS prdkra.kra_ver_link_tbl
(
    id bigint NOT NULL,
    ack_no character varying(200),
    shortlink character varying(200),
    crtd_ts timestamp without time zone,
    updt_ts timestamp without time zone,
    count integer,
    klvd_kkvd_seq_no bigint,
    kvld_link_chnl character varying(25)
);


-- Table: prdkra.kra_kyc_ver_dtls

-- DROP TABLE prdkra.kra_kyc_ver_dtls;

CREATE TABLE IF NOT EXISTS prdkra.kra_kyc_ver_dtls
(
    kkvd_sr_no bigint NOT NULL DEFAULT nextval('kra_kyc_ver_dtls_kkvd_sr_no_seq'::regclass),
    kkvd_mi_id character varying(15) NOT NULL,
    kkvd_sub_kua_code character varying(10),
    kkvd_auth_type character varying(10),
    kkvd_kyc_type character varying(10),
    kkvd_req_txn_ref character varying(20),
    kkvd_mode_of_kyc character varying(10),
    kkvd_pan_no character varying(10),
    kkvd_itd_sts character varying(25),
    kkvd_aadhaar_seeding_sts character varying(5),
    kkvd_name_as_per_pan character varying(50),
    kkvd_iop_sts character varying(25),
    kkvd_mob_no character varying(10),
    kkvd_email_id character varying(50),
    kkvd_mob_ver_sts character varying(25),
    kkvd_email_ver_sts character varying(25),
    kkvd_txn_id character varying(25),
    kkvd_kra_ack_no character varying(15),
    kkvd_txn_err_cd character varying(10),
    kkvd_txn_err_msg character varying(50),
    kkvd_res_time timestamp without time zone,
    kkvd_kra_sts_pending character varying(10),
    kkvd_kyc_ver_sts character varying(25),
    kkvd_kyc_ver_sub_sts character varying(25),
    kkvd_kyc_name character varying(50),
    kkvd_aadhar_holder_gender character varying(10),
    kkvd_aadhar_holder_dob character varying,
    kkvd_aadhar_holder_photo character varying(15000),
    kkvd_add_line1 character varying(250),
    kkvd_add_line2 character varying(250),
    kkvd_add_line3 character varying(250),
    kkvd_city character varying(25),
    kkvd_pincode character varying(15),
    kkvd_state character varying(25),
    kkvd_crtd_by character varying(50),
    kkvd_crtd_time timestamp without time zone,
    kkvd_updt_by character varying(50),
    kkvd_updt_time timestamp with time zone,
    kkvd_res_type character varying(15),
    kkvd_aadhar_xml_storage character varying(250),
    kkvd_kyc_src character varying(25),
    kkvd_mob_delv_sts character varying(10),
    kkvd_email_delv_sts character varying(10),
    CONSTRAINT kra_kyc_ver_dtls_pkey PRIMARY KEY (kkvd_sr_no)
);