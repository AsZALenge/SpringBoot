package com.it.service;

import java.util.List;

import com.it.dto.ConvenientDto;

public interface ConvenientService {
	
	public ConvenientDto saveCon(ConvenientDto ConDto) throws Exception;

	public ConvenientDto updateCon(ConvenientDto ConDto) throws Exception;

	public Integer deleteConByConID(Integer con_id) throws Exception;

	public List<ConvenientDto> selectAllCon() throws Exception;
	
	public ConvenientDto selectByConId(Integer con_id) throws Exception;
	
	public List<ConvenientDto> getConByDormId (Integer dorm_id) throws Exception;

}
