package com.example.bank.modeldto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bk_Personal_Info")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Size(min = 3, max = 3, message = "Customer Id must 2 digit")
	private String cus_Id;
	@NotNull(message = "Name cannot be Empty")
	private String name;
	private String dob;
	private String gender;
	private String phoneNumber;
	private String resAddress;
	private String aadharNumber;
	private String maritalStatus;
	private String occupation;
	private String employerName;

	public String getCus_Id() {
		return cus_Id;
	}

	public void setCus_Id(String cus_Id) {
		this.cus_Id = cus_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResAddress() {
		return resAddress;
	}

	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	@Override
	public String toString() {
		return "UserInfo [cus_Id=" + cus_Id + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", resAddress=" + resAddress + ", aadharNumber=" + aadharNumber
				+ ", maritalStatus=" + maritalStatus + ", occupation=" + occupation + ", employerName=" + employerName
				+ "]";
	}

}
