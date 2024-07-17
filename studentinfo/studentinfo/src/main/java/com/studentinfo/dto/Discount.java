package com.studentinfo.dto;

import java.math.BigDecimal;

public class Discount {

	private Long id;
	private String conCode;
	private String endDate;
	private String startDate;
	private BigDecimal conPercentage;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConCode() {
		return conCode;
	}
	public void setConCode(String conCode) {
		this.conCode = conCode;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public BigDecimal getConPercentage() {
		return conPercentage;
	}
	public void setConPercentage(BigDecimal conPercentage) {
		this.conPercentage = conPercentage;
	}

}

