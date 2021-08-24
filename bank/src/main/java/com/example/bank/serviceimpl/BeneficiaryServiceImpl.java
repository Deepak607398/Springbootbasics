package com.example.bank.serviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.bank.modeldto.Beneficiaryinfo;
import com.example.bank.repository.BeneficiaryRepository;
import com.example.bank.service.BeneficiaryService;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	@Autowired
	BeneficiaryRepository beneficiaryRepository;

	@Transactional
	@Override
	public Map<String, Object> addBeneficiary(Beneficiaryinfo beneficaryInfo) {
		Optional<Beneficiaryinfo> beneficaryInfoDto;
		Map<String, Object> response;
		response = new HashMap<>();
		beneficaryInfoDto = beneficiaryRepository.findById(beneficaryInfo.getBeneficiary_Id());
		if (beneficaryInfoDto.isPresent()) {
			response.put("message", "Beneficiary Details already exist for the given Beneficiary id.");
			response.put("status", HttpStatus.CONFLICT.value());
			return response;
		} else {
			beneficiaryRepository.save(beneficaryInfo);
			response.put("message", "Beneficiary details added successfully");
			response.put("status", HttpStatus.CREATED.value());
			response.put("Beneficary Details", beneficaryInfo);
			return response;
		}

	}

}
