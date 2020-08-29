package com.it.dto;

public class MemberDto {

	private int mem_id;
	private int id;
	private int dorm_id;
	private int room_id;
	private String mem_reserdate;
	private int mem_add;
	private int room_price;
	
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
	public String getMem_reserdate() {
		return mem_reserdate;
	}
	public void setMem_reserdate(String mem_reserdate) {
		this.mem_reserdate = mem_reserdate;
	}
	public int getMem_add() {
		return mem_add;
	}
	public void setMem_add(int mem_add) {
		this.mem_add = mem_add;
	}
	public int getRoom_price() {
		return room_price;
	}
	public void setRoom_price(int room_price) {
		this.room_price = room_price;
	}
	
}
