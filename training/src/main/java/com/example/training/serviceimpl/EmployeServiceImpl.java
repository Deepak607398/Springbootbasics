package com.example.training.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.training.model.Employee;
import com.example.training.repository.EmployeeRepo;
import com.example.training.service.EmployeeDetailService;

@Service
public class EmployeServiceImpl implements EmployeeDetailService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Map<String, Object> addEmployeeDetails(Employee empDto) throws Exception {
		Optional<Employee> accessData;
		Map<String, Object> response;
		response = new HashMap<>();
		accessData=empRepo.findById(empDto.getId());
		/* accessData=empRepo.findByExperienceLessThan(empDto.getExperience()); */
		
		if(accessData.isPresent()) {
			response.put("message", "Employee Details already exist for the given  id.");
			response.put("status", HttpStatus.CONFLICT.value());
			return response;
		}
		else {
			
				empRepo.save(empDto);
				response.put("message", "Employee Details Added successfully");
				response.put("status", HttpStatus.CREATED.value());
				return response;
			}
		}

	

	@Override
	public Map<String, Object> getEmployeessByName(String name) {
		
		Map<String, Object> response;
		List<Employee> empList;
		
		empList = new ArrayList<Employee>();
		response = new HashMap<>();
		empList=empRepo.findByName(name);
		if(empList.size()!=0 && !empList.isEmpty()) {
			response.put("message", "Employee Details found for the given  id.");
			response.put("status", HttpStatus.FOUND.value());
			response.put("Employee record",empList );
			return response;
	}
		else {
			response.put("message", "Employee Details not found");
			response.put("status", HttpStatus.NOT_FOUND.value());
			return response;
		}
	}
}
	
	

