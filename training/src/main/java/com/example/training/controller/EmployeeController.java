package com.example.training.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.training.model.Employee;
import com.example.training.service.EmployeeDetailService;

@RestController
@CrossOrigin
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	
	@Value("${app.message}")
	private String welcomeMessage;
	
	@GetMapping("/welcome")
	public String getDataBaseConnectionDetails() {
		return welcomeMessage;
	}
	
	@PostMapping("/details")
	public Map<String, Object> addEmployeeDetails(@Valid @RequestBody Employee empDto) throws Exception {
		Map<String, Object> response;

		// Faulty Code to check @ControllerAdvice working
		/*
		 * String firtname = null; int len = firtname.length();
		 */

		response = new HashMap<>();
		response = employeeDetailService.addEmployeeDetails(empDto);

		return response;

	}

	/* Implemented with the JPA finder method */
	@GetMapping("/name")
	public Map<String, Object> getEmployeessByName(@RequestParam String name) {
		Map<String, Object> response;

		response = new HashMap<>();
		response = employeeDetailService.getEmployeessByName(name);

		return response;
	}
}
