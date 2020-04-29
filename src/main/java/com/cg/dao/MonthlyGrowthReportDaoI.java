package com.cg.dao;

import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface MonthlyGrowthReportDaoI {
	
	public List monthlyGrowthReport();
}
