package com.vishal.springcloud.dto;

import java.math.BigDecimal;

public class Coupon {
	//dto class is used for the objects used in microservices these ned not be saved into the database
	private long id;
	private String code;
	private BigDecimal discount;
	private String expDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
