package com.devesh.batch.config.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.devesh.batch.dto.CustomDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@StepScope
public class MyCustomReader extends JdbcCursorItemReader<CustomDTO> implements ItemReader<CustomDTO> {

	public MyCustomReader(@Autowired DataSource primaryDataSource, @Value("${kra.reader.reg.query}") String kraReaderRegQuery, @Value("${kra.reader.mod.query}") String kraReaderModQuery) {
		
		setDataSource(primaryDataSource);
		
		/*setSql("SELECT kmit.kmit_bp_id bpId, kmit.kmit_ack_num ackNum, kmit.kmit_cap_authid capAuthId, kmit.kmit_pan pan, kait.kait_mobile_num mobileNum, kait.kait_email_id emailId "
				+ "FROM kra_addr_intrm_tbl kait,kra_mstr_intrm_tbl kmit,kra_proof_tbl kpt WHERE kait.kait_bp_id=kmit.kmit_bp_id "
				+ "AND kait.kait_instr_id=kmit.kmit_instr_id AND kpt.kpt_bp_id=kmit.kmit_bp_id AND kpt.kpt_instr_id=kmit.kmit_instr_id AND kmit.kmit_upd_tmstmp > '2022-09-05' "
				+ "AND (kmit_instr_stat IN ('3','6') or (kmit_form_rcvd_rmk1='KYC Pending')) AND (kmit.kmit_ekyc_type IN ('5','4') )"); */
		
		/*setSql("SELECT distinct kmit.kmit_bp_id bpId, kmit.kmit_ack_num ackNum, kmit.kmit_cap_authid capAuthId, kmit.kmit_pan pan, kait.kait_mobile_num mobileNum, kait.kait_email_id emailId "
				+ "FROM prdkra.kra_addr_intrm_tbl kait,prdkra.kra_mstr_intrm_tbl kmit,prdkra.kra_proof_tbl kpt "
				+ "WHERE kait.kait_bp_id=kmit.kmit_bp_id AND kait.kait_instr_id=kmit.kmit_instr_id and kmit.kmit_indvl_ind = '1' "
				+ "AND kpt.kpt_bp_id=kmit.kmit_bp_id AND kpt.kpt_instr_id=kmit.kmit_instr_id "
				+ "AND kmit.kmit_upd_tmstmp > (SELECT distinct NTH_VALUE(bse.last_updated,2) OVER(ORDER BY last_updated DESC RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) FROM prdkra.batch_step_execution bse "
				+ "WHERE bse.step_name='Batch-Process-Steps' and bse.exit_code='COMPLETED' limit 1) "
				+ "AND (kmit_instr_stat = '3' or (kmit_instr_stat ='6' and kmit_form_rcvd_rmk1 IN ('2','3', '5'))) "
				+ "AND (kmit.kmit_ekyc_type IN ('5','4') OR (kmit.kmit_ekyc_type IN ('0','3') "
				+ "AND kpt.kpt_prf_typ in ('0' ,'1','2') AND kpt.kpt_prf_cd IN ('1','26'))) ");*/
		
		log.info("R : " + kraReaderRegQuery);
		log.info("M : " + kraReaderModQuery);
		
		//setSql(kraReaderRegQuery);
		setSql(kraReaderRegQuery + " UNION " + kraReaderModQuery);
		setFetchSize(VALUE_NOT_SET);

		setRowMapper(new CutomerRowMapper());
	}

	public class CutomerRowMapper implements RowMapper<CustomDTO> {
		@Override
		public CustomDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			CustomDTO custom = new CustomDTO();
			custom.setBpId(rs.getString("bpid"));
			custom.setAckNum(rs.getString("acknum"));
			custom.setCapAuthId(rs.getString("capauthid"));
			custom.setPan(rs.getString("pan"));
			custom.setMobileNum(rs.getString("mobilenum"));
			custom.setEmailId(rs.getString("emailid"));
			custom.setRecordtype(rs.getString("recordtype"));
			return custom;
		}
	}
}