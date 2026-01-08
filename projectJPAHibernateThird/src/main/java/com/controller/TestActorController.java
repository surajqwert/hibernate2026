package com.controller;

import com.model.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestActorController {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("actor");
		EntityManager em = emf.createEntityManager();
		
//		Actor a1 = new Actor();
//		a1.setAmovie("Mission Impossible");
//		a1.setAname("Tom Cruise");
		
//		Actor a2 = new Actor();
//		a2.setAmovie("Iron Man");
//		a2.setAname("Robert Downey");
		
//		Actor a3 = new Actor();
//		a3.setAmovie("Pirates of Carribean");
//		a3.setAname("Ranbir Kapoor");
		
//		em.getTransaction().begin();
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		em.getTransaction().commit();
		
//		Actor a4 = em.find(Actor.class, 1);
//		System.out.println(a4.getaId() + " " + a4.getAname() + " " + a4.getAmovie());
		
//		Actor a5 = em.find(Actor.class, 3);
//		a5.setAname("Johhny Depp");
//		
//		em.getTransaction().begin();
//		em.persist(a5);
//		em.getTransaction().commit();
		
//		Actor a6 = em.find(Actor.class, 2);
//		em.getTransaction().begin();
//		em.remove(a6);
//		em.getTransaction().commit();
	}

}
