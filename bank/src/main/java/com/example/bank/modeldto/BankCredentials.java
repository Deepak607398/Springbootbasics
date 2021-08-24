package com.example.bank.modeldto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="bk_credentials")
@Component
public class BankCredentials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1604805508340260306L;
	/**
	 * 
	 */
	
	@Id
	private String cus_Id;
	private String username;
	private String password;
	private String account_no;
	private Double opening_amount;
	
	
	
	
	public Double getOpening_amount() {
		return opening_amount;
	}
	public void setOpening_amount(Double opening_amount) {
		this.opening_amount = opening_amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
	@Override
	public String toString() {
		return "BankCredentials [cus_Id=" + cus_Id + ", username=" + username + ", password=" + password
				+ ", account_no=" + account_no + ", opening_amount=" + opening_amount + "]";
	}
	
	
	
	
	
	
	
	
}
