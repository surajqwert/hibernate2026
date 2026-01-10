package com.controller;

import com.model.Course;
import com.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestStudentCourse {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stcourse");
		EntityManager em = emf.createEntityManager();
		
		Student s = new Student();
		Course c = new Course();
		
		c.setCourseName("BTech");
		c.setCoursePrice(108000);
		
		s.setStudentName("Edward");
		s.setCourse(c);
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(s);
		em.getTransaction().commit();

	}

}
