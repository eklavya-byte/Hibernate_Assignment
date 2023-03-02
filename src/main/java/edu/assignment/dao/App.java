package edu.assignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.prem.assignment.Company;
import edu.prem.assignment.GST;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Prem_Prakash");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Company company = new Company();
		company.setId(1);
		company.setName("tata ");
		company.setPhone(2353423232l);
		company.setEmail("Tata@tata.com");
		
		GST gstOb = new GST();
		gstOb.setId(1);
		gstOb.setGstNumber("27AAACT2727Q1ZW");
		gstOb.setStatus("Active");
		
		company.setGst(gstOb);
		
		transaction.begin();
		manager.persist(gstOb);
		manager.persist(company);
		transaction.commit();
		
//		Company com = manager.find(Company.class, 1);
//		System.out.println(com);
//		GST gstref = manager.find(GST.class, 1);
//		System.out.println(gstref);
		
		manager.close();
		factory.close();
	}

}
