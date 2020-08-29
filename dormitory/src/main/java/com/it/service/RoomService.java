package com.it.service;

import java.util.List;

import com.it.dto.RoomDto;;

public interface RoomService {

	public RoomDto saveRoom(RoomDto dormDto) throws Exception;

	public RoomDto updateRoom(RoomDto dormDto) throws Exception;

	public Integer deleteRoomByRoom_id(Integer room_id) throws Exception;

	public List<RoomDto> selectAllRoom() throws Exception;
	
	public RoomDto selectBySIdRoom(Integer room_id) throws Exception;
	
	public List<RoomDto> getRoomBydormId (Integer dorm_id) throws Exception;

}
