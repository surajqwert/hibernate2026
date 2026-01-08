package com.controller;

import com.model.CurrentEmployee;
import com.model.RetiredEmployee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEmployeeController {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp1");
		EntityManager em = emf.createEntityManager();	
		
		CurrentEmployee c1 = new CurrentEmployee();
		c1.setName("John");
		c1.setSalary(34000);
		
		RetiredEmployee r1 = new RetiredEmployee();
		r1.setName("Chloe");
		r1.setPension(55000);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(r1);
		em.getTransaction().commit();
	}

}
