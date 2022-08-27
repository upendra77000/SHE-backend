package com.lti.WE.model;

public class SukanyaDocs {
	
	private long sk_doc_id;
	private String skd_aadharno;
	private String skd_aadhar_link;
	
	public SukanyaDocs() { 
		
	}

	public SukanyaDocs(long sk_doc_id, String skd_aadharno, String skd_aadhar_link) {
		super();
		this.sk_doc_id = sk_doc_id;
		this.skd_aadharno = skd_aadharno;
		this.skd_aadhar_link = skd_aadhar_link;
	}

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

	
}
