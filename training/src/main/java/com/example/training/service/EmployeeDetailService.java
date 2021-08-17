package com.example.training.service;

import java.util.Map;

import com.example.training.model.Employee;

public interface EmployeeDetailService {

	Map<String, Object> addEmployeeDetails(Employee empDto) throws Exception;
	

	Map<String, Object> getEmployeessByName(String name);
}
