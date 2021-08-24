package com.example.bank.service;

import java.util.Map;

import com.example.bank.modeldto.FundTransfer;

public interface FundTransferService {

	Map<String, Object> sendMoney(FundTransfer fundTransfer);

}
