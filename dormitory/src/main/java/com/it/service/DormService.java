package com.it.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

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
	
	public List<DormDto> searchDorm(@RequestParam String dormName, @RequestParam BigDecimal priceStart, @RequestParam BigDecimal priceEnd, @RequestParam String dormType ) throws Exception;
}
