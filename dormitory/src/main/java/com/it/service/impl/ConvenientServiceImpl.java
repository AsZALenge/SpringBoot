package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.dao.ConvenientRepository;
import com.it.dto.ConvenientDto;
import com.it.dto.RoomDto;
import com.it.entity.ConvenientEntity;
import com.it.entity.RoomEntity;
import com.it.service.ConvenientService;

@Service
public class ConvenientServiceImpl implements ConvenientService {
	
	@Autowired(required=false)
	ConvenientRepository conRepository;

	@Override
	public ConvenientDto saveCon(ConvenientDto conDto) throws Exception {
		if (conDto != null) {
			ConvenientEntity entity = convertDtoToEntit(conDto);
			conRepository.save(entity);
		}
		return conDto;
	}

	@Override
	public ConvenientDto updateCon(ConvenientDto conDto) throws Exception {
		if (conDto != null && conDto.getCon_id() > 0) {
			ConvenientEntity entity = convertDtoToEntit(conDto);
			conRepository.save(entity);
		}else {
			throw new NullPointerException("updateCon :: ConvenientDto is Null or con_id < 0 !");
		}
		return conDto;
	}

	@Override
	public Integer deleteConByConID(Integer con_id) throws Exception {
		if (con_id > 0) { 
			conRepository.deleteById(con_id);
		}else {
			throw new NullPointerException("deleteConByConID :: con_id < 0 !");
		}
		return con_id;
	}

	@Override
	public List<ConvenientDto> selectAllCon() throws Exception {
		List<ConvenientDto> cons = new ArrayList<>();
		List<ConvenientEntity> entities = (List<ConvenientEntity>) conRepository.findAll();
		if (entities != null) {
			cons = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return cons;
	}

	private ConvenientDto convertEntityToDto(ConvenientEntity entity) {
		ConvenientDto dto = new ConvenientDto();
		if (entity != null) {
			dto.setCon_id(entity.getCon_id());
			dto.setDorm_id(entity.getDorm_id());
			dto.setCon_wifi(entity.getCon_wifi());
			dto.setCon_park(entity.getCon_park());
			dto.setCon_washing(entity.getCon_washing());
			dto.setCon_waterfilter(entity.getCon_waterfilter());
			dto.setCon_keycard(entity.getCon_keycard());
			dto.setCon_pet(entity.getCon_pet());
			dto.setCon_securitycctv(entity.getCon_securitycctv());
			dto.setCon_smoking(entity.getCon_smoking());
		}
		return dto;
	}

	private ConvenientEntity convertDtoToEntit(ConvenientDto dto) {
		ConvenientEntity entity = new ConvenientEntity();
		if (dto != null) {
			entity.setCon_id(dto.getCon_id());
			entity.setDorm_id(dto.getDorm_id());
			entity.setCon_wifi(dto.getCon_wifi());
			entity.setCon_park(dto.getCon_park());
			entity.setCon_washing(dto.getCon_washing());
			entity.setCon_waterfilter(dto.getCon_waterfilter());
			entity.setCon_keycard(dto.getCon_keycard());
			entity.setCon_pet(dto.getCon_pet());
			entity.setCon_securitycctv(dto.getCon_securitycctv());
			entity.setCon_smoking(dto.getCon_smoking());
		}
		return entity;
	}

	@Override
	public ConvenientDto selectByConId(Integer con_id) throws Exception {
		ConvenientDto con = new ConvenientDto();
		if (con_id > 0) {
		ConvenientEntity entity = conRepository.findById(con_id).get();
		if (entity != null){
			con = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectByConId :: con_id < 0 !");	
		}
		return con;
	}

//	@Override
//	public ConvenientDto getConByDormId(Integer dorm_id) throws Exception {
//		System.out.println("getConByDormId :: dorm_id => " + dorm_id);
//		ConvenientDto con = new ConvenientDto();
//		if (dorm_id != null ) {
//			ConvenientEntity entity = conRepository.findConByDormId(dorm_id);
//			if (entity != null) {
//				con = convertEntityToDto(entity);
//				
//			}
//		} else {
//			throw new NullPointerException("getConByDormId :: dorm_id is null! ");
//		}
//		return con;
//	}
	
	@Override
	public List<ConvenientDto> getConByDormId(Integer dorm_id) throws Exception {
		System.out.println("getConByDormId :: dorm_id => " + dorm_id);
		List<ConvenientDto> con = new ArrayList<>();
		if (dorm_id != null ) {
			List<ConvenientEntity> entities = (List<ConvenientEntity>) conRepository.findConByDormId(dorm_id);
			if (entities != null) {
				con = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
				
			}
		} else {
			throw new NullPointerException("getConByDormId :: dorm_id is null! ");
		}
		return con;
	}

}
