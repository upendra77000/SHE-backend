package com.lti.WE.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.WE.entity.SukanyaAccount;
import com.lti.WE.entity.SukanyaDocuments;
import com.lti.WE.model.Sukanya;
import com.lti.WE.model.SukanyaDocs;
import com.lti.WE.repository.SukanyaRepository;

@Service
public class SukanyaServiceImp implements SukanyaService{

	@Autowired
	SukanyaRepository sukanyaRepository;
	
	public SukanyaServiceImp(SukanyaRepository sukanyaRepository) {
		this.sukanyaRepository = sukanyaRepository;
	}

	@Override
	public Sukanya register(Sukanya sukanya) { 
		SukanyaAccount sukanyaAccount = new SukanyaAccount();
		
		System.out.println(sukanyaAccount);

		System.out.println(sukanya);
		BeanUtils.copyProperties(sukanya, sukanyaAccount);
		sukanyaRepository.save(sukanyaAccount);
		
		sukanyaAccount.setSk_aadharNo(sukanya.getAadharNo());
		sukanyaAccount.setSk_dob(sukanya.getDob()); 
		sukanyaAccount.setBeneficiary_name(sukanya.getFirstName()+" "+sukanya.getLastName());

		return sukanya;
	}

	@Override
	public SukanyaDocs uploadDocs(SukanyaDocs sukanyaDocs) {
//		SukanyaDocuments sukanyaDocuments = new SukanyaDocuments();
//		sukanyaDocuments.setSkd_aadharno(sukanyaDocs.getSkd_aadharno());
//		sukanyaDocuments.setSkd_aadhar_link(sukanyaDocs.getSkd_aadhar_link());
//		
//		SukanyaAccount sukanyaAccount =  sukanyaDocs.get
		return null;
	}

	
}
