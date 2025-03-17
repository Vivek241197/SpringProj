package com.example.sprinjp.DBInteraction.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class DepartmentDB {
	
	@Id
	@Column(name="DEPTID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	
	@Column(name="DEPTNAME")
	private String deptName;
	
	@OneToMany(mappedBy="department",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<EmployeeDB> emp;

	public DepartmentDB() {
		
	}
	
	public DepartmentDB(int deptId, String deptName/*, List<EmployeeDB> emp*/) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	/*	this.emp = emp;*/
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<EmployeeDB> getEmp() {
		return emp;
	}

	public void setEmp(List<EmployeeDB> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "DepartmentDB [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	

}
