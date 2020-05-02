package com.cg.entity;

import java.util.Date;

import javax.annotation.Priority;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Table(name="DeliveryTimeReport")
public class DeliveryTimeReport {

	
	@Id
	private int userId;
	
	@Column
	private Date iteamDispatchTime;
	
	@Column
	private Date iteamRecieveTime;
	
	@Column
	private Date productCategoryDispatchTime;
	
	@Column
	private Date productCategoryRecieveTime;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
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


	public DeliveryTimeReport(int userId, Date iteamDispatchTime, Date iteamRecieveTime,
			Date productCategoryDispatchTime, Date productCategoryRecieveTime) {
		super();
		this.userId = userId;
		this.iteamDispatchTime = iteamDispatchTime;
		this.iteamRecieveTime = iteamRecieveTime;
		this.productCategoryDispatchTime = productCategoryDispatchTime;
		this.productCategoryRecieveTime = productCategoryRecieveTime;
	}
	public DeliveryTimeReport() {
		super();
	}
	
	
	
	
	

}
