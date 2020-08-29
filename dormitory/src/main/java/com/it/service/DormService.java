package com.it.service;

import java.util.List;

import com.it.dto.DormDto;

public interface DormService {

	public DormDto saveDorm(DormDto dormDto) throws Exception;

	public DormDto updateDorm(DormDto dormDto) throws Exception;

	public Integer deleteDormByDorm_id(Integer dorm_id) throws Exception;

	public List<DormDto> selectAllDorm() throws Exception;
	
	public DormDto selectBySIdDorm(Integer dorm_id) throws Exception;
	
	public DormDto getDormByuserId (Integer id) throws Exception;
	
	public List<DormDto> getDormByDormID(Integer dorm_id) throws Exception;
	
	public List<DormDto> getDormByTypeId (Integer type_id) throws Exception;
}
