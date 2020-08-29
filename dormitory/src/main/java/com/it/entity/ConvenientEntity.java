package com.it.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_convenient")

public class ConvenientEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//@Id
	@Column(name = "con_id")
	private Integer con_id;
	
	@Id
	@Column(name = "dorm_id")
	private Integer dorm_id;

	@Column(name = "con_wifi")
	private String con_wifi;
	
	@Column(name = "con_park")
	private String con_park;
	
	@Column(name = "con_washing")
	private String con_washing;
	
	@Column(name = "con_waterfilter")
	private String con_waterfilter;
	
	@Column(name = "con_keycard")
	private String con_keycard;
	
	@Column(name = "con_pet")
	private String con_pet;
	
	@Column(name = "con_securitycctv")
	private String con_securitycctv;
	
	@Column(name = "con_smoking")
	private String con_smoking;
	
	@OneToOne(mappedBy = "convenientEntity")
	private DormEntity dormEntity;
	
	

	public DormEntity getDormEntity() {
		return dormEntity;
	}

	public void setDormEntity(DormEntity dormEntity) {
		this.dormEntity = dormEntity;
	}

	public Integer getCon_id() {
		return con_id;
	}

	public void setCon_id(Integer con_id) {
		this.con_id = con_id;
	}

	public Integer getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(Integer dorm_id) {
		this.dorm_id = dorm_id;
	}

	public String getCon_wifi() {
		return con_wifi;
	}

	public void setCon_wifi(String con_wifi) {
		this.con_wifi = con_wifi;
	}

	public String getCon_park() {
		return con_park;
	}

	public void setCon_park(String con_park) {
		this.con_park = con_park;
	}

	public String getCon_washing() {
		return con_washing;
	}

	public void setCon_washing(String con_washing) {
		this.con_washing = con_washing;
	}

	public String getCon_waterfilter() {
		return con_waterfilter;
	}

	public void setCon_waterfilter(String con_waterfilter) {
		this.con_waterfilter = con_waterfilter;
	}

	public String getCon_keycard() {
		return con_keycard;
	}

	public void setCon_keycard(String con_keycard) {
		this.con_keycard = con_keycard;
	}

	public String getCon_pet() {
		return con_pet;
	}

	public void setCon_pet(String con_pet) {
		this.con_pet = con_pet;
	}

	public String getCon_securitycctv() {
		return con_securitycctv;
	}

	public void setCon_securitycctv(String con_securitycctv) {
		this.con_securitycctv = con_securitycctv;
	}

	public String getCon_smoking() {
		return con_smoking;
	}

	public void setCon_smoking(String con_smoking) {
		this.con_smoking = con_smoking;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
