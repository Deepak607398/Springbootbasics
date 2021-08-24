package com.example.bank.modeldto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "bk_FundTransfer_info")
@Component
public class FundTransfer {

	@Id
	private String cus_id;
	private String beneficiary_Id;

	private String beneaccount_No;
	@NotNull
	private Double amount;

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public String getBeneficiary_Id() {
		return beneficiary_Id;
	}

	public void setBeneficiary_Id(String beneficiary_Id) {
		this.beneficiary_Id = beneficiary_Id;
	}

	public String getBeneaccount_No() {
		return beneaccount_No;
	}

	public void setBeneaccount_No(String beneaccount_No) {
		this.beneaccount_No = beneaccount_No;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "FundTransfer [cus_id=" + cus_id + ", beneficiary_Id=" + beneficiary_Id + ", beneaccount_No="
				+ beneaccount_No + ", amount=" + amount + "]";
	}

}
