package com.it.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.dao.DormRepository;
import com.it.dto.ConvenientDto;
import com.it.dto.DormDto;
import com.it.dto.DormtypeDto;
import com.it.dto.MemberDto;
import com.it.dto.RoomDto;
import com.it.entity.ConvenientEntity;
import com.it.entity.DormEntity;
import com.it.entity.DormtypeEntity;
import com.it.entity.MemberEntity;
import com.it.entity.RoomEntity;
import com.it.service.DormService;

@Service
public class DormServiceImpl implements DormService {

	@Autowired(required=false)
	DormRepository dormRepository;

	@Override
	public DormDto saveDorm(DormDto dormDto) throws Exception {
		if (dormDto != null) {
			DormEntity entity = convertDtoToEntit(dormDto);
			dormRepository.save(entity);
		}
		return dormDto;
	}

	@Override
	public DormDto updateDorm(DormDto dormDto) throws Exception {
		if (dormDto != null && dormDto.getDorm_id() > 0) {
			DormEntity entity = convertDtoToEntit(dormDto);
			dormRepository.save(entity);
		}else {
			throw new NullPointerException("updateDorm :: DormDto is Null or dorm_id < 0 !");
		}
		return dormDto;
	}

	@Override
	public Integer deleteDormByDorm_id(Integer dorm_id) throws Exception {
		if (dorm_id > 0) { 
		dormRepository.deleteById(dorm_id);
		}else {
			throw new NullPointerException("deleteDormByDorm_id :: Dorm_id < 0 !");
		}
		return dorm_id;
	}

	@Override
	public List<DormDto> selectAllDorm() throws Exception {
		List<DormDto> dorms = new ArrayList<>();
		List<DormEntity> entities = (List<DormEntity>) dormRepository.findAll();
		if (entities != null) {
			dorms = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return dorms;
	}

	private DormDto convertEntityToDto(DormEntity entity) {
		DormDto dto = new DormDto();
		if (entity != null) {
			dto.setDorm_id(entity.getDorm_id());
			dto.setId(entity.getId());
			dto.setDorm_name(entity.getDorm_name());
			dto.setDorm_address(entity.getDorm_address());
			dto.setDorm_numbank(entity.getDorm_numbank());
			dto.setDorm_namebank(entity.getDorm_namebank());
			dto.setType_id(entity.getType_id());
			dto.setDorm_waterbill(entity.getDorm_waterbill());
			dto.setDorm_electricbill(entity.getDorm_electricbill());
			dto.setDorm_img(entity.getDorm_img());
			dto.setDorm_pricedate_start(entity.getDorm_pricedate_start());
			dto.setDorm_pricedate_end(entity.getDorm_pricedate_end());
			dto.setDorm_pricemonth_start(entity.getDorm_pricemonth_start());
			dto.setDorm_pricemonth_end(entity.getDorm_pricemonth_end());
			dto.setDorm_status(entity.getDorm_status());
			
			if (null != entity.getDormtypeEntity()) {		
				dto.setDormtype(convertTypeEntityToDto( entity.getDormtypeEntity()));
			}
			
			if (null != entity.getConvenientEntity()) {		
				dto.setConDto(convertConvenEntityToDto( entity.getConvenientEntity()));
			}
			
			if (null != entity.getRoomEntities()) {
				dto.setRooms(convertRoomEntitiesToRooms(entity.getRoomEntities()));
			}

		}
		return dto;
	}
	
	private List<RoomDto> convertRoomEntitiesToRooms(List<RoomEntity> roomEntities){
		List<RoomDto> response = new ArrayList<>();
		for(RoomEntity entity : roomEntities) {
			RoomDto dto = new RoomDto();
			dto.setRoom_id(entity.getRoom_id());
			dto.setDorm_id(entity.getDorm_id());
			dto.setRoom_num(entity.getRoom_num());
			dto.setRoom_img(entity.getRoom_img());
			dto.setRoom_price(entity.getRoom_price());
			dto.setRoom_waterheater(entity.getRoom_waterheater());
			dto.setRoom_tv(entity.getRoom_tv());
			dto.setRoom_refrigerator(entity.getRoom_refrigerator());
			dto.setRoom_air(entity.getRoom_air());
			dto.setRoom_fan(entity.getRoom_fan());
			dto.setRoom_status(entity.getRoom_status());
			
			response.add(dto);
		}
		return response;
	}

	private DormEntity convertDtoToEntit(DormDto dto) {
		DormEntity entity = new DormEntity();
		if (dto != null) {
			entity.setDorm_id(dto.getDorm_id());
			entity.setId(dto.getId());
			entity.setDorm_name(dto.getDorm_name());
			entity.setDorm_address(dto.getDorm_address());
			entity.setDorm_numbank(dto.getDorm_numbank());
			entity.setDorm_namebank(dto.getDorm_namebank());
			entity.setType_id(dto.getType_id());
			entity.setDorm_waterbill(dto.getDorm_waterbill());
			entity.setDorm_electricbill(dto.getDorm_electricbill());
			entity.setDorm_img(dto.getDorm_img());
			entity.setDorm_pricedate_start(dto.getDorm_pricedate_start());
			entity.setDorm_pricedate_end(dto.getDorm_pricedate_end());
			entity.setDorm_pricemonth_start(dto.getDorm_pricemonth_start());
			entity.setDorm_pricemonth_end(dto.getDorm_pricemonth_end());
			entity.setDorm_status(dto.getDorm_status());
		}
		return entity;
	}

	@Override
	public DormDto selectBySIdDorm(Integer dorm_id) throws Exception {
		DormDto dorm = new DormDto();
		if (dorm_id > 0) {
		DormEntity entity = dormRepository.findById(dorm_id).get();
		if (entity != null){
			dorm = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectBySIdDorm :: dorm_id < 0 !");	
		}
		return dorm;
	}

	@Override
	public DormDto getDormByuserId(Integer id) throws Exception {
		System.out.println("getDormById :: id => " + id);
		DormDto dorm = new DormDto();
		if (id != null ) {
			DormEntity entity = dormRepository.findDormByUserId(id);
			if (entity != null) {
				dorm = convertEntityToDto(entity);
				
			}
		} else {
			throw new NullPointerException("getDormById :: id is null! ");
		}
		return dorm;
	}
	
	@Override
	public List<DormDto> getDormByDormID(Integer dorm_id) throws Exception {
		System.out.println("getMemById :: id => " + dorm_id);
		List<DormDto> dorm = new ArrayList<>();
		if (dorm_id != null ) {
			List<DormEntity> entities = (List<DormEntity>) dormRepository.getDormByDormID(dorm_id);
			if (entities != null) {
				dorm = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
				
			}
		} else {
			throw new NullPointerException("getDormByDormID :: dorm_id is null! ");
		}
		return dorm;
	}
	
	private DormtypeDto convertTypeEntityToDto(DormtypeEntity entity) {
		DormtypeDto dormtype = null;
		if (null != entity) {
			dormtype = new DormtypeDto(entity.getType_id(), entity.getType_name(), entity.getType_detail(), entity.getType_status());
		}		
		return dormtype;
	}
	
	private ConvenientDto convertConvenEntityToDto(ConvenientEntity entity) {
		ConvenientDto conDto = null;
		if (null != entity) {
			conDto = new ConvenientDto(entity.getCon_id(), entity.getDorm_id(), entity.getCon_wifi(), entity.getCon_park(), entity.getCon_washing(), entity.getCon_waterfilter(), entity.getCon_keycard(), entity.getCon_pet(), entity.getCon_securitycctv(), entity.getCon_smoking());
		}		
		return conDto;
	}
	
	@Override
	public List<DormDto> getDormByTypeId(Integer type_id) throws Exception {
		System.out.println("getDormByTypeId :: type_id => " + type_id);
		List<DormDto> dorm = new ArrayList<>();
		if (type_id != null) {
			List<DormEntity> entities = dormRepository.findDormByTypeId(type_id);
			if (entities != null) {
				dorm = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
			}
		} else {
			throw new NullPointerException("getDormByTypeId :: type_id is null! ");
		}
		return dorm;
	}

	@Override
	public List<DormDto> searchDorm(String dormName, BigDecimal priceStart, BigDecimal priceEnd, String dormType) throws Exception {
		List<DormDto> dorms = new ArrayList<>();
		if (!dormType.isEmpty() && dormType.equalsIgnoreCase("MONTH")) {
			List<DormEntity> entities = dormRepository.searchDormTypePermonth(dormName, priceStart, priceEnd);
			if (entities != null) {
				dorms = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
			}
		} else if (!dormType.isEmpty() && dormType.equalsIgnoreCase("DAY")) {
			List<DormEntity> entities = dormRepository.searchDormTypePerday(dormName, priceStart, priceEnd);
			if (entities != null) {
				dorms = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
			}
		}
		return dorms;
	}
}