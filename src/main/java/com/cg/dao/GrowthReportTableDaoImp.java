package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Persistent;
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
	public void delete(int userId)
	{
		GrowthReportTable g=entityManager.find(GrowthReportTable.class, userId);
		System.out.println(g.getUserId()+ " ");
		entityManager.remove(g);
		
	}

	@Override
	public void insertData(GrowthReportTable g) {
		// TODO Auto-generated method stub
		entityManager.persist(g);
		
	}
}
