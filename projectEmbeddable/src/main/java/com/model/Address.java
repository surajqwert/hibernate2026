package com.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int lanNumber;
	private String cityName;
	private String areaName;
	
	public Address() {
		super();
	}

	public Address(int lanNumber, String cityName, String areaName) {
		super();
		this.lanNumber = lanNumber;
		this.cityName = cityName;
		this.areaName = areaName;
	}

	public int getLanNumber() {
		return lanNumber;
	}

	public void setLanNumber(int lanNumber) {
		this.lanNumber = lanNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	

}
