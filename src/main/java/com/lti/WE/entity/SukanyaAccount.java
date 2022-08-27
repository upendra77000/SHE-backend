package com.lti.WE.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WE_SukanyaScheme_Account")
public class SukanyaAccount {
	
	@Id
	@SequenceGenerator(name = "sukanyaAcc_seq", initialValue = 1000000, allocationSize = 1)
	@GeneratedValue(generator = "sukanyaAcc_seq", strategy = GenerationType.SEQUENCE)
	private long account_no;
	
	private String beneficiary_name; 
	private Date sk_dob;  
	private String sk_aadharNo;
	private Date sk_registration_date;
	private boolean verified;
	
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
	
	public Date getSk_dob() {
		return sk_dob;
	}
	
	public void setSk_dob(Date sk_dob) {
		this.sk_dob = sk_dob;
	}
	
	public String getSk_aadharNo() {
		return sk_aadharNo;
	}
	
	public void setSk_aadharNo(String sk_aadharNo) {
		this.sk_aadharNo = sk_aadharNo;
	}
	
	public Date getSk_registration_date() {
		return sk_registration_date;
	}
	
	public void setSk_registration_date(Date sk_registration_date) {
		this.sk_registration_date = sk_registration_date;
	}
	
	public boolean isVerified() {
		return verified;
	}
	
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "SukanyaAccount [account_no=" + account_no + ", beneficiary_name=" + beneficiary_name + ", sk_dob="
				+ sk_dob + ", sk_aadharNo=" + sk_aadharNo + ", sk_registration_date=" + sk_registration_date
				+ ", verified=" + verified + ", sukanyaDocuments=" + sukanyaDocuments + "]";
	}
	
	
}
