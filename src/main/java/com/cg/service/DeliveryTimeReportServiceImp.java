package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DeliveryTimeReportDaoI;
import com.cg.entity.DeliveryTimeReport;

@Service
public class DeliveryTimeReportServiceImp implements DeliveryTimeReportServiceI {

	@Autowired
	DeliveryTimeReportServiceI deliverydao;
	
	@Override
	public void insertData(DeliveryTimeReport d) {
		// TODO Auto-generated method stub
		deliverydao.insertData(d);

	}


	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		return deliverydao.retrive();
	}  

}
