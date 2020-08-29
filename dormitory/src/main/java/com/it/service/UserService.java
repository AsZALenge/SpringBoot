package com.it.service;

import java.util.List;
import com.it.dto.UserDto;

public interface UserService {

	public UserDto saveUser(UserDto userDto) throws Exception;

	public UserDto updateUser(UserDto studentDto) throws Exception;

	public Integer deleteUserByUser_id(Integer sId) throws Exception;

	public List<UserDto> selectAllUser() throws Exception;
	
	public UserDto selectBySIdUser(Integer user_id) throws Exception;
}
