package com.lti.WE.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.WE.DAO.StepRegDAO;
import com.lti.WE.entity.StepAccount;

@Service
public class StepServiceImp implements StepService{

	@Autowired
	StepRegDAO stepRegDAO;
	
	@Override
	public StepAccount register(StepAccount stepAccount) { 
		return stepRegDAO.register(stepAccount);
	}

	public boolean login(Long stepId, String stepPwd) { 
		return stepRegDAO.login(stepId, stepPwd);
	}

}
