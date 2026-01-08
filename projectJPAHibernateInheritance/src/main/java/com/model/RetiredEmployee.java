package com.model;

import jakarta.persistence.Entity;

@Entity
public class RetiredEmployee extends Employee {

	private int pension;

	public RetiredEmployee() {
		super();
	}

	public RetiredEmployee(int pension) {
		super();
		this.pension = pension;
	}

	public int getPension() {
		return pension;
	}

	public void setPension(int pension) {
		this.pension = pension;
	}
	
	
}
