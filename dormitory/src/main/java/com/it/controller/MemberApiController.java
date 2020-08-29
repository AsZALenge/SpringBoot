package com.it.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.DormDto;
import com.it.dto.MemberDto;
import com.it.dto.RoomDto;
import com.it.service.MemberService;

@RestController
public class MemberApiController {
	
	@Autowired(required=false)
	MemberService memberService;

//	@GetMapping("/ping")
//	public ResponseEntity<String> ping(){
//		return new ResponseEntity<String>("OK", HttpStatus.OK);
//	}
	
	@PostMapping("/mem/save")
	public ResponseEntity<MemberDto> saveMember(@RequestBody MemberDto memberDto) throws Exception{
		if (memberDto != null) {
			memberService.saveMember(memberDto);
		}		
		return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
	}
	
	@PostMapping("/mem/update")
	public ResponseEntity<MemberDto> updateMember(@RequestBody MemberDto memberDto) throws Exception {
		if (memberDto != null) {
			memberService.updateMember(memberDto);
		}
		return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/mem/{mem_id}")
	public ResponseEntity<Integer> deleteMemberByMem_id(@PathVariable Integer mem_id) throws Exception {
		memberService.deleteMemberByMem_id(mem_id);
		return new ResponseEntity<Integer>(mem_id, HttpStatus.OK);		
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/mems")
	public ResponseEntity<List<MemberDto>> getAllMember() throws Exception{
		List<MemberDto> mem = memberService.selectAllMember();
		return new ResponseEntity<List<MemberDto>>(mem, HttpStatus.OK);
	}
	
	@GetMapping("/mem/{mem_id}")
	public ResponseEntity<MemberDto> getMemberById(@PathVariable Integer mem_id) throws Exception{
		MemberDto mem = memberService.selectBySIdMember(mem_id);
		return new ResponseEntity<MemberDto>(mem, HttpStatus.OK);
	}
	
	@GetMapping("/mem-id/{dorm_id}")
	public ResponseEntity<List<MemberDto>> getMemBydormId(@PathVariable Integer dorm_id) throws Exception {
		List<MemberDto> mem = memberService.getMemBydormId(dorm_id);
		return new ResponseEntity<List<MemberDto>>(mem, HttpStatus.OK);
	}
	
	@GetMapping("/member/{id}")
	public ResponseEntity<List<MemberDto>> getMemById(@PathVariable Integer id) throws Exception {
		List<MemberDto> mem = memberService.getMemById(id);
		return new ResponseEntity<List<MemberDto>>(mem, HttpStatus.OK);
	}
}
