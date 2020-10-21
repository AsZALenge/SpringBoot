package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.dao.MemberRepository;
import com.it.dto.MemberDto;
import com.it.entity.MemberEntity;
import com.it.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired(required=false)
	MemberRepository memberRepository;

	@Override
	public MemberDto saveMember(MemberDto memberDto) throws Exception {
		if (memberDto != null) {
			MemberEntity entity = convertDtoToEntit(memberDto);
			memberRepository.save(entity);
		}
		return memberDto;
	}

	@Override
	public MemberDto updateMember(MemberDto memberDto) throws Exception {
		if (memberDto != null && memberDto.getMem_id() > 0) {
			MemberEntity entity = convertDtoToEntit(memberDto);
			memberRepository.save(entity);
		}else {
			throw new NullPointerException("updateMember :: MemberDto is Null or Mem_id < 0 !");
		}
		return memberDto;
	}

	@Override
	public Integer deleteMemberByMem_id(Integer mem_id) throws Exception {
		if (mem_id > 0) { 
			memberRepository.deleteById(mem_id);
		}else {
			throw new NullPointerException("deleteMemberByMem_id :: Mem_id < 0 !");
		}
		return mem_id;
	}

	@Override
	public List<MemberDto> selectAllMember() throws Exception {
		List<MemberDto> mems = new ArrayList<>();
		List<MemberEntity> entities = (List<MemberEntity>) memberRepository.findAll();
		if (entities != null) {
			mems = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return mems;
	}

	private MemberDto convertEntityToDto(MemberEntity entity) {
		MemberDto dto = new MemberDto();
		if (entity != null) {
			dto.setMem_id(entity.getMem_id());
			dto.setId(entity.getId());
			dto.setDorm_id(entity.getDorm_id());
			dto.setRoom_id(entity.getRoom_id());
			dto.setMem_ref(entity.getMem_ref());
			dto.setFirst_name(entity.getFirst_name());
			dto.setLast_name(entity.getLast_name());
			dto.setCitizen(entity.getCitizen());
			dto.setEmail(entity.getEmail());
			dto.setTel(entity.getTel());
			dto.setMem_reserdate(entity.getMem_reserdate());
			dto.setMem_guest(entity.getMem_guest());
			dto.setDate_of_stay(entity.getDate_of_stay());
			dto.setDeposit(entity.getDeposit());
			dto.setDeposit_status(entity.getDeposit_status());
			dto.setMem_img(entity.getMem_img());

		}
		return dto;
	}

	private MemberEntity convertDtoToEntit(MemberDto dto) {
		MemberEntity entity = new MemberEntity();
		if (dto != null) {
			entity.setMem_id(dto.getMem_id());
			entity.setId(dto.getId());
			entity.setDorm_id(dto.getDorm_id());
			entity.setRoom_id(dto.getRoom_id());
			entity.setMem_ref(dto.getMem_ref());
			entity.setFirst_name(dto.getFirst_name());
			entity.setLast_name(dto.getLast_name());
			entity.setCitizen(dto.getCitizen());
			entity.setEmail(dto.getEmail());
			entity.setTel(dto.getTel());
			entity.setMem_reserdate(dto.getMem_reserdate());
			entity.setMem_guest(dto.getMem_guest());
			entity.setDate_of_stay(dto.getDate_of_stay());
			entity.setDeposit(dto.getDeposit());
			entity.setDeposit_status(dto.getDeposit_status());
			entity.setMem_img(dto.getMem_img());
		}
		return entity;
	}

	@Override
	public MemberDto selectBySIdMember(Integer mem_id) throws Exception {
		MemberDto mem = new MemberDto();
		if (mem_id > 0) {
			MemberEntity entity = memberRepository.findById(mem_id).get();
		if (entity != null){
			mem = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectBySIdMember :: mem_id < 0 !");	
		}
		return mem;
	}

	@Override
	public List<MemberDto> getMemBydormId(Integer dorm_id) throws Exception {
		System.out.println("getMemBydormId :: dorm_id => " + dorm_id);
		List<MemberDto> mem = new ArrayList<>();
		if (dorm_id != null ) {
			List<MemberEntity> entities = (List<MemberEntity>) memberRepository.findMemBydormId(dorm_id);
			if (entities != null) {
				mem = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
				
			}
		} else {
			throw new NullPointerException("getMemBydormId :: dorm_id is null! ");
		}
		return mem;
	}
	
	@Override
	public List<MemberDto> getMemById(Integer id) throws Exception {
		System.out.println("getMemById :: id => " + id);
		List<MemberDto> mem = new ArrayList<>();
		if (id != null ) {
			List<MemberEntity> entities = (List<MemberEntity>) memberRepository.findMemById(id);
			if (entities != null) {
				mem = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
				
			}
		} else {
			throw new NullPointerException("getMemById :: id is null! ");
		}
		return mem;
	}
}