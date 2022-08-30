package com.lti.WE.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.WE.entity.StepAccount;
import com.lti.WE.model.Step;

@Repository
public class StepRegDAOImp implements StepRegDAO{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public StepAccount register(StepAccount stepAccount) { 
		return entityManager.merge(stepAccount);
	}

	public boolean login(Long stepId, String stepPwd) { 
		return entityManager.find(Step.class, stepId).getStepPass().equals(stepPwd);
	}
 

}
