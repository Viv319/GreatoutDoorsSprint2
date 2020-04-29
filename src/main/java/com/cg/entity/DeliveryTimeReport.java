package com.cg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DeliveryTimeReport")
public class DeliveryTimeReport {

	
	@Column
	private Date iteamDispatchTime;
	
	@Column
	private Date iteamRecieveTime;
	
	@Column
	private Date productCategoryDispatchTime;
	
	@Column
	private Date productCategoryRecieveTime;
	
	
	
	
	
	
	public Date getIteamDispatchTime() {
		return iteamDispatchTime;
	}
	public void setIteamDispatchTime(Date iteamDispatchTime) {
		this.iteamDispatchTime = iteamDispatchTime;
	}
	public Date getIteamRecieveTime() {
		return iteamRecieveTime;
	}
	public void setIteamRecieveTime(Date iteamRecieveTime) {
		this.iteamRecieveTime = iteamRecieveTime;
	}
	public Date getProductCategoryDispatchTime() {
		return productCategoryDispatchTime;
	}
	public void setProductCategoryDispatchTime(Date productCategoryDispatchTime) {
		this.productCategoryDispatchTime = productCategoryDispatchTime;
	}
	public Date getProductCategoryRecieveTime() {
		return productCategoryRecieveTime;
	}
	public void setProductCategoryRecieveTime(Date productCategoryRecieveTime) {
		this.productCategoryRecieveTime = productCategoryRecieveTime;
	}
	public DeliveryTimeReport(String userId, Date iteamDispatchTime, Date iteamRecieveTime,
			Date productCategoryDispatchTime, Date productCategoryRecieveTime) {
		super();
		
		this.iteamDispatchTime = iteamDispatchTime;
		this.iteamRecieveTime = iteamRecieveTime;
		this.productCategoryDispatchTime = productCategoryDispatchTime;
		this.productCategoryRecieveTime = productCategoryRecieveTime;
	}
	public DeliveryTimeReport() {
		super();
	}
	
	
	
	
	

}
