package com.it.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.it.dto.DormtypeDto;
import com.it.service.DormtypeService;

@RestController
public class DormtypeApiController {

	@Autowired(required=false)
	DormtypeService typeService;

	@GetMapping("/types")
	public ResponseEntity<List<DormtypeDto>> selectAllDormtype() throws Exception{
		List<DormtypeDto> type = typeService.selectAllDormtype();
		return new ResponseEntity<List<DormtypeDto>>(type, HttpStatus.OK);
	}
	
	@GetMapping("/type/{type_id}")
	public ResponseEntity<DormtypeDto> selectTypeByTypeID(@PathVariable Integer type_id) throws Exception{
		DormtypeDto type = typeService.selectTypeByTypeID(type_id);
		return new ResponseEntity<DormtypeDto>(type, HttpStatus.OK);
	}

}