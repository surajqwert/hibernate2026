package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long aId;
	@Column(name = "actor_name" , length = 50)
	private String aname;
	@Column(name = "actor_movie" , length = 30)
	private String amovie;
	
	public Actor() {
		super();
	}

	public Actor(long aId, String aname, String amovie) {
		super();
		this.aId = aId;
		this.aname = aname;
		this.amovie = amovie;
	}

	public long getaId() {
		return aId;
	}

	public void setaId(long aId) {
		this.aId = aId;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAmovie() {
		return amovie;
	}

	public void setAmovie(String amovie) {
		this.amovie = amovie;
	}
	
	

}
