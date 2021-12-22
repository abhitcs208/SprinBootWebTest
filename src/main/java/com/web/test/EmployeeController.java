package com.web.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService; 
	
	@GetMapping("/employees")
	List<Employee> getAllEmployee(){
		return employeeService.employeeData();
	}
	
}
