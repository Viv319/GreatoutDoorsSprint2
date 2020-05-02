package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GrowthReportTable")
public class GrowthReportTable {
	
	@Id
	private int userId;
	
	@Column
	String period;
	
	@Column
	double revenue;
	
	@Column
	double amountChange;
	
	@Column
	double percentageGrowth;
	
	@Column
	String colrCode;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getAmountChange() {
		return amountChange;
	}
	public void setAmountChange(double amountChange) {
		this.amountChange = amountChange;
	}
	public double getPercentageGrowth() {
		return percentageGrowth;
	}
	public void setPercentageGrowth(double percentageGrowth) {
		this.percentageGrowth = percentageGrowth;
	}
	public String getColrCode() {
		return colrCode;
	}
	public void setColrCode(String colrCode) {
		this.colrCode = colrCode;
	}
	
	
	


	public GrowthReportTable(int userId, String period, double revenue, double amountChange, double percentageGrowth,
			String colrCode) {
		super();
		this.userId = userId;
		this.period = period;
		this.revenue = revenue;
		this.amountChange = amountChange;
		this.percentageGrowth = percentageGrowth;
		this.colrCode = colrCode;
	}
	public GrowthReportTable() {
		super();
	}
	
	

}
