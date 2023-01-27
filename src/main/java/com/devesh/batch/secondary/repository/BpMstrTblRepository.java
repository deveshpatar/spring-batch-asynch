package com.devesh.batch.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devesh.batch.secondary.BpMstrTbl;

public interface BpMstrTblRepository extends JpaRepository<BpMstrTbl, String> {
	
	@Query("select bp.bmt_shrt_nm from BpMstrTbl bp where bp.bmt_bp_id=:bmtBpId")
	public String getBmtShortName(@Param("bmtBpId") String bmtBpId);
	
}