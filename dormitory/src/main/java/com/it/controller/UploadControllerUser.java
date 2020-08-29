package com.it.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.it.service.UploadServiceUser;

@RestController
@RequestMapping("/upload") 
public class UploadControllerUser {
	
	@Autowired(required=true)
	UploadServiceUser uploadService;
	
	@PostMapping ("/file")
	public ResponseEntity<String> uploadSingleFile(@RequestBody MultipartFile file)throws FileNotFoundException {
		uploadService.uploadImage(file);
		return new ResponseEntity<>("OK", HttpStatus.OK);
	} 
	
	@PostMapping ("/files")
	public ResponseEntity<String> uploadMultiFile(@RequestBody List<MultipartFile> files)throws FileNotFoundException {
		if (files != null && files.size() > 0) {
			files.stream().forEach(file -> uploadService.uploadImage(file));
		}
		return new ResponseEntity<>("OK", HttpStatus.OK);
	} 
}
