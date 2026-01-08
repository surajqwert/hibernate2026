package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.model.Address;
import com.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEmployeeController {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		
		Employee e1 = new Employee();
		
		Address ad1 = new Address();
		Address ad2 = new Address();
		
		ad1.setLanNumber(1024);
		ad1.setAreaName("Aundh");
		ad1.setCityName("Pune");
		
		ad2.setLanNumber(1025);
		ad2.setAreaName("Andheri");
		ad2.setCityName("Mumbai");
		
		List<Address> newList = new ArrayList<Address>();
		newList.add(ad1);
		newList.add(ad2);
		
		e1.setName("Daisy");
		e1.setSalary(20000);
		e1.setAddressList(newList);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();

	}

}
