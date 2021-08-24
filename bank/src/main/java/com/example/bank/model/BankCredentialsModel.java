package com.example.bank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankCredentialsModel {
	
	private String cus_Id;
	private String username;
	private String password;
	private String account_no;
	private Double opening_amount;
	public String getCus_Id() {
		return cus_Id;
	}
	public void setCus_Id(String cus_Id) {
		this.cus_Id = cus_Id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public Double getOpening_amount() {
		return opening_amount;
	}
	public void setOpening_amount(Double opening_amount) {
		this.opening_amount = opening_amount;
	}
	
	

}
