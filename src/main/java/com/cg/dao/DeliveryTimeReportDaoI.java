package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.DeliveryTimeReport;


public interface DeliveryTimeReportDaoI {
	
//		public List iteamDeliveryTime();
//		public List productDeliveryTime();
		
		public void insertData(DeliveryTimeReport d);
		public List retrive();
	/* public void create(DeliveryTimeReport d); */
		
	}