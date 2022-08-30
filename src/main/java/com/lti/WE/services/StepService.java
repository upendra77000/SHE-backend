package com.lti.WE.services;

import com.lti.WE.entity.StepAccount;

public interface StepService {

	StepAccount register(StepAccount stepAccount);
	boolean login(Long stepId, String stepPwd);
}
