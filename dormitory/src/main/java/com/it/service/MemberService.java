package com.it.service;

import java.util.List;
import com.it.dto.MemberDto;

public interface MemberService {

	public MemberDto saveMember(MemberDto memberDto) throws Exception;

	public MemberDto updateMember(MemberDto memberDto) throws Exception;

	public Integer deleteMemberByMem_id(Integer mem_id) throws Exception;

	public List<MemberDto> selectAllMember() throws Exception;
	
	public MemberDto selectBySIdMember(Integer mem_id) throws Exception;
	
	public List<MemberDto> getMemBydormId (Integer dorm_id) throws Exception;
	
	public List<MemberDto> getMemById (Integer id) throws Exception;
}
