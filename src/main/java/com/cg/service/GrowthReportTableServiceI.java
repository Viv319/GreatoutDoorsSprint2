package com.cg.service;

import java.util.List;



import com.cg.entity.GrowthReportTable;


public interface GrowthReportTableServiceI {

	public List retrive();
	public GrowthReportTable findbyId(int userId);
	public void insertData(GrowthReportTable g);
}
