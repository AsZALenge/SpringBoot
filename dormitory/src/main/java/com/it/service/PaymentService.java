package com.it.service;

import java.util.List;

import com.it.dto.MemberDto;
import com.it.dto.PaymentDto;

public interface PaymentService {

	public PaymentDto savePayment(PaymentDto paymentDto) throws Exception;

	public PaymentDto updatPayment(PaymentDto paymentDto) throws Exception;

	public Integer deletePaymentByPay_id(Integer pay_id) throws Exception;

	public List<PaymentDto> selectAllPayment() throws Exception;
	
	public PaymentDto selectBySIdPayment(Integer pay_id) throws Exception;
	
	public List<PaymentDto> getPayBydormId (Integer dorm_id) throws Exception;
}
