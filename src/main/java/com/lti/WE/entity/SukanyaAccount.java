package com.lti.WE.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "WE_SukanyaScheme_Account")
public class SukanyaAccount {
	
	@Id
	@SequenceGenerator(name = "sukanyaAcc_seq", initialValue = 1000000, allocationSize = 1)
	@GeneratedValue(generator = "sukanyaAcc_seq", strategy = GenerationType.SEQUENCE)
	private long account_no;
	
	String beneficiary_name; 
	
	@Column(name = "sk_dob")
	LocalDate dob;

	@Column(name = "sk_aadharNo")
	String aadharNo;
	
	LocalDate sk_registration_date;
	boolean verified;
	
	@OneToOne(mappedBy = "sukanyaAccount")
	SukanyaDocuments sukanyaDocuments;

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getBeneficiary_name() {
		return beneficiary_name;
	}

	public void setBeneficiary_name(String beneficiary_name) {
		this.beneficiary_name = beneficiary_name;
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

	public LocalDate getSk_registration_date() {
		return sk_registration_date;
	}

	public void setSk_registration_date(LocalDate sk_registration_date) {
		this.sk_registration_date = sk_registration_date;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

//	public SukanyaDocuments getSukanyaDocuments() {
//		return sukanyaDocuments;
//	}
//
//	public void setSukanyaDocuments(SukanyaDocuments sukanyaDocuments) {
//		this.sukanyaDocuments = sukanyaDocuments;
//	}
	
	
	
}
