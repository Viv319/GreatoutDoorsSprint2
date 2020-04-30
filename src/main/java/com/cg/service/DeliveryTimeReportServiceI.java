package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.dao.DeliveryTimeReportDaoI;
import com.cg.entity.DeliveryTimeReport;

import java.util.List;

@Service
public interface DeliveryTimeReportServiceI {

	public void insertData(DeliveryTimeReport d);
	public List reterive();
	
	
}
