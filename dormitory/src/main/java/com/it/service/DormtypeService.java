package com.it.service;

import java.util.List;

import com.it.dto.DormtypeDto;

public interface DormtypeService {

	public List<DormtypeDto> selectAllDormtype() throws Exception;
	
	public DormtypeDto selectTypeByTypeID(Integer type_id) throws Exception;
}
