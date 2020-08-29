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

import com.it.dto.MemberDto;
import com.it.dto.PaymentDto;
import com.it.service.PaymentService;


@RestController
public class PaymentApiController {
	
	@Autowired(required=false)
	PaymentService paymentService;

//	@GetMapping("/ping")
//	public ResponseEntity<String> ping(){
//		return new ResponseEntity<String>("OK", HttpStatus.OK);
//	}
	
	@PostMapping("/pay/save")
	public ResponseEntity<PaymentDto> savePayment(@RequestBody PaymentDto paymentDto) throws Exception{
		if (paymentDto != null) {
			paymentService.savePayment(paymentDto);
		}		
		return new ResponseEntity<PaymentDto>(paymentDto, HttpStatus.OK);
	}
	
	@PostMapping("/pay/update")
	public ResponseEntity<PaymentDto> updatPayment(@RequestBody PaymentDto paymentDto) throws Exception {
		if (paymentDto != null) {
			paymentService.updatPayment(paymentDto);
		}
		return new ResponseEntity<PaymentDto>(paymentDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/pay/{pay_id}")
	public ResponseEntity<Integer> deletePaymentByPay_id(@PathVariable Integer pay_id) throws Exception {
		paymentService.deletePaymentByPay_id(pay_id);
		return new ResponseEntity<Integer>(pay_id, HttpStatus.OK);		
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/pays")
	public ResponseEntity<List<PaymentDto>> getAllPayment() throws Exception{
		List<PaymentDto> pay = paymentService.selectAllPayment();
		return new ResponseEntity<List<PaymentDto>>(pay, HttpStatus.OK);
	}
	
	@GetMapping("/pay/{pay_id}")
	public ResponseEntity<PaymentDto> getPaymentById(@PathVariable Integer pay_id) throws Exception{
		PaymentDto pay = paymentService.selectBySIdPayment(pay_id);
		return new ResponseEntity<PaymentDto>(pay, HttpStatus.OK);
	}
	
	@GetMapping("/pay-id/{dorm_id}")
	public ResponseEntity<List<PaymentDto>> getPayBydormId(@PathVariable Integer dorm_id) throws Exception {
		List<PaymentDto> pay = paymentService.getPayBydormId(dorm_id);
		return new ResponseEntity<List<PaymentDto>>(pay, HttpStatus.OK);
	}
}
