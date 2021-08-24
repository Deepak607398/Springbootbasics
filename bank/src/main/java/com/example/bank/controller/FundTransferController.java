package com.example.bank.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.modeldto.FundTransfer;
import com.example.bank.service.FundTransferService;

@RestController
@RequestMapping("/transfer")
public class FundTransferController {

	@Autowired
	private FundTransferService fundTransferService;

	@PutMapping("/money")
	public Map<String, Object> sendMoney(@RequestBody FundTransfer fundTransfer) {
		Map<String, Object> response;
		response = new HashMap<>();
		response = fundTransferService.sendMoney(fundTransfer);
		return response;

	}
}
