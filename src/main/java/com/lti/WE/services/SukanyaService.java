package com.lti.WE.services;

import com.lti.WE.model.Sukanya;
import com.lti.WE.model.SukanyaDocs;

public interface SukanyaService {

	Sukanya register(Sukanya sukanya);
	SukanyaDocs uploadDocs(SukanyaDocs sukanyaDocs);
}
