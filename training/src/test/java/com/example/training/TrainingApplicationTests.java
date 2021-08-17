package com.example.training;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.training.model.Employee;
import com.example.training.repository.EmployeeRepo;

@SpringBootTest
class TrainingApplicationTests {

	@Autowired
	EmployeeRepo eRepo;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void addEmployeeDetailsTest()
	{
		Employee e=new Employee();
		e.setId("987654");
		e.setName("Ram");
		e.setCode(5);
		e.setEmailId("ram@gmail.com");
		e.setExperience(8);
		e.setLocation("Chennai");
		e.setJob_title("associate");
		e.setPhoneNumber(null);
		e.setProject_status("underTraining");
		eRepo.save(e);
	}
}
