package com.cg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderTable")
public class OrderTable {
	
		@Id
		private int userId;
	
		@Column
		private String orderId;
		
		@Column
		private String addressId;
		
		@Column
		private byte orderDispatchStatus;
		
		@Column
		private Date orderInitiateTime;
		
		@Column
		private Date orderDispatchTime;

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		

		public String getAddressId() {
			return addressId;
		}

		public void setAddressId(String addressId) {
			this.addressId = addressId;
		}

		public byte getOrderDispatchStatus() {
			return orderDispatchStatus;
		}

		public void setOrderDispatchStatus(byte orderDispatchStatus) {
			this.orderDispatchStatus = orderDispatchStatus;
		}

		public Date getOrderInitiateTime() {
			return orderInitiateTime;
		}

		public void setOrderInitiateTime(Date orderInitiateTime) {
			this.orderInitiateTime = orderInitiateTime;
		}

		public Date getOrderDispatchTime() {
			return orderDispatchTime;
		}

		public void setOrderDispatchTime(Date orderDispatchTime) {
			this.orderDispatchTime = orderDispatchTime;
		}

		public OrderTable() {
			super();
		}
		
		public OrderTable(int userId, String orderId, String addressId, byte orderDispatchStatus,
				Date orderInitiateTime, Date orderDispatchTime) {
			super();
			this.userId = userId;
			this.orderId = orderId;
			this.addressId = addressId;
			this.orderDispatchStatus = orderDispatchStatus;
			this.orderInitiateTime = orderInitiateTime;
			this.orderDispatchTime = orderDispatchTime;
		}

	}


