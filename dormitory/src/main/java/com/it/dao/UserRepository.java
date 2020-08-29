package com.it.dao;

import org.springframework.data.repository.CrudRepository;

import com.it.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
