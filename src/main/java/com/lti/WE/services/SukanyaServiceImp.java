package com.lti.WE.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.WE.DAO.SukanyaRegDAO;
import com.lti.WE.entity.SukanyaAccount;
import com.lti.WE.entity.SukanyaDocuments;
import com.lti.WE.model.Sukanya;
import com.lti.WE.model.SukanyaDocs; 

@Service
public class SukanyaServiceImp implements SukanyaService{

	@Autowired
	SukanyaRegDAO dao; 
 
	@Override
	public SukanyaAccount register(SukanyaAccount sukanyaAccount) {
		//sukanyaAccount.setUser(userDao.getUserById(userId));
		return dao.register(sukanyaAccount);
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
