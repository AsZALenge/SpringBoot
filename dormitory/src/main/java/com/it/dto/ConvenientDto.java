package com.it.dto;

import java.io.Serializable;

public class ConvenientDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int con_id;
	private int dorm_id;
	private String con_wifi;
	private String con_park;
	private String con_washing;
	private String con_waterfilter;
	private String con_keycard;
	private String con_pet;
	private String con_securitycctv;
	private String con_smoking;
	
	public ConvenientDto() {
		super();
	}

	public ConvenientDto(int con_id, int dorm_id, String con_wifi, String con_park, String con_washing, String con_waterfilter,String con_keycard, String con_pet, String con_securitycctv, String con_smoking) {
		super();
		this.con_id = con_id;
		this.dorm_id = dorm_id;
		this.con_wifi = con_wifi;
		this.con_park = con_park;
		this.con_washing = con_washing;
		this.con_waterfilter = con_waterfilter;
		this.con_keycard = con_keycard;
		this.con_pet = con_pet;
		this.con_securitycctv = con_securitycctv;
		this.con_smoking = con_smoking;
	}
	
	private ConvenientDto conDto;

	public int getCon_id() {
		return con_id;
	}

	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}

	public int getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(int dorm_id) {
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

	public ConvenientDto getConDto() {
		return conDto;
	}

	public void setConDto(ConvenientDto conDto) {
		this.conDto = conDto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
