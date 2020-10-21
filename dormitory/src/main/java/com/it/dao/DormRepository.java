package com.it.dao;

import java.math.BigDecimal;
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
	
	@Query("SELECT dorm FROM DormEntity dorm WHERE dorm.dorm_name LIKE %:dormName% "
			+ " AND ((dorm.dorm_pricemonth_start >= :priceStart)  OR (dorm.dorm_pricemonth_end >= :priceEnd) )")
	List<DormEntity> searchDormTypePermonth(
			@Param("dormName")String dormName,
			@Param("priceStart")BigDecimal priceStart,
			@Param("priceEnd")BigDecimal priceEnd);
	
	@Query("SELECT dorm FROM DormEntity dorm WHERE dorm.dorm_name LIKE %:dormName% "
			+ " AND ((dorm.dorm_pricedate_start >= :priceStart)  OR (dorm.dorm_pricedate_end >= :priceEnd) )")
	List<DormEntity> searchDormTypePerday(
			@Param("dormName")String dormName,
			@Param("priceStart")BigDecimal priceStart,
			@Param("priceEnd")BigDecimal priceEnd);
}
