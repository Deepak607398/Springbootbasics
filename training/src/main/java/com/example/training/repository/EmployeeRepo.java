package com.example.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.training.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String> {

	
	/*
	 * List<Employee> findByName(String name); List<Employee>
	 * findTop3ByExperience(); List<Employee> findByNameIs(String name);
	 * List<Employee> findByNameEquals(String name); List<Employee>
	 * findByNameIsNot(String name); List<Employee> findByNameIsNull();
	 * List<Employee> findByNameIsNotNull(); List<Employee>
	 * findByExperienceLessThanEqual(Integer experience);
	 *Optional<Employee> findByExperienceLessThan(Integer experience);
	*/
	
List<Employee> findByName(String name);
	
}

