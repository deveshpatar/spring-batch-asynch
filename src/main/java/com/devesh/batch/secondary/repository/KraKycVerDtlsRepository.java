package com.devesh.batch.secondary.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devesh.batch.secondary.KraKycVerDtls;

public interface KraKycVerDtlsRepository extends JpaRepository<KraKycVerDtls, Integer> {

	@Query("select m from KraKycVerDtls m where m.kkvd_kra_ack_no=:param1")
	public KraKycVerDtls findByAckNum(@Param("param1") String ackNo, PageRequest pageRequest);
	
	@Query("select m from KraKycVerDtls m where m.kkvd_kra_ack_no=:param1")
	public Optional<KraKycVerDtls> findByAckNumber(@Param("param1") String ackNo, PageRequest pageRequest);
	
	@Query("select m from KraKycVerDtls m where m.kkvd_kra_ack_no=:ackNo")
	public KraKycVerDtls getKraKycVerDtlsByAckNo(@Param("ackNo") String ackNo);
	
	
	//@Query("select m from KraKycVerDtls m where m.kkvd_kra_ack_no=:param1")
		//public Optional<KraKycVerDtls> findByAckNum(@Param("param1") String ackNo, PageRequest pageRequest);

	@Query("select m from KraKycVerDtls m where m.kkvd_mi_id=:bpId AND m.kkvd_pan_no=:panNo order by m.kkvd_sr_no DESC")
	public Optional<KraKycVerDtls> findKraKycVerDtls(@Param("bpId") String bpId, @Param("panNo") String panNo, PageRequest pageRequest);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update KraKycVerDtls k set k.kkvd_kra_ack_no =:ackNo, k.kkvd_rcrd_type =:recordType where k.kkvd_sr_no=:serNo")
	void updateKraVerDtlsTbl(@Param("ackNo") String ackNo, @Param("recordType") String recordType, @Param("serNo") Long serNo);
	
}