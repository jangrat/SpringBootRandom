package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@RequestMapping(path="/employee", method=RequestMethod.GET)
	public Iterable<Employee> getEmployee() {
		return employeeRepo.findAll();
	}
	
	@RequestMapping(path="/employee", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}
	
}
