package com.it.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.DormDto;
import com.it.dto.RoomDto;
import com.it.dto.UserDto;
import com.it.service.RoomService;

@RestController
public class RoomApiController {
	
	@Autowired(required=false)
	RoomService roomService;

//	@GetMapping("/ping")
//	public ResponseEntity<String> ping(){
//		return new ResponseEntity<String>("OK", HttpStatus.OK);
//	}
	
	@PostMapping("/room/save")
	public ResponseEntity<RoomDto> saveRoom(@RequestBody RoomDto roomDto) throws Exception{
		if (roomDto != null) {
			roomService.saveRoom(roomDto);
		}		
		return new ResponseEntity<RoomDto>(roomDto, HttpStatus.OK);
	}
	
	@PostMapping("/room/update")
	public ResponseEntity<RoomDto> updateRoom(@RequestBody RoomDto roomDto) throws Exception {
		if (roomDto != null) {
			roomService.updateRoom(roomDto);
		}
		return new ResponseEntity<RoomDto>(roomDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/room/{room_id}")
	public ResponseEntity<Integer> deleteRoomByRoom_id(@PathVariable Integer room_id) throws Exception {
		roomService.deleteRoomByRoom_id(room_id);
		return new ResponseEntity<Integer>(room_id, HttpStatus.OK);		
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/rooms")
	public ResponseEntity<List<RoomDto>> getAllRoom() throws Exception{
		List<RoomDto> room = roomService.selectAllRoom();
		return new ResponseEntity<List<RoomDto>>(room, HttpStatus.OK);
	}
	
	@GetMapping("/room/{room_id}")
	public ResponseEntity<RoomDto> getRoomById(@PathVariable Integer room_id) throws Exception{
		RoomDto room = roomService.selectBySIdRoom(room_id);
		return new ResponseEntity<RoomDto>(room, HttpStatus.OK);
	}
	
	@GetMapping("/room-id/{dorm_id}")
	public ResponseEntity<List<RoomDto>> getRoomBydormId(@PathVariable Integer dorm_id) throws Exception {
		List<RoomDto> room = roomService.getRoomBydormId(dorm_id);
		return new ResponseEntity<List<RoomDto>>(room, HttpStatus.OK);
	}
	
}
