package com.controller;

import com.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestCourseController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crs");
		EntityManager em = emf.createEntityManager();
		
		Course c1 = new Course();
		c1.setCourseName("Python");
		c1.setCoursePrice(18000);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.getTransaction().commit();

	}

}
