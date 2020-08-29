package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.dao.RoomRepository;
import com.it.dto.DormDto;
import com.it.dto.RoomDto;
import com.it.entity.DormEntity;
import com.it.entity.RoomEntity;
import com.it.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired(required=false)
	RoomRepository roomRepository;

	@Override
	public RoomDto saveRoom(RoomDto roomDto) throws Exception {
		if (roomDto != null) {
			RoomEntity entity = convertDtoToEntit(roomDto);
			roomRepository.save(entity);
		}
		return roomDto;
	}

	@Override
	public RoomDto updateRoom(RoomDto roomDto) throws Exception {
		if (roomDto != null && roomDto.getRoom_id() > 0) {
			RoomEntity entity = convertDtoToEntit(roomDto);
			roomRepository.save(entity);
		}else {
			throw new NullPointerException("updateRoom :: RoomDto is Null or room_id < 0 !");
		}
		return roomDto;
	}

	@Override
	public Integer deleteRoomByRoom_id(Integer room_id) throws Exception {
		if (room_id > 0) { 
			roomRepository.deleteById(room_id);
		}else {
			throw new NullPointerException("deleteRoomByRoom_id :: Room_idd < 0 !");
		}
		return room_id;
	}

	@Override
	public List<RoomDto> selectAllRoom() throws Exception {
		List<RoomDto> rooms = new ArrayList<>();
		List<RoomEntity> entities = (List<RoomEntity>) roomRepository.findAll();
		if (entities != null) {
			rooms = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return rooms;
	}

	private RoomDto convertEntityToDto(RoomEntity entity) {
		RoomDto dto = new RoomDto();
		if (entity != null) {
			dto.setRoom_id(entity.getRoom_id());
			dto.setDorm_id(entity.getDorm_id());
			dto.setRoom_num(entity.getRoom_num());
			dto.setRoom_img(entity.getRoom_img());
			dto.setRoom_price(entity.getRoom_price());
			dto.setRoom_waterheater(entity.getRoom_waterheater());
			dto.setRoom_tv(entity.getRoom_tv());
			dto.setRoom_refrigerator(entity.getRoom_refrigerator());
			dto.setRoom_air(entity.getRoom_air());
			dto.setRoom_fan(entity.getRoom_fan());
			dto.setRoom_status(entity.getRoom_status());


		}
		return dto;
	}

	private RoomEntity convertDtoToEntit(RoomDto dto) {
		RoomEntity entity = new RoomEntity();
		if (dto != null) {
			entity.setRoom_id(dto.getRoom_id());
			entity.setDorm_id(dto.getDorm_id());
			entity.setRoom_num(dto.getRoom_num());
			entity.setRoom_img(dto.getRoom_img());
			entity.setRoom_price(dto.getRoom_price());
			entity.setRoom_waterheater(dto.getRoom_waterheater());
			entity.setRoom_tv(dto.getRoom_tv());
			entity.setRoom_refrigerator(dto.getRoom_refrigerator());
			entity.setRoom_air(dto.getRoom_air());
			entity.setRoom_fan(dto.getRoom_fan());
			entity.setRoom_status(dto.getRoom_status());
		}
		return entity;
	}

	@Override
	public RoomDto selectBySIdRoom(Integer room_id) throws Exception {
		RoomDto room = new RoomDto();
		if (room_id > 0) {
			RoomEntity entity = roomRepository.findById(room_id).get();
		if (entity != null){
			room = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectBySIdRoom :: room_id < 0 !");	
		}
		return room;
	}
	
	@Override
	public List<RoomDto> getRoomBydormId(Integer dorm_id) throws Exception {
		System.out.println("getDormById :: dorm_id => " + dorm_id);
		List<RoomDto> room = new ArrayList<>();
		if (dorm_id != null ) {
			List<RoomEntity> entities = (List<RoomEntity>) roomRepository.findRoomBydormId(dorm_id);
			if (entities != null) {
				room = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
				
			}
		} else {
			throw new NullPointerException("getRoomBydormId :: dorm_id is null! ");
		}
		return room;
	}

}