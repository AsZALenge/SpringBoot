package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.dao.UserRepository;
import com.it.dto.UserDto;
import com.it.entity.UserEntity;
import com.it.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required=false)
	UserRepository userRepository;

	@Override
	public UserDto saveUser(UserDto userDto) throws Exception {
		if (userDto != null) {
			UserEntity entity = convertDtoToEntit(userDto);
			userRepository.save(entity);
		}
		return userDto;
	}

	@Override
	public UserDto updateUser(UserDto userDto) throws Exception {
		if (userDto != null && userDto.getUser_id() > 0) {
			UserEntity entity = convertDtoToEntit(userDto);
			userRepository.save(entity);
		}else {
			throw new NullPointerException("updateUser :: UserDto is Null or user_id < 0 !");
		}
		return userDto;
	}

	@Override
	public Integer deleteUserByUser_id(Integer user_id) throws Exception {
		if (user_id > 0) { 
		userRepository.deleteById(user_id);
		}else {
			throw new NullPointerException("deleteUserByUser_id :: User_id < 0 !");
		}
		return user_id;
	}

	@Override
	public List<UserDto> selectAllUser() throws Exception {
		List<UserDto> users = new ArrayList<>();
		List<UserEntity> entities = (List<UserEntity>) userRepository.findAll();
		if (entities != null) {
			users = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return users;
	}

	private UserDto convertEntityToDto(UserEntity entity) {
		UserDto dto = new UserDto();
		if (entity != null) {
			dto.setUser_id(entity.getUser_id());
			dto.setUser_name(entity.getUser_name());
			dto.setUser_password(entity.getUser_password());
			dto.setUser_citizen(entity.getUser_citizen());
			dto.setUser_email(entity.getUser_email());
			dto.setUser_gender(entity.getUser_gender());
			dto.setUser_tel(entity.getUser_tel());
			dto.setUser_status(entity.getUser_status());

		}
		return dto;
	}

	private UserEntity convertDtoToEntit(UserDto dto) {
		UserEntity entity = new UserEntity();
		if (dto != null) {
			entity.setUser_id(dto.getUser_id());
			entity.setUser_name(dto.getUser_name());
			entity.setUser_password(dto.getUser_password());
			entity.setUser_citizen(dto.getUser_citizen());
			entity.setUser_email(dto.getUser_email());
			entity.setUser_gender(dto.getUser_gender());
			entity.setUser_tel(dto.getUser_tel());
			entity.setUser_status(dto.getUser_status());
		}
		return entity;
	}

	@Override
	public UserDto selectBySIdUser(Integer user_id) throws Exception {
		UserDto user = new UserDto();
		if (user_id > 0) {
		UserEntity entity = userRepository.findById(user_id).get();
		if (entity != null){
			user = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectBySIdUser :: user_id < 0 !");	
		}
		return user;
	}

}