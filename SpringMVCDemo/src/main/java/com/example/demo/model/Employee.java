package com.example.demo.model;

public class Employee {
	private Long employeeId;
	private String name;
	private String designation;

	public Employee() {

	}

	public Employee(Long employeeId, String name, String designation) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
