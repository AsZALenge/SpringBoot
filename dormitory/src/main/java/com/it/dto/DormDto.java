package com.it.dto;

import java.math.BigDecimal;
import java.util.List;

public class DormDto {

	private int dorm_id;
	private int id;
	private String dorm_name;
	private String dorm_address;
	private String dorm_numbank;
	private String dorm_namebank;
	private int type_id;
	private String dorm_waterbill;
	private String dorm_electricbill;
	private String dorm_img;
	private BigDecimal dorm_pricedate_start;
	private BigDecimal dorm_pricedate_end;
	private BigDecimal dorm_pricemonth_start;
	private BigDecimal dorm_pricemonth_end;
	private String dorm_status;
	private List<RoomDto> rooms;
	
	
	
	public List<RoomDto> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomDto> rooms) {
		this.rooms = rooms;
	}

	public DormDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public DormDto(int dorm_id, int id, String dorm_name, String dorm_address, String dorm_numbank,
			String dorm_namebank, int type_id, String dorm_waterbill, String dorm_electricbill, String dorm_img,
			BigDecimal dorm_pricedate_start, BigDecimal dorm_pricedate_end, BigDecimal dorm_pricemonth_start,
			BigDecimal dorm_pricemonth_end, String dorm_status, List<RoomDto> rooms, DormtypeDto dormtype,
			ConvenientDto conDto) {
		super();
		this.dorm_id = dorm_id;
		this.id = id;
		this.dorm_name = dorm_name;
		this.dorm_address = dorm_address;
		this.dorm_numbank = dorm_numbank;
		this.dorm_namebank = dorm_namebank;
		this.type_id = type_id;
		this.dorm_waterbill = dorm_waterbill;
		this.dorm_electricbill = dorm_electricbill;
		this.dorm_img = dorm_img;
		this.dorm_pricedate_start = dorm_pricedate_start;
		this.dorm_pricedate_end = dorm_pricedate_end;
		this.dorm_pricemonth_start = dorm_pricemonth_start;
		this.dorm_pricemonth_end = dorm_pricemonth_end;
		this.dorm_status = dorm_status;
		this.rooms = rooms;
		this.dormtype = dormtype;
		this.conDto = conDto;
	}



	private DormtypeDto dormtype;
	
	private ConvenientDto conDto;

	public int getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(int dorm_id) {
		this.dorm_id = dorm_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDorm_name() {
		return dorm_name;
	}

	public void setDorm_name(String dorm_name) {
		this.dorm_name = dorm_name;
	}

	public String getDorm_address() {
		return dorm_address;
	}

	public void setDorm_address(String dorm_address) {
		this.dorm_address = dorm_address;
	}

	public String getDorm_numbank() {
		return dorm_numbank;
	}

	public void setDorm_numbank(String dorm_numbank) {
		this.dorm_numbank = dorm_numbank;
	}

	public String getDorm_namebank() {
		return dorm_namebank;
	}

	public void setDorm_namebank(String dorm_namebank) {
		this.dorm_namebank = dorm_namebank;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getDorm_waterbill() {
		return dorm_waterbill;
	}

	public void setDorm_waterbill(String dorm_waterbill) {
		this.dorm_waterbill = dorm_waterbill;
	}

	public String getDorm_electricbill() {
		return dorm_electricbill;
	}

	public void setDorm_electricbill(String dorm_electricbill) {
		this.dorm_electricbill = dorm_electricbill;
	}

	public String getDorm_img() {
		return dorm_img;
	}

	public void setDorm_img(String dorm_img) {
		this.dorm_img = dorm_img;
	}

	public String getDorm_status() {
		return dorm_status;
	}

	public void setDorm_status(String dorm_status) {
		this.dorm_status = dorm_status;
	}

	public DormtypeDto getDormtype() {
		return dormtype;
	}

	public void setDormtype(DormtypeDto dormtype) {
		this.dormtype = dormtype;
	}

	public ConvenientDto getConDto() {
		return conDto;
	}

	public void setConDto(ConvenientDto conDto) {
		this.conDto = conDto;
	}

	public BigDecimal getDorm_pricedate_start() {
		return dorm_pricedate_start;
	}

	public void setDorm_pricedate_start(BigDecimal dorm_pricedate_start) {
		this.dorm_pricedate_start = dorm_pricedate_start;
	}

	public BigDecimal getDorm_pricedate_end() {
		return dorm_pricedate_end;
	}

	public void setDorm_pricedate_end(BigDecimal dorm_pricedate_end) {
		this.dorm_pricedate_end = dorm_pricedate_end;
	}

	public BigDecimal getDorm_pricemonth_start() {
		return dorm_pricemonth_start;
	}

	public void setDorm_pricemonth_start(BigDecimal dorm_pricemonth_start) {
		this.dorm_pricemonth_start = dorm_pricemonth_start;
	}

	public BigDecimal getDorm_pricemonth_end() {
		return dorm_pricemonth_end;
	}

	public void setDorm_pricemonth_end(BigDecimal dorm_pricemonth_end) {
		this.dorm_pricemonth_end = dorm_pricemonth_end;
	}
	
}
