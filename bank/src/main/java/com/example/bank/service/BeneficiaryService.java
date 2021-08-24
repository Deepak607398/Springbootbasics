package com.example.bank.service;

import java.util.Map;

import com.example.bank.modeldto.Beneficiaryinfo;

public interface BeneficiaryService {

	Map<String, Object> addBeneficiary(Beneficiaryinfo beneficaryInfo);

}
