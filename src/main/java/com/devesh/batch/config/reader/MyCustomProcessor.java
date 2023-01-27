package com.devesh.batch.config.reader;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.devesh.batch.dto.CustomDTO;
import com.devesh.batch.secondary.KraKycVerDtls;
import com.devesh.batch.secondary.repository.KraKycVerDtlsRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MyCustomProcessor implements ItemProcessor<CustomDTO, KraKycVerDtls> {

	@Autowired
	private KraKycVerDtlsRepository kraKycRepository;

	@Autowired
	private KraKycVerDtlsRepository kraKycVerDtlsRepository;

	@Override
	public KraKycVerDtls process(CustomDTO custom) throws Exception {
		Optional<KraKycVerDtls> optionalManager = kraKycRepository.findByAckNumber(custom.getAckNum(),
				PageRequest.of(0, 1));
		
		KraKycVerDtls kraKycVerDtls = null;
		Timestamp timeStamp = new Timestamp(new Date().getTime());
		if (optionalManager.isPresent()) {
			log.info("When records exists in KraKycVerDtls table ...");
			kraKycVerDtls = optionalManager.get();
			kraKycVerDtls.setKkvd_mob_no(custom.getMobileNum());
			kraKycVerDtls.setKkvd_email_id(custom.getEmailId());
			kraKycVerDtls.setKkvd_rcrd_type(custom.getRecordtype());
			kraKycVerDtls.setKkvd_mob_ver_sts("N");
			kraKycVerDtls.setKkvd_email_ver_sts("N");
			kraKycVerDtls.setKkvd_updt_time(timeStamp);
		} else {
			log.info("When records does not exist in KraKycVerDtls table ...");
			kraKycVerDtls = new KraKycVerDtls();
			kraKycVerDtls.setKkvd_mi_id(custom.getBpId());
			kraKycVerDtls.setKkvd_pan_no(custom.getPan());
			kraKycVerDtls.setKkvd_mob_no(custom.getMobileNum());
			kraKycVerDtls.setKkvd_email_id(custom.getEmailId());
			kraKycVerDtls.setKkvd_kra_ack_no(custom.getAckNum());
			kraKycVerDtls.setKkvd_rcrd_type(custom.getRecordtype());
			kraKycVerDtls.setKkvd_mob_ver_sts("N");
			kraKycVerDtls.setKkvd_email_ver_sts("N");
			kraKycVerDtls.setKkvd_crtd_by("SL_UTILITY");
			kraKycVerDtls.setKkvd_crtd_time(timeStamp);
			kraKycVerDtls.setKkvd_updt_by("SL_UTILITY");
			kraKycVerDtls.setKkvd_updt_time(timeStamp);
			kraKycVerDtls.setKkvd_kyc_src("SL_UTILITY");
			kraKycVerDtls.setKkvd_mob_delv_sts("N");
			kraKycVerDtls.setKkvd_email_delv_sts("N");
		}
		kraKycVerDtlsRepository.save(kraKycVerDtls);
		return kraKycVerDtls;
	}
}
