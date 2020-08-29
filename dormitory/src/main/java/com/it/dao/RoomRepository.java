package com.it.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.it.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Integer>{
	@Query("SELECT room FROM RoomEntity room WHERE room.dorm_id = :dorm_id ")
	List<RoomEntity> findRoomBydormId(@Param("dorm_id") Integer dorm_id);

}
