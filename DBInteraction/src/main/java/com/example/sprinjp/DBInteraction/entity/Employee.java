package com.example.sprinjp.DBInteraction.entity;

public class Employee {
	
	
	private String ename;
	private Department department;
	private int eid;
	
	public Employee(String ename, Department department, int eid) {
		super();
		this.ename = ename;
		this.department = department;
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}	
	
	

}
