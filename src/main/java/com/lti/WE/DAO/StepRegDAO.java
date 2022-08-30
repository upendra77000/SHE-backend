package com.lti.WE.DAO;

import com.lti.WE.entity.StepAccount;

public interface StepRegDAO {

	StepAccount register(StepAccount stepAccount);
	boolean login(Long stepId, String stepPwd);
}
