package com.it.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.it.dto.ConvenientDto;
import com.it.dto.RoomDto;
import com.it.service.ConvenientService;

@RestController
public class ConvenientApiController {
	
	@Autowired(required=false)
	ConvenientService conService;
	
	@PostMapping("/con/save")
	public ResponseEntity<ConvenientDto> saveCon(@RequestBody ConvenientDto conDto) throws Exception{
		if (conDto != null) {
			conService.saveCon(conDto);
		}		
		return new ResponseEntity<ConvenientDto>(conDto, HttpStatus.OK);
	}
	
	@PostMapping("/con/update")
	public ResponseEntity<ConvenientDto> updateCon(@RequestBody ConvenientDto conDto) throws Exception {
		if (conDto != null) {
			conService.updateCon(conDto);
		}
		return new ResponseEntity<ConvenientDto>(conDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/con/{con_id}")
	public ResponseEntity<Integer> deleteConByConID(@PathVariable Integer con_id) throws Exception {
		conService.deleteConByConID(con_id);
		return new ResponseEntity<Integer>(con_id, HttpStatus.OK);		
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/cons")
	public ResponseEntity<List<ConvenientDto>> selectAllCon() throws Exception{
		List<ConvenientDto> cons = conService.selectAllCon();
		return new ResponseEntity<List<ConvenientDto>>(cons, HttpStatus.OK);
	}
	
	@GetMapping("/con/{con_id}")
	public ResponseEntity<ConvenientDto> selectByConId(@PathVariable Integer con_id) throws Exception{
		ConvenientDto con = conService.selectByConId(con_id);
		return new ResponseEntity<ConvenientDto>(con, HttpStatus.OK);
	}
	
//	@GetMapping("/con-id/{dorm_id}")
//	public ResponseEntity<List<ConvenientDto>> getConByDormId(@PathVariable Integer dorm_id) throws Exception {
//		List<ConvenientDto> conDto = conService.getConByDormId(dorm_id);
//		return new ResponseEntity<List<ConvenientDto>>(conDto, HttpStatus.OK);
//	}
	@GetMapping("/con-id/{dorm_id}")
	public ResponseEntity<List<ConvenientDto>> getConByDormId(@PathVariable Integer dorm_id) throws Exception {
		List<ConvenientDto> con = conService.getConByDormId(dorm_id);
		return new ResponseEntity<List<ConvenientDto>>(con, HttpStatus.OK);
	}

}
