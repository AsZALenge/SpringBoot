package com.it.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.it.entity.DormEntity;
import com.it.entity.MemberEntity;

public interface DormRepository extends CrudRepository<DormEntity, Integer>{

	@Query("SELECT dorm FROM DormEntity dorm WHERE dorm.id = :id ")
	DormEntity findDormByUserId(@Param("id") Integer id);
	
	@Query("SELECT dorm FROM DormEntity dorm WHERE dorm.dorm_id = :dorm_id ")
	List<DormEntity> getDormByDormID(@Param("dorm_id") Integer dorm_id);
	
	@Query("SELECT dorm FROM DormEntity dorm WHERE dorm.type_id = :type_id ")
	List<DormEntity> findDormByTypeId(@Param("type_id") Integer type_id);
}
