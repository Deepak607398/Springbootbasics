package com.example.bank.serviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.bank.modeldto.BankCredentials;
import com.example.bank.modeldto.UserInfo;
import com.example.bank.repository.UserRegistrationRepository;
import com.example.bank.service.UserRegistrationService;

import net.bytebuddy.utility.RandomString;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	@Autowired
	private BankCredentials bankCredentails;

	@Transactional
	@Override
	public Map<String, Object> addCustomerDetails(UserInfo userInfo) {
		Optional<UserInfo> userInfoDto;
		Map<String, Object> response;
		response = new HashMap<>();

		userInfoDto = userRegistrationRepository.findById(userInfo.getCus_Id());
		if (userInfoDto.isPresent()) {
			response.put("message", "Customer Details already exist for the given Customer id.");
			response.put("status", HttpStatus.CONFLICT.value());
			return response;
		} else {
			String userName = userInfo.getName().substring(0, 3).concat(userInfo.getAadharNumber().substring(0, 4));
			String password = RandomString.make(8);
            
			bankCredentails.setCus_Id(userInfo.getCus_Id());
			bankCredentails.setUsername(userName);
			bankCredentails.setPassword(password);
			bankCredentails.setAccount_no(
					userInfo.getAadharNumber().substring(0, 5).concat(userInfo.getPhoneNumber().substring(0, 5)));
			bankCredentails.setOpening_amount(10000.0);

			userRegistrationRepository.updateCredentials(bankCredentails.getUsername(), bankCredentails.getPassword(),
					bankCredentails.getAccount_no(), bankCredentails.getCus_Id(), bankCredentails.getOpening_amount());

			userRegistrationRepository.save(userInfo);
			response.put("message", "Customer details created successfully");
			response.put("status", HttpStatus.CREATED.value());
			response.put("Bank Credentails", bankCredentails);
			return response;
		}

	}

}
