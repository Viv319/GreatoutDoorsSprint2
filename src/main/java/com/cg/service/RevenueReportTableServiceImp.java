package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.GrowthReportTableDaoI;
import com.cg.dao.RevenueReportTableDaoI;
//import com.cg.entity.RevenueReportTable;

@Service
public class RevenueReportTableServiceImp implements RevenueReportTableServiceI {

	@Autowired
	RevenueReportTableDaoI revenueDao;
	
//	@Override
//	public void insertData(RevenueReportTable g) {
//		// TODO Auto-generated method stub
//		revenueDao.insertData(g);
//	}
	

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		return revenueDao.retrive();
	}

}
