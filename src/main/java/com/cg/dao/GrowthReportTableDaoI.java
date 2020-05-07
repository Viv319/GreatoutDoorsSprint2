package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.GrowthReportTable;


public interface GrowthReportTableDaoI {
	
	public void insertData(GrowthReportTable g);
	public List retrive();
	public GrowthReportTable findById(int userId);
	
	

}
