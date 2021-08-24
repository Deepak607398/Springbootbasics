package com.example.bank.modeldto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Table(name="bk_Beneficiary_info")
@Component
public class Beneficiaryinfo {
	
    @Id
	private String beneficiary_Id;
    @NotNull
	private String	account_No;
	@NotNull
    private String 	ifsc_Code;
	private String branch;
	
	public String getBeneficiary_Id() {
		return beneficiary_Id;
	}
	public void setBeneficiary_Id(String beneficiary_Id) {
		this.beneficiary_Id = beneficiary_Id;
	}
	public String getAccount_No() {
		return account_No;
	}
	public void setAccount_No(String account_No) {
		this.account_No = account_No;
	}
	public String getIfsc_Code() {
		return ifsc_Code;
	}
	public void setIfsc_Code(String ifsc_Code) {
		this.ifsc_Code = ifsc_Code;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	@Override
	public String toString() {
		return "Beneficiary_info [beneficiary_Id=" + beneficiary_Id + ", account_No=" + account_No + ", ifsc_Code="
				+ ifsc_Code + ", branch=" + branch + "]";
	}

}
