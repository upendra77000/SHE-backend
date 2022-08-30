package com.lti.WE.services;

import com.lti.WE.entity.SukanyaAccount; 
import com.lti.WE.model.SukanyaDocs;

public interface SukanyaService {

	SukanyaAccount register(SukanyaAccount sukanyaAccount);
	SukanyaDocs uploadDocs(SukanyaDocs sukanyaDocs);
}
