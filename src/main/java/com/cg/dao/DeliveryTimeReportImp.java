package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class DeliveryTimeReportImp implements DeliveryTimeReportI {

	@Persistent
	EntityManager em;
	
	@Override
	public List iteamDeliveryTime() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List productDeliveryTime() {
		// TODO Auto-generated method stub
		return null;
	}
}