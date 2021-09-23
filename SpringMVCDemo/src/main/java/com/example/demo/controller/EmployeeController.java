package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	
	
	@RequestMapping(path="/dashboard", method=RequestMethod.POST)
	public String getLoginPage(Employee employee, Model model) {
		model.addAttribute("employeeId", employee.getEmployeeId());
		model.addAttribute("userName", employee.getName());		
		return "dashboard";
	}
}
