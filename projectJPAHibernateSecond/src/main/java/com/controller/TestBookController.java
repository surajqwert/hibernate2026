package com.controller;

import com.model.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestBookController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("books");
		EntityManager em = emf.createEntityManager();
		
//		Book b1 = new Book();
//		b1.setTitle("JavaScript Book");
//		b1.setAuthor("Briden Eich");
//		
//		em.getTransaction().begin();
//		em.persist(b1);
//		em.getTransaction().commit();
		
//		Book b2 = em.find(Book.class, 1);
//		System.out.println(b2.getId() + " " + b2.getTitle() + " " + b2.getAuthor());
		
		Book b3 = em.find(Book.class, 52);
		
		em.getTransaction().begin();
		em.remove(b3);
		em.getTransaction().commit();
	}

}
