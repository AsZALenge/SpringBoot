package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.dao.DormtypeRepository;
import com.it.dto.DormtypeDto;
import com.it.entity.DormtypeEntity;
import com.it.service.DormtypeService;

@Service
public class DormtypeServiceImpl implements DormtypeService{

	@Autowired(required=false)
	DormtypeRepository typeRepository;

	@Override
	public List<DormtypeDto> selectAllDormtype() throws Exception {
		List<DormtypeDto> type = new ArrayList<>();
		List<DormtypeEntity> entities = (List<DormtypeEntity>) typeRepository.findAll();
		if (entities != null) {
			type = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return type;
	}

	private DormtypeDto convertEntityToDto(DormtypeEntity entity) {
		DormtypeDto dto = new DormtypeDto();
		if (entity != null) {
			dto.setType_id(entity.getType_id());
			dto.setType_name(entity.getType_name());
			dto.setType_detail(entity.getType_detail());
			dto.setType_status(entity.getType_status());
		}
		return dto;
	}

	@Override
	public DormtypeDto selectTypeByTypeID(Integer type_id) throws Exception {
		DormtypeDto type = new DormtypeDto();
		if (type_id > 0) {
			DormtypeEntity entity = typeRepository.findById(type_id).get();
		if (entity != null){
			type = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectTypeByTypeID :: type_id < 0 !");	
		}
		return type;
	}

}
