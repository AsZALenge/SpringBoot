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
import com.it.service.DormService;

@RestController
public class DormApiController {
	@Autowired(required=false)
	DormService dormService;

//	@GetMapping("/ping")
//	public ResponseEntity<String> ping(){
//		return new ResponseEntity<String>("OK", HttpStatus.OK);
//	}
	
	@PostMapping("/dorm/save")
	public ResponseEntity<DormDto> saveDorm(@RequestBody DormDto dormDto) throws Exception{
		if (dormDto != null) {
			dormService.saveDorm(dormDto);
		}		
		return new ResponseEntity<DormDto>(dormDto, HttpStatus.OK);
	}
	
	@PostMapping("/dorm/update")
	public ResponseEntity<DormDto> updateDorm(@RequestBody DormDto dormDto) throws Exception {
		if (dormDto != null) {
			dormService.updateDorm(dormDto);
		}
		return new ResponseEntity<DormDto>(dormDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/dorm/{dorm_id}")
	public ResponseEntity<Integer> deleteDormByDorm_id(@PathVariable Integer dorm_id) throws Exception {
		dormService.deleteDormByDorm_id(dorm_id);
		return new ResponseEntity<Integer>(dorm_id, HttpStatus.OK);		
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/dorms")
	public ResponseEntity<List<DormDto>> getAllDorm() throws Exception{
		List<DormDto> dorm = dormService.selectAllDorm();
		return new ResponseEntity<List<DormDto>>(dorm, HttpStatus.OK);
	}
	
	@GetMapping("/dorm/{dorm_id}")
	public ResponseEntity<DormDto> getDormById(@PathVariable Integer dorm_id) throws Exception{
		DormDto dorm = dormService.selectBySIdDorm(dorm_id);
		return new ResponseEntity<DormDto>(dorm, HttpStatus.OK);
	}
	
	@GetMapping("/dorm-id/{id}")
	public ResponseEntity<DormDto> getDormByuserId(@PathVariable Integer id) throws Exception {
		DormDto dormDto = dormService.getDormByuserId(id);
		return new ResponseEntity<DormDto>(dormDto, HttpStatus.OK);
	}
	
	@GetMapping("/dormitory/{dorm_id}")
	public ResponseEntity<List<DormDto>> getDormByDormID(@PathVariable Integer dorm_id) throws Exception {
		List<DormDto> dorm = dormService.getDormByDormID(dorm_id);
		return new ResponseEntity<List<DormDto>>(dorm, HttpStatus.OK);
	}
	
	@GetMapping("/dorm-type/{type_id}")
	public ResponseEntity<List<DormDto>> getDormByTypeId(@PathVariable Integer type_id) throws Exception {
		List<DormDto> dorm = dormService.getDormByTypeId(type_id);
		return new ResponseEntity<List<DormDto>>(dorm, HttpStatus.OK);
	}
}
