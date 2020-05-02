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
import com.cg.dao.RevenueReportTableDaoI;
import com.cg.entity.DeliveryTimeReport;
import com.cg.entity.GrowthReportTable;
//import com.cg.entity.RevenueReportTable;

@SpringBootApplication
public class NewGreatoutDoorsApplication implements CommandLineRunner {

//	@Autowired
//	DeliveryTimeReportDaoI deliverydao;
	
	@Autowired
	GrowthReportTableDaoI growthDao;
	
	@Autowired
	RevenueReportTableDaoI revenueDao;
	
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
		
//		DeliveryTimeReport d1= new DeliveryTimeReport(101,date1,date2,date3,date4);
//		DeliveryTimeReport d2= new DeliveryTimeReport(102,date5,date6,date7,date8);
//		
//		deliverydao.insertData(d1);
//		deliverydao.insertData(d2);
//		System.out.println("record inserted");
//		
//		List<DeliveryTimeReport> salesList =deliverydao.retrive();
//		
//		for(DeliveryTimeReport stu:salesList) { 
//			System.out.println("1) iteam dispatch time "+ stu.getIteamDispatchTime() +
//					" \n 2)iteam receive time "+ stu.getIteamRecieveTime() +
//					" \n 3)product category dispatch time"+ stu.getProductCategoryDispatchTime() +
//					" \n 4)product category recieve time"+ stu.getProductCategoryRecieveTime() +
//					
//					"\n rest can be implement here  " ); 
//			}
//
//	}
	
/*	GrowthReportTable g1 = new GrowthReportTable(101,"Jan",1800,1800,100,"Green");
	GrowthReportTable g2 = new GrowthReportTable(102,"Feb",2000,200,10,"Blue");
	
	growthDao.insertData(g1);
	growthDao.insertData(g2);
	
		List<GrowthReportTable> growthSalesList =growthDao.retrive();
	
		for(GrowthReportTable stu:growthSalesList)
			{ System.out.println("percentage growth "+ stu.getPercentageGrowth() +
			" \n total revenue "+ stu.getRevenue() +
			" \n colour code"+ stu.getColrCode() +
			" \n amount of change" + stu.getAmountChange()
			
			+"\n rest can be implement here  " ); }
			}
	*/
		
	/*	RevenueReportTable r1 = new RevenueReportTable(101,date9,100002,20034,2,200.50);
		RevenueReportTable r2 = new RevenueReportTable(102,date10,100003,20035,3,350.80);
		
		revenueDao.insertData(r1);
		revenueDao.insertData(r2);
		
		List<RevenueReportTable> revenueSalesList = revenueDao.retrive();
		
		for(RevenueReportTable object:revenueSalesList)
		{
			System.out.println("user id "+ object.getUserId() +
					"\n date " + object.getDate() +
					"\n order Id " + object.getOrderId() +
					"\n product Id " + object.getProductId() +
					"\n more can be done like this"
					);
		}
		*/
	}
	
}