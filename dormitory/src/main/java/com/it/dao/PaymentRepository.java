package com.it.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.it.entity.PaymentEntity;

public interface PaymentRepository extends CrudRepository<PaymentEntity, Integer>{
	@Query("SELECT pay FROM PaymentEntity pay WHERE pay.dorm_id = :dorm_id ")
	List<PaymentEntity> findMemBydormId(@Param("dorm_id") Integer dorm_id);

}
