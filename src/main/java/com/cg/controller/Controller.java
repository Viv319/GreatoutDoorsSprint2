package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.*;
import com.cg.service.GrowthReportTableServiceI;

@CrossOrigin(origins="*")
@RestController
public class Controller {

	
	@Autowired
	GrowthReportTableServiceI gService;
	
	
	
	 
	  @GetMapping(value = "/growthReportTable")
	   List <GrowthReportTable> fetchGrowthTable()
	  {
		  return gService.retrive();
	  }
	  
	  @GetMapping(value="/growthReportTable/{userId}")
	  public GrowthReportTable fetchone(@PathVariable int userId)
	  {
		  return gService.findbyId(userId);
	  }
	  
	  @DeleteMapping (value ="/growthReportTable/delete/{userId}")
	  public String deletestudent (@PathVariable int userId)
	  {
		  gService.delete(userId);
		  return "user data deleated";
	  }
	  
		  
}
