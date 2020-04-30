package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.GrowthReportTable;

@Service
public interface GrowthReportTableServiceI {
	public void insertData(GrowthReportTable g);
	public List reterive();

}
