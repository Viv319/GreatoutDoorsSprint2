package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.GrowthReportTable;

@Repository
@Transactional
public class GrowthReportTableDaoImp implements GrowthReportTableDaoI {

	@PersistenceContext
	EntityManager entityManager;
	
	

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("from GrowthReportTable g");
		return q.getResultList();
	}

	@Override
	public GrowthReportTable findById(int userId)
	{
		return entityManager.find(GrowthReportTable.class, userId);
		
	}
	
	

	@Override
	public void insertData(GrowthReportTable g) {
		// TODO Auto-generated method stub
		entityManager.persist(g);
		
	}
}
