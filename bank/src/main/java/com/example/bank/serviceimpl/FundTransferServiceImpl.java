package com.example.bank.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.bank.modeldto.FundTransfer;
import com.example.bank.modeldto.TranscationInfo;
import com.example.bank.modeldto.UserInfo;
import com.example.bank.repository.FundTransferRepository;
import com.example.bank.service.FundTransferService;

import net.bytebuddy.utility.RandomString;

@Service
public class FundTransferServiceImpl implements FundTransferService {

	@Autowired
	FundTransferRepository fundTransferRepository;

	@Autowired
	TranscationInfo transcationInfo;

	@Override
	public Map<String, Object> sendMoney(FundTransfer fundTransfer) {

		Map<String, Object> response;
		response = new HashMap<>();
		
		String cusid = fundTransfer.getCus_id();
		Double amount = fundTransferRepository.idData(cusid);
		Double samount = fundTransfer.getAmount();
		Double bal = amount - samount;
		if (samount < amount) {

			String txid = RandomString.make(12);
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

			transcationInfo.setCus_Id(fundTransfer.getCus_id());
			transcationInfo.setTx_id(txid);
			transcationInfo.setTx_timestamp(timestamp);
			transcationInfo.setAmount(fundTransfer.getAmount());
			transcationInfo.setBalance(bal);
			transcationInfo.setBeneficiary_id(fundTransfer.getBeneficiary_Id());

			fundTransferRepository.updateTransactionDetails(transcationInfo.getCus_Id(), transcationInfo.getTx_id(),
					transcationInfo.getTx_timestamp(), transcationInfo.getAmount(), transcationInfo.getBalance(),
					transcationInfo.getBeneficiary_id());
			fundTransferRepository.updateBalance(bal, fundTransfer.getCus_id());
			fundTransferRepository.save(fundTransfer);
			response.put("message", "Transaction Succesfull");
			response.put("status", HttpStatus.OK.value());
			return response;
		} else {
			response.put("message", "Insufficient Balance");
			response.put("status", HttpStatus.PAYMENT_REQUIRED.value());
			return response;
		}

	}

}
