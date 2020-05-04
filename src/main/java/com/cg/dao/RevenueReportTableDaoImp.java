package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

//import com.cg.entity.RevenueReportTable;



@Repository
@Transactional
public class RevenueReportTableDaoImp implements RevenueReportTableDaoI{

	@PersistenceContext
	EntityManager entityManager;
	
//	@Override
//	public void insertData(RevenueReportTable g) {
//		// TODO Auto-generated method stub
//		entityManager.persist(g);
//		
//	}

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("from RevenueReportTable g");
		return q.getResultList();
	}

	

}
