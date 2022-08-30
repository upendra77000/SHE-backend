package com.lti.WE.model;

import java.time.LocalDate;

import com.lti.WE.entity.StepAccount;

public class Step {
	
	private Long stepId;
	private String firstName;
	private String middleName;
	private String lastName;
	private int gender;
	private int disabled;
	private LocalDate dob;
	private String email;
	private String contact;
	private String aadharNo;
	private String panNo;
	private int jobstatus;
	private String jobtitle;
	private Double salary;
	private int residence;
	private int maritalstatus;
	private String stepPwd;
	private String stepConPwd;
	
	public Step() { 
		
	}

	public Step(Long stepId, String firstName, String middleName, String lastName, int gender, int disabled,
			LocalDate dob, String email, String contact, String aadharNo, String panNo, int jobstatus, String jobtitle,
			Double salary, int residence, int maritalstatus, String stepPwd, String stepConPwd) {
		super();
		this.stepId = stepId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.disabled = disabled;
		this.dob = dob;
		this.email = email;
		this.contact = contact;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.jobstatus = jobstatus;
		this.jobtitle = jobtitle;
		this.salary = salary;
		this.residence = residence;
		this.maritalstatus = maritalstatus;
		this.stepPwd = stepPwd;
		this.stepConPwd = stepConPwd;
	}
	
	public Long getStepId() {
		return stepId;
	}
	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getDisabled() {
		return disabled;
	}
	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public int getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(int jobstatus) {
		this.jobstatus = jobstatus;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getResidence() {
		return residence;
	}
	public void setResidence(int residence) {
		this.residence = residence;
	}
	public int getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(int maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getStepPass() {
		return stepPwd;
	}
	public void setStepPass(String stepPass) {
		this.stepPwd = stepPass;
	}
	public String getStepConPass() {
		return stepConPwd;
	}
	public void setStepConPass(String stepConPass) {
		this.stepConPwd = stepConPass;
	}

	public StepAccount toStepAccount() {
		StepAccount stepAccount = new StepAccount();
		stepAccount.setFirstName(firstName);
		stepAccount.setMiddleName(middleName);
		stepAccount.setLastName(lastName);
		stepAccount.setGender(gender);
		stepAccount.setDisabled(disabled);
		stepAccount.setDob(dob);
		stepAccount.setContact(contact);
		stepAccount.setEmail(email);
		stepAccount.setAadharNo(aadharNo);
		stepAccount.setPanNo(panNo);
		stepAccount.setResidence(residence);
		stepAccount.setJobtitle(jobtitle);
		stepAccount.setJobstatus(jobstatus);
		stepAccount.setMaritalstatus(maritalstatus); 
		stepAccount.setSalary(salary);
		stepAccount.setStepPass(stepPwd);
		stepAccount.setStepConPass(stepConPwd);
		
		return stepAccount;
	}
	
}
