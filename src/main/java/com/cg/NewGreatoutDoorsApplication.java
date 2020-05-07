package com.cg;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.GrowthReportTableDaoI;
import com.cg.entity.GrowthReportTable;

@SpringBootApplication
public class NewGreatoutDoorsApplication implements CommandLineRunner {

	
	@Autowired
	GrowthReportTableDaoI growthDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(NewGreatoutDoorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	
	
	/*GrowthReportTable g1 = new GrowthReportTable(101,"Jan",1800,1800,100,"Green");
	GrowthReportTable g2 = new GrowthReportTable(102,"Feb",2000,200,10,"Blue");
	GrowthReportTable g3 = new GrowthReportTable(103,"Mar",1900,-100,-5.2,"Red");
	GrowthReportTable g4 = new GrowthReportTable(104,"Apr",5000,3100,62,"Green");
	
	GrowthReportTable g5 = new GrowthReportTable(105,"May",1800,3200,177,"Green");
	GrowthReportTable g6 = new GrowthReportTable(106,"Jun",2100,300,14.28,"Blue");
	GrowthReportTable g7 = new GrowthReportTable(107,"Jul",2200,100,4.5,"Red");
	GrowthReportTable g8 = new GrowthReportTable(108,"Aug",4000,1800,45,"Green");
	
	GrowthReportTable g9 = new GrowthReportTable(109,"Sep",1800,3200,177,"Green");
	GrowthReportTable g10 = new GrowthReportTable(110,"Oct",2000,200,10,"Blue");
	GrowthReportTable g11 = new GrowthReportTable(111,"Nov",1900,-100,-5.2,"Red");
	GrowthReportTable g12 = new GrowthReportTable(112,"Dec",2100,200,9.5,"Green");
	
	
	growthDao.insertData(g1);
	growthDao.insertData(g2);
	growthDao.insertData(g3);
	growthDao.insertData(g4);
	
	growthDao.insertData(g5);
	growthDao.insertData(g6);
	growthDao.insertData(g7);
	growthDao.insertData(g8);
	
	growthDao.insertData(g9);
	growthDao.insertData(g10);
	growthDao.insertData(g11);
	growthDao.insertData(g12);
	
	*/
		List<GrowthReportTable> growthSalesList =growthDao.retrive();
	
		for(GrowthReportTable Object:growthSalesList)
			{ System.out.println("percentage growth "+ Object.getPercentageGrowth() +
			" \n total revenue "+ Object.getRevenue() +
			" \n colour code"+ Object.getColrCode() +
			" \n amount of change" + Object.getAmountChange()
			
			+"\n rest can be implement here  " ); }
			
	
		GrowthReportTable gObject=growthDao.findById(102); 
		
		System.out.println(gObject.getUserId()+ " "+
		gObject.getPercentageGrowth());	

		
	}
		
}
	