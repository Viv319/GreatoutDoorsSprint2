package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryTimeReportI {
	
		public List iteamDeliveryTime();
		public List productDeliveryTime();
		
	}