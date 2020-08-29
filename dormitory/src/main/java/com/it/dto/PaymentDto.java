package com.it.dto;

public class PaymentDto {

	private int pay_id;
	private int mem_id;
	private int dorm_id;
	private String pay_pic;
	private String pay_price;
	private String pay_date;
	private String pay_status;
	public int getPay_id() {
		return pay_id;
	}
	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public int getDorm_id() {
		return dorm_id;
	}
	public void setDorm_id(int dorm_id) {
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
