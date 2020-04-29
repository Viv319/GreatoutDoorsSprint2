package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import com.cg.entity.DeliveryTimeReport;

@Transactional
@Repository
public class DeliveryTimeReportDaoImp implements DeliveryTimeReportDaoI {

	@Persistent
	EntityManager em;
	
	/*
	 * @Override public List iteamDeliveryTime() { // TODO Auto-generated method
	 * stub
	 * 
	 * return null; }
	 * 
	 * @Override public List productDeliveryTime() { // TODO Auto-generated method
	 * stub return null; }
	 */
	
	
	@Override
	public void insertData(DeliveryTimeReport d) {
		// TODO Auto-generated method stub
		em.persist(d);
		
	}

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("from DeliveryTimeReport d");
		return q.getResultList();
	}
}