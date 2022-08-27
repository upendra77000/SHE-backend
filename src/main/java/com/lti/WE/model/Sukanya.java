package com.lti.WE.model;

import java.util.Date;

public class Sukanya {
    //private long id;
    private String firstName;
    private String lastName;
	private Date dob;
	private String aadharNo;
	
	
	public Sukanya() {

	}

	public Sukanya(long id, String firstName, String lastName, Date dob, String aadharNo) {
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
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
	
	
}
