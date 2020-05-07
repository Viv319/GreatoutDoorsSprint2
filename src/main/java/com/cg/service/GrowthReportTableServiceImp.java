package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.dao.GrowthReportTableDaoI;
import com.cg.entity.GrowthReportTable;

@Service
public class GrowthReportTableServiceImp implements GrowthReportTableServiceI {

	@Autowired
	GrowthReportTableDaoI growthdao;
	
	
	

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		return growthdao.retrive();
	}
	
	@Override
	public GrowthReportTable findbyId(int userId)
	{
		return growthdao.findById(userId);
		
	}
	
	

	@Override
	public void insertData(GrowthReportTable g) {
		// TODO Auto-generated method stub
		growthdao.insertData(g);
		
	}
	

}
