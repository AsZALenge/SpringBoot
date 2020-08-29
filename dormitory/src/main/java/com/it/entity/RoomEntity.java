package com.it.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_room")
public class RoomEntity {

	@Id
	@Column(name = "room_id")
	private Integer room_id;

	@Column(name = "dorm_id")
	private Integer dorm_id;

	@Column(name = "room_num")
	private String room_num;

	@Column(name = "room_img")
	private String room_img;

	@Column(name = "room_price")
	private BigDecimal room_price;

	@Column(name = "room_waterheater")
	private String room_waterheater;

	@Column(name = "room_tv")
	private String room_tv;

	@Column(name = "room_refrigerator")
	private String room_refrigerator;
	
	@Column(name = "room_air")
	private String room_air;

	@Column(name = "room_fan")
	private String room_fan;

	@Column(name = "room_status")
	private String room_status;

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public Integer getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(Integer dorm_id) {
		this.dorm_id = dorm_id;
	}

	public String getRoom_num() {
		return room_num;
	}

	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}

	public String getRoom_img() {
		return room_img;
	}

	public void setRoom_img(String room_img) {
		this.room_img = room_img;
	}

	public BigDecimal getRoom_price() {
		return room_price;
	}

	public void setRoom_price(BigDecimal room_price) {
		this.room_price = room_price;
	}

	public String getRoom_waterheater() {
		return room_waterheater;
	}

	public void setRoom_waterheater(String room_waterheater) {
		this.room_waterheater = room_waterheater;
	}

	public String getRoom_tv() {
		return room_tv;
	}

	public void setRoom_tv(String room_tv) {
		this.room_tv = room_tv;
	}

	public String getRoom_refrigerator() {
		return room_refrigerator;
	}

	public void setRoom_refrigerator(String room_refrigerator) {
		this.room_refrigerator = room_refrigerator;
	}

	public String getRoom_air() {
		return room_air;
	}

	public void setRoom_air(String room_air) {
		this.room_air = room_air;
	}

	public String getRoom_fan() {
		return room_fan;
	}

	public void setRoom_fan(String room_fan) {
		this.room_fan = room_fan;
	}

	public String getRoom_status() {
		return room_status;
	}

	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}
	

}
