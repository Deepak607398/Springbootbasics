package com.example.bank.service;

import java.util.Map;

import com.example.bank.modeldto.UserInfo;

public interface UserRegistrationService {

	
	Map<String, Object> addCustomerDetails(UserInfo userInfo);
}
