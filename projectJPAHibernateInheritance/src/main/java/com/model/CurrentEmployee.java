package com.model;

import jakarta.persistence.Entity;

@Entity
public class CurrentEmployee extends Employee {
	
	private int salary;

	public CurrentEmployee() {
		super();
	}

	public CurrentEmployee(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
