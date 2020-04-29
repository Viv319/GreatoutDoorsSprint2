package com.cg;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.DeliveryTimeReportDaoI;
import com.cg.dao.GrowthReportTableDaoI;
import com.cg.entity.DeliveryTimeReport;
import com.cg.entity.GrowthReportTable;

@SpringBootApplication
public class NewGreatoutDoorsApplication implements CommandLineRunner {

	@Autowired
	DeliveryTimeReportDaoI dDao;
	
	@Autowired
	GrowthReportTableDaoI gDao;
	
	public static void main(String[] args) {
		SpringApplication.run(NewGreatoutDoorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Date date1=new Date(12/01/2020);
		Date date2= new Date(15/01/2020);
		Date date3=new Date(13/01/2020);
		Date date4= new Date(18/01/2020);
		Date date5=new Date(12/01/2020);
		Date date6= new Date(14/01/2020);
		Date date7=new Date(19/01/2020);
		Date date8= new Date(27/01/2020);
		Date date9=new Date(25/01/2020);
		Date date10= new Date(02/02/2020);
		
//		DeliveryTimeReport d1= new DeliveryTimeReport("A101",date1,date2,date3,date4);
//		DeliveryTimeReport d2= new DeliveryTimeReport("A102",date5,date6,date7,date8);
//		
//		dDao.insertData(d1);
//		dDao.insertData(d2);
//		System.out.println("record inserted");
//		
//		List<DeliveryTimeReport> salesList =dDao.retrive();
//		
//		for(DeliveryTimeReport stu:salesList)
//	 { System.out.println("iteam dispatch time "+ stu.getIteamDispatchTime() +" \n iteam receive time "+
//			  stu.getIteamRecieveTime() +"\n rest can be implement here  " ); }
//
//	}
	
	GrowthReportTable g1 = new GrowthReportTable("Jan",1800,1800,100,"Green");
	GrowthReportTable g2 = new GrowthReportTable("Feb",2000,200,10,"Blue");
	
	gDao.insertData(g1);
	gDao.insertData(g2);
	
		List<GrowthReportTable> growthSalesList =gDao.retrive();
	
		for(GrowthReportTable stu:growthSalesList)
			{ System.out.println("percentage growth "+ stu.getPercentageGrowth() +" \n total revenue "+
					stu.getRevenue() +"\n rest can be implement here  " ); }
			}
	
	
}