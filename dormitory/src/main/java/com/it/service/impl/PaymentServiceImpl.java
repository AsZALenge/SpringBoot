package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.PaymentRepository;
import com.it.dto.MemberDto;
import com.it.dto.PaymentDto;
import com.it.entity.MemberEntity;
import com.it.entity.PaymentEntity;
import com.it.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired(required=false)
	PaymentRepository paymentRepository;

	@Override
	public PaymentDto savePayment(PaymentDto paymentDto) throws Exception {
		if (paymentDto != null) {
			PaymentEntity entity = convertDtoToEntit(paymentDto);
			paymentRepository.save(entity);
		}
		return paymentDto;
	}

	@Override
	public PaymentDto updatPayment(PaymentDto paymentDto) throws Exception {
		if (paymentDto != null && paymentDto.getPay_id() > 0) {
			PaymentEntity entity = convertDtoToEntit(paymentDto);
			paymentRepository.save(entity);
		}else {
			throw new NullPointerException("updateMember :: PaymentDto is Null or Pay_id < 0 !");
		}
		return paymentDto;
	}

	@Override
	public Integer deletePaymentByPay_id(Integer pay_id) throws Exception {
		if (pay_id > 0) { 
			paymentRepository.deleteById(pay_id);
		}else {
			throw new NullPointerException("deleteMemberByMem_id :: Pay_id < 0 !");
		}
		return pay_id;
	}

	@Override
	public List<PaymentDto> selectAllPayment() throws Exception {
		List<PaymentDto> pay = new ArrayList<>();
		List<PaymentEntity> entities = (List<PaymentEntity>) paymentRepository.findAll();
		if (entities != null) {
			pay = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
		}
		return pay;
	}

	private PaymentDto convertEntityToDto(PaymentEntity entity) {
		PaymentDto dto = new PaymentDto();
		if (entity != null) {
			dto.setPay_id(entity.getPay_id());
			dto.setMem_id(entity.getMem_id());
			dto.setDorm_id(entity.getDorm_id());
			dto.setPay_pic(entity.getPay_pic());
			dto.setPay_price(entity.getPay_price());
			dto.setPay_date(entity.getPay_date());
			dto.setPay_status(entity.getPay_status());

		}
		return dto;
	}

	private PaymentEntity convertDtoToEntit(PaymentDto dto) {
		PaymentEntity entity = new PaymentEntity();
		if (dto != null) {
			entity.setPay_id(dto.getPay_id());
			entity.setMem_id(dto.getMem_id());
			entity.setDorm_id(dto.getDorm_id());
			entity.setPay_pic(dto.getPay_pic());
			entity.setPay_price(dto.getPay_price());
			entity.setPay_date(dto.getPay_date());
			entity.setPay_status(dto.getPay_status());
			
		}
		return entity;
	}

	@Override
	public PaymentDto selectBySIdPayment(Integer pay_id) throws Exception {
		PaymentDto pay = new PaymentDto();
		if (pay_id > 0) {
			PaymentEntity entity = paymentRepository.findById(pay_id).get();
		if (entity != null){
			pay = convertEntityToDto(entity);
		} 
		}else {
			throw new NullPointerException("selectBySIdPayment :: pay_id < 0 !");	
		}
		return pay;
	}

	@Override
	public List<PaymentDto> getPayBydormId(Integer dorm_id) throws Exception {
		System.out.println("getPayBydormId :: dorm_id => " + dorm_id);
		List<PaymentDto> pay = new ArrayList<>();
		if (dorm_id != null ) {
			List<PaymentEntity> entities = (List<PaymentEntity>) paymentRepository.findMemBydormId(dorm_id);
			if (entities != null) {
				pay = entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
				
			}
		} else {
			throw new NullPointerException("getPayBydormId :: dorm_id is null! ");
		}
		return pay;
	}
	
}