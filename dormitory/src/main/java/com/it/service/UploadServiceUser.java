package com.it.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadServiceUser {
	 void uploadImage(MultipartFile file);  
}
