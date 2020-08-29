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
import com.it.dto.UserDto;
import com.it.service.UserService;

@RestController
public class UserApiController {
	private static final int USER_STATUS = 2;
	@Autowired(required=false)
	UserService userService;

	@GetMapping("/ping")
	public ResponseEntity<String> ping(){
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@PostMapping("/user/save")
	public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) throws Exception{
		if (userDto != null) {
			userDto.setUser_status(USER_STATUS);
			userService.saveUser(userDto);
		}		
		return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
	}
	
	@PostMapping("/user/update")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto) throws Exception {
		if (userDto != null) {
			userService.updateUser(userDto);
		}
		return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{user_id}")
	public ResponseEntity<Integer> deleteUserByUser_id(@PathVariable Integer user_id) throws Exception {
		userService.deleteUserByUser_id(user_id);
		return new ResponseEntity<Integer>(user_id, HttpStatus.OK);		
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getAllUser() throws Exception{
		List<UserDto> user = userService.selectAllUser();
		return new ResponseEntity<List<UserDto>>(user, HttpStatus.OK);
	}
	
	@GetMapping("/user/{user_id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Integer user_id) throws Exception{
		UserDto user = userService.selectBySIdUser(user_id);
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}
	
}
