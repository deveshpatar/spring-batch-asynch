package com.devesh.batch.secondary.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.devesh.batch.secondary.KraVerLinkTbl;

public interface KraVerLinkRepository extends JpaRepository<KraVerLinkTbl, Long> {

	@Query("select k from KraVerLinkTbl k where k.ack_no=:param1 and k.kvld_link_chnl=:param2  order by k.updt_ts desc")
	public KraVerLinkTbl findByAckNo(@Param("param1") String kkvd_kra_ack_no, @Param("param2") String kvld_link_chnl,
			PageRequest pageRequest);
	
	@Query("select count(k)>0 from KraVerLinkTbl k where k.ack_no=:ackNo AND date(k.crtd_ts) = CURRENT_DATE ")
	public boolean checkAckNo(@Param("ackNo") String ackNo);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update KraVerLinkTbl k set k.count =:count where k.ack_no=:ackNo")
	void updateKraVerLinkTbl(@Param("count") int count, @Param("ackNo") String ackNo);
	
	@Query("SELECT k FROM KraVerLinkTbl k WHERE date(k.crtd_ts) != CURRENT_DATE AND k.kvld_link_chnl='E' AND k.ntfn_status='Y' AND k.count = (SELECT MAX (kv.count) FROM KraVerLinkTbl kv) order by k.crtd_ts desc")
	public List<KraVerLinkTbl> getVerLinkList(PageRequest pageRequest);
	

}
