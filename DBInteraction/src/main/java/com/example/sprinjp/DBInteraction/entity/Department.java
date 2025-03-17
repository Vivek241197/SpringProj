package com.example.sprinjp.DBInteraction.entity;

import lombok.Data;

@Data
public class Department {

	private int deptId;
	private String deptName;
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	
	
}
