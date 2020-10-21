package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.service.impl.EmailService;

@RestController
@RequestMapping("/send-mail")
public class SendEmailController {

	@Autowired
	EmailService mailService;

	@GetMapping()
	public ResponseEntity<String> sendEmail(@RequestParam String name, @RequestParam String email,
			@RequestParam List<String> list) {
		mailService.sent(name, email, list);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

}
