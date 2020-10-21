package com.it.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_member")
public class MemberEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "mem_id")
	private Integer mem_id;

	@Column(name = "id")
	private Integer id;

	@Column(name = "dorm_id")
	private Integer dorm_id;

	@Column(name = "room_id")
	private Integer room_id;

	@Column(name = "mem_ref")
	private String mem_ref;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "citizen")
	private String citizen;

	@Column(name = "email")
	private String email;

	@Column(name = "tel")
	private String tel;

	@Column(name = "mem_reserdate")
	private String mem_reserdate;

	@Column(name = "mem_guest")
	private Integer mem_guest;

	@Column(name = "date_of_stay")
	private String date_of_stay;

	@Column(name = "deposit")
	private BigDecimal deposit;

	@Column(name = "deposit_status")
	private String deposit_status;

	@Column(name = "mem_img")
	private String mem_img;
	

	public String getMem_img() {
		return mem_img;
	}

	public void setMem_img(String mem_img) {
		this.mem_img = mem_img;
	}

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

	public Integer getMem_guest() {
		return mem_guest;
	}

	public void setMem_guest(Integer mem_guest) {
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
