package com.example.bank.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.modeldto.Beneficiaryinfo;
import com.example.bank.service.BeneficiaryService;

@RestController
@RequestMapping("/add")
public class BeneficiaryController {

	@Autowired
	BeneficiaryService beneficiaryService;

	@PostMapping("/Beneficiaries")
	public Map<String, Object> addBeneficiary(@RequestBody Beneficiaryinfo beneficaryInfo) {
		Map<String, Object> response;
		response = new HashMap<>();
		response = beneficiaryService.addBeneficiary(beneficaryInfo);
		return response;
	}

}
