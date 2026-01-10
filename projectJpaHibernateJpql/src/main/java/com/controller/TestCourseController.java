package com.controller;

import java.util.List;

import com.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestCourseController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crs");
		EntityManager em = emf.createEntityManager();
		
//		Course c1 = new Course();
//		c1.setCourseName("Python");
//		c1.setCoursePrice(18000);
//		
//		em.getTransaction().begin();
//		em.persist(c1);
//		em.getTransaction().commit();
		
		Query q = em.createQuery("select c from Course c where c.coursePrice = 40000");
		List <Course> li = q.getResultList();
		
		for(Course c : li) {
		System.out.println(c.getCourseId() + " " + c.getCourseName() + " " + c.getCoursePrice());
		}
		
		
		em.createNamedQuery("find Name");
		List <String> courseList = q.getResultList();
		

	}

}
