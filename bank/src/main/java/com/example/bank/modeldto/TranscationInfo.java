package com.example.bank.modeldto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "bk_tx_info")
@Component
public class TranscationInfo {
	
	private String cus_Id;
	@Id
	private String tx_id;
	private String tx_timestamp;
	private Double Amount;
	private Double balance;
	private String Beneficiary_id;

	public String getCus_Id() {
		return cus_Id;
	}

	public void setCus_Id(String cus_Id) {
		this.cus_Id = cus_Id;
	}

	public String getTx_id() {
		return tx_id;
	}

	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}

	public String getTx_timestamp() {
		return tx_timestamp;
	}

	public void setTx_timestamp(String tx_timestamp) {
		this.tx_timestamp = tx_timestamp;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getBeneficiary_id() {
		return Beneficiary_id;
	}

	public void setBeneficiary_id(String beneficiary_id) {
		Beneficiary_id = beneficiary_id;
	}

	@Override
	public String toString() {
		return "TranscationInfo [cus_Id=" + cus_Id + ", tx_id=" + tx_id + ", tx_timestamp=" + tx_timestamp + ", Amount="
				+ Amount + ", balance=" + balance + ", Beneficiary_id=" + Beneficiary_id + "]";
	}

	
	
}
