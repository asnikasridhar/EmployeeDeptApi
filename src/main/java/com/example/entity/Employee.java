package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eId;
	private String eName;
	
	@ManyToOne
	@JoinColumn(name="dId", referencedColumnName="dId")
	private Department department;


	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public Department getdept() {
		return department;
	}

	public void setdept(Department department) {
		this.department = department;
	}
	

}
