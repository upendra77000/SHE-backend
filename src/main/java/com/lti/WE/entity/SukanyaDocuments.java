package com.lti.WE.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WE_Sukanya_Docs")
public class SukanyaDocuments {

	@Id
	@SequenceGenerator(name = "sukanyaDocId_seq", initialValue = 100000, allocationSize = 1)
	@GeneratedValue(generator = "sukanyaDocId_seq", strategy = GenerationType.SEQUENCE)
	private long sk_doc_id;
	
	private String skd_aadharno;
	private String skd_aadhar_link;
	
	@OneToOne
	@JoinColumn(name = "account_no")
	SukanyaAccount sukanyaAccount;

	public long getSk_doc_id() {
		return sk_doc_id;
	}

	public void setSk_doc_id(long sk_doc_id) {
		this.sk_doc_id = sk_doc_id;
	}

	public String getSkd_aadharno() {
		return skd_aadharno;
	}

	public void setSkd_aadharno(String skd_aadharno) {
		this.skd_aadharno = skd_aadharno;
	}

	public String getSkd_aadhar_link() {
		return skd_aadhar_link;
	}

	public void setSkd_aadhar_link(String skd_aadhar_link) {
		this.skd_aadhar_link = skd_aadhar_link;
	}

	public SukanyaAccount getSukanyaAccount() {
		return sukanyaAccount;
	}

	public void setSukanyaAccount(SukanyaAccount sukanyaAccount) {
		this.sukanyaAccount = sukanyaAccount;
	}
	
	
	
}
