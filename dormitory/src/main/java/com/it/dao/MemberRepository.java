package com.it.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.it.entity.DormEntity;
import com.it.entity.MemberEntity;

public interface MemberRepository extends CrudRepository<MemberEntity, Integer>{
	@Query("SELECT mem FROM MemberEntity mem WHERE mem.dorm_id = :dorm_id ")
	List<MemberEntity> findMemBydormId(@Param("dorm_id") Integer dorm_id);
	
	@Query("SELECT mem FROM MemberEntity mem WHERE mem.id = :id ")
	List<MemberEntity> findMemById(@Param("id") Integer id);

}
