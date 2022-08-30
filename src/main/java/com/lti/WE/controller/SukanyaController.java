package com.lti.WE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.WE.model.Sukanya;
import com.lti.WE.model.SukanyaDocs; 
import com.lti.WE.services.SukanyaServiceImp;
import com.lti.WE.entity.SukanyaAccount;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/sukanya")
public class SukanyaController {
	
	@Autowired
	SukanyaServiceImp sukanyaService;
	
	@PostMapping("/register")
	public SukanyaAccount register(@RequestBody Sukanya sukanya) {
		return sukanyaService.register(sukanya.toSukanyaAccount());
	}
	
	@PostMapping("/upload_doc")
	public SukanyaDocs uplaodDocs(@RequestBody SukanyaDocs sukanyaDocs) {
		return sukanyaService.uploadDocs(sukanyaDocs);
	}

}
