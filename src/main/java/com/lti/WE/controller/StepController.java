package com.lti.WE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.WE.DAO.StepRegDAO;
import com.lti.WE.entity.StepAccount;
import com.lti.WE.model.Step; 
import com.lti.WE.services.StepServiceImp;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/step")
public class StepController {
	
	@Autowired
	StepServiceImp stepService;

	@PostMapping("/register")
	public StepAccount register(@RequestBody Step step) {
		return stepService.register(step.toStepAccount());
	}
	
	@PostMapping("/login")
	public boolean login(@RequestBody Step step) {
		return stepService.login(step.getStepId(), step.getStepPass());
	}
	
}
