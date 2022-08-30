package com.lti.WE.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WE_STEP_Users")
public class StepAccount {

	@Id
	@SequenceGenerator(name = "stepAcc_seq", initialValue = 1000000, allocationSize = 1)
	@GeneratedValue(generator = "stepAcc_seq", strategy = GenerationType.SEQUENCE)
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
	
	
}
