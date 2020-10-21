package com.it.dto;

import java.math.BigDecimal;
import java.util.List;

public class MemberDto {

	private int mem_id;
	private int id;
	private int dorm_id;
	private int room_id;
	private String mem_ref;
	private String first_name;
	private String last_name;
	private String citizen;
	private String email;
	private String tel;
	private String mem_reserdate;
	private int mem_guest;
	private String date_of_stay;
	private BigDecimal deposit;
	private String deposit_status;
	private String mem_img;
	

	public String getMem_img() {
		return mem_img;
	}
	public void setMem_img(String mem_img) {
		this.mem_img = mem_img;
	}
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDorm_id() {
		return dorm_id;
	}
	public void setDorm_id(int dorm_id) {
		this.dorm_id = dorm_id;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getMem_ref() {
		return mem_ref;
	}
	public void setMem_ref(String mem_ref) {
		this.mem_ref = mem_ref;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCitizen() {
		return citizen;
	}
	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMem_reserdate() {
		return mem_reserdate;
	}
	public void setMem_reserdate(String mem_reserdate) {
		this.mem_reserdate = mem_reserdate;
	}
	public int getMem_guest() {
		return mem_guest;
	}
	public void setMem_guest(int mem_guest) {
		this.mem_guest = mem_guest;
	}
	public String getDate_of_stay() {
		return date_of_stay;
	}
	public void setDate_of_stay(String date_of_stay) {
		this.date_of_stay = date_of_stay;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	public String getDeposit_status() {
		return deposit_status;
	}
	public void setDeposit_status(String deposit_status) {
		this.deposit_status = deposit_status;
	}
	
}
