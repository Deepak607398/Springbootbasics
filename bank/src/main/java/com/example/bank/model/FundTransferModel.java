package com.example.bank.model;

import javax.persistence.Id;

public class FundTransferModel {
	@Id
	private String cus_Id;
	private String beneaccount_No;
	private String amount;
}
