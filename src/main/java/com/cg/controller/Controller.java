package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.DeliveryTimeReportDaoI;
import com.cg.entity.*;
import com.cg.service.DeliveryTimeReportServiceI;
import com.cg.service.GrowthReportTableServiceI;
import com.cg.service.RevenueReportTableServiceI;

//@CrossOrigin(origins="*")
@RestController
public class Controller {

	@Autowired
	DeliveryTimeReportServiceI dService;
	
	@Autowired
	GrowthReportTableServiceI gService;
	
	@Autowired
	RevenueReportTableServiceI rService;
	
	@GetMapping(value = "/deliveryTimeReport")
	public List<DeliveryTimeReport> fetchTable() {
		return dService.retrive();
	}

	
	  @PostMapping(value="/deliveryTimeReport/new" ,consumes = {"application/json"}) 
	  public String addData(@RequestBody DeliveryTimeReport newDataInsert) {
		  dService.insertData(newDataInsert); 
		  return "data added"; 
		  }
	 
	  @GetMapping(value = "/growthReportTable")
	   List <GrowthReportTable> fetchGrowthTable()
	  {
		  return gService.retrive();
	  }
	  
	  @PostMapping (value="/growthReportTable/new",consumes = {"application/json"})
	  public String addGrowthData(@RequestBody GrowthReportTable g) {
		  gService.insertData(g);
		  return "data added successfuly";
	  }
	  
	  /*@GetMapping(value = "/revenueReportTable")
		public List<RevenueReportTable> fetchRevenueTable() {
			return rService.retrive();
		}

		
		  @PostMapping(value="/revenueReportTable/new" ,consumes = {"application/json"}) 
		  public String addData(@RequestBody RevenueReportTable newDataInsert) {
			  rService.insertData(newDataInsert); 
			  return "data in revenue report table"; 
			  }
			  */
}
