package com.it.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_dorm")
public class DormEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "dorm_id")
	private Integer dorm_id;
	
	@Column(name = "id")
	private Integer id;

	@Column(name = "dorm_name")
	private String dorm_name;

	@Column(name = "dorm_address")
	private String dorm_address;

	@Column(name = "dorm_numbank")
	private String dorm_numbank;

	@Column(name = "dorm_namebank")
	private String dorm_namebank;
	
	@Column(name = "type_id", nullable=false)
	private Integer type_id;
	
	@Column(name = "dorm_waterbill")
	private String dorm_waterbill;
	
	@Column(name = "dorm_electricbill")
	private String dorm_electricbill;
	
	@Column(name = "dorm_img")
	private String dorm_img;
	
	@Column(name = "dorm_pricedate")
	private String dorm_pricedate;
	
	@Column(name = "dorm_pricemonth")
	private String dorm_pricemonth;
	
	@Column(name = "dorm_status")
	private String dorm_status;

	@ManyToOne (cascade=CascadeType.REFRESH)
    @JoinColumn(name = "type_id", referencedColumnName = "type_id", insertable=false, updatable=false)
	private DormtypeEntity dormtypeEntity;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dorm_id", referencedColumnName = "dorm_id", insertable=false, updatable=false)
	private ConvenientEntity convenientEntity;

	@OneToMany (cascade=CascadeType.REFRESH)
	@JoinColumn(name = "dorm_id", referencedColumnName = "dorm_id", insertable=false, updatable=false)
	private List<RoomEntity> roomEntities;
	
	
	
	public List<RoomEntity> getRoomEntities() {
		return roomEntities;
	}

	public void setRoomEntities(List<RoomEntity> roomEntities) {
		this.roomEntities = roomEntities;
	}

	public Integer getDorm_id() {
		return dorm_id;
	}

	public void setDorm_id(Integer dorm_id) {
		this.dorm_id = dorm_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
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

	public String getDorm_pricedate() {
		return dorm_pricedate;
	}

	public void setDorm_pricedate(String dorm_pricedate) {
		this.dorm_pricedate = dorm_pricedate;
	}

	public String getDorm_pricemonth() {
		return dorm_pricemonth;
	}

	public void setDorm_pricemonth(String dorm_pricemonth) {
		this.dorm_pricemonth = dorm_pricemonth;
	}

	public String getDorm_status() {
		return dorm_status;
	}

	public void setDorm_status(String dorm_status) {
		this.dorm_status = dorm_status;
	}

	public DormtypeEntity getDormtypeEntity() {
		return dormtypeEntity;
	}

	public void setDormtypeEntity(DormtypeEntity dormtypeEntity) {
		this.dormtypeEntity = dormtypeEntity;
	}

	public ConvenientEntity getConvenientEntity() {
		return convenientEntity;
	}

	public void setConvenientEntity(ConvenientEntity convenientEntity) {
		this.convenientEntity = convenientEntity;
	}


	
}
