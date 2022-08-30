package com.lti.WE.model;

import java.time.LocalDate;
import java.util.Date;

import com.lti.WE.entity.SukanyaAccount;

public class Sukanya {
    //private long id;
    String firstName;
    String lastName;
	LocalDate dob;
	String aadharNo;
	
	
	public Sukanya() {

	}

	public Sukanya(long id, String firstName, String lastName, LocalDate dob, String aadharNo) {
		super();
		//this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.aadharNo = aadharNo;
	}

//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "Sukanya [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", aadharNo=" + aadharNo + "]";
	}
	
	public SukanyaAccount toSukanyaAccount() {
		SukanyaAccount sukanyaAccount =new SukanyaAccount();
		sukanyaAccount.setAadharNo(aadharNo);
		sukanyaAccount.setBeneficiary_name(firstName+" "+lastName);
		sukanyaAccount.setDob(dob);
		sukanyaAccount.setSk_registration_date(new java.sql.Date(new Date().getTime()).toLocalDate());
		return sukanyaAccount;
	}
	
}
