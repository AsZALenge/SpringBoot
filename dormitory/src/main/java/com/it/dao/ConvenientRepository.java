package com.it.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.it.entity.ConvenientEntity;
import com.it.entity.RoomEntity;

public interface ConvenientRepository extends CrudRepository<ConvenientEntity, Integer>{
	
//	@Query("SELECT con FROM ConvenientEntity con WHERE con.dorm_id = :dorm_id ")
//	ConvenientEntity findConByDormId(@Param("dorm_id") Integer dorm_id);

	@Query("SELECT con FROM ConvenientEntity con WHERE con.dorm_id = :dorm_id ")
	List<ConvenientEntity> findConByDormId(@Param("dorm_id") Integer dorm_id);
}
