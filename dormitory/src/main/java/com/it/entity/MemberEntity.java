package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_member")
public class MemberEntity {

	@Id
	@Column(name = "mem_id")
	private Integer mem_id;

	@Column(name = "id")
	private Integer id;

	@Column(name = "dorm_id")
	private Integer dorm_id;

	@Column(name = "room_id")
	private Integer room_id;

	@Column(name = "mem_reserdate")
	private String mem_reserdate;
	
	@Column(name = "mem_add")
	private Integer mem_add;
	
	@Column(name = "room_price")
	private Integer room_price;

	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(Integer dorm_id) {
		this.dorm_id = dorm_id;
	}

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public String getMem_reserdate() {
		return mem_reserdate;
	}

	public void setMem_reserdate(String mem_reserdate) {
		this.mem_reserdate = mem_reserdate;
	}

	public Integer getMem_add() {
		return mem_add;
	}

	public void setMem_add(Integer mem_add) {
		this.mem_add = mem_add;
	}

	public Integer getRoom_price() {
		return room_price;
	}

	public void setRoom_price(Integer room_price) {
		this.room_price = room_price;
	}

	
}
