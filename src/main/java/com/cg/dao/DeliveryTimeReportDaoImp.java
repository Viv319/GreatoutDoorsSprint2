package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import com.cg.entity.DeliveryTimeReport;

@Transactional
@Repository
public class DeliveryTimeReportDaoImp implements DeliveryTimeReportDaoI {

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public void insertData(DeliveryTimeReport d1) {
		// TODO Auto-generated method stub
		entityManager.persist(d1);
		
	}

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("from DeliveryTimeReport d");
		return q.getResultList();
	}
}