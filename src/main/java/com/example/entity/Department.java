package com.example.entity;

import jakarta.persistence.*;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@OneToMany(mappedBy="Employee")
	private int dId;
	private String dName;
	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	

}
