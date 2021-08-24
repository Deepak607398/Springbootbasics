package com.example.bank.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.modeldto.UserInfo;
import com.example.bank.service.UserRegistrationService;

@RestController
@RequestMapping("/signup")
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;

	@PostMapping("/addcustomers")
	public Map<String, Object> addCustomerDetails(@RequestBody UserInfo userInfo)
	{
		Map<String, Object>  response;
		response =new HashMap<>();
		response=userRegistrationService.addCustomerDetails(userInfo);
		return response;
		
	}
}
