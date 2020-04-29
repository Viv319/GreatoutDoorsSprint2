package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.DeliveryTimeReportDaoI;
import com.cg.entity.*;
import com.cg.service.DeliveryTimeReportServiceI;
import com.cg.service.GrowthReportTableServiceI;

@RestController
public class Controller {

	@Autowired
	DeliveryTimeReportServiceI dService;
	GrowthReportTableServiceI gService;

	@GetMapping(value = "/deliveryTimeReport")
	public <DeliveryTimeReport> List<DeliveryTimeReport> fetchTable() {
		return dService.reterive();
	}

	
	  @PostMapping(value="/deliveryTimeReport/new" ,consumes = {"application/json"}) 
	  public String addData(@RequestBody DeliveryTimeReport d) {
		  dService.insertData(d); 
		  return "data added"; 
		  }
	 
	  @GetMapping(value = "/growthReportTable")
	  public <GrowthReportTable> List <GrowthReportTable> fetchGrowthTable()
	  {
		  return gService.reterive();
	  }
	  
	  @PostMapping (value="/growthReportTable/new",consumes = {"application/json"})
	  public String addGrowthData(@RequestBody GrowthReportTable g) {
		  gService.insertData(g);
		  return "data added successfuly";
	  }
}
