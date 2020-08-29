package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_payment")
public class PaymentEntity {

	@Id
	@Column(name = "pay_id")
	private Integer pay_id;

	@Column(name = "mem_id")
	private Integer mem_id;
	
	@Column(name = "dorm_id")
	private Integer dorm_id;

	@Column(name = "pay_pic")
	private String pay_pic;

	@Column(name = "pay_price")
	private String pay_price;

	@Column(name = "pay_date")
	private String pay_date;

	@Column(name = "pay_status")
	private String pay_status;

	public Integer getPay_id() {
		return pay_id;
	}

	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public Integer getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(Integer dorm_id) {
		this.dorm_id = dorm_id;
	}

	public String getPay_pic() {
		return pay_pic;
	}

	public void setPay_pic(String pay_pic) {
		this.pay_pic = pay_pic;
	}

	public String getPay_price() {
		return pay_price;
	}

	public void setPay_price(String pay_price) {
		this.pay_price = pay_price;
	}

	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}

	public String getPay_status() {
		return pay_status;
	}

	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
	
}
