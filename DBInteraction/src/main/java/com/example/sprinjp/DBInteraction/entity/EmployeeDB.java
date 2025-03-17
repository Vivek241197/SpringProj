package com.example.sprinjp.DBInteraction.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeDB {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int EID;
	
	@Column(name="ENAME")
	private String ename;
	
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="DEPTID")
	@JsonIgnore
	private DepartmentDB department;
	
	public EmployeeDB() {
		
	}

	public EmployeeDB(int eID, String ename, DepartmentDB department) {
		super();
		EID = eID;
		this.ename = ename;
		this.department = department;
	}

	public int getEID() {
		return EID;
	}

	public void setEID(int eID) {
		EID = eID;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public DepartmentDB getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDB department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeDB [EID=" + EID + ", ename=" + ename + ", department=" + department + "]";
	}
	
	
}
