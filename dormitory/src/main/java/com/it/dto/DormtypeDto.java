package com.it.dto;

import java.io.Serializable;

public class DormtypeDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private int type_id;
	private String type_name;
	private String type_detail;
	private String type_status;
	
	public DormtypeDto() {
		super();
	}

	public DormtypeDto(int type_id, String type_name, String type_detail, String type_status) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_detail = type_detail;
		this.type_status = type_status;
	}
	
	private DormtypeDto dormtype;

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getType_detail() {
		return type_detail;
	}

	public void setType_detail(String type_detail) {
		this.type_detail = type_detail;
	}

	public String getType_status() {
		return type_status;
	}

	public void setType_status(String type_status) {
		this.type_status = type_status;
	}

	public DormtypeDto getDormtype() {
		return dormtype;
	}

	public void setDormtype(DormtypeDto dormtype) {
		this.dormtype = dormtype;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
