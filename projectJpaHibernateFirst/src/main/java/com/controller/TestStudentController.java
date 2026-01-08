package com.controller;

import com.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestStudentController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stu");
		
		EntityManager em = emf.createEntityManager();
		
		Student s1 = new Student();
		s1.setStudentName("Bob");
		s1.setStudentMarks(95);
		
		Student s2 = new Student();
		s2.setStudentName("Casey");
		s2.setStudentMarks(91);
		
		em.getTransaction().begin();
		
		em.persist(s1);
		em.persist(s2);
		em.getTransaction().commit();
	}
}
