package com.lti.WE.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.WE.entity.SukanyaAccount;

@Repository
public class SukanyaRegDAOImp implements SukanyaRegDAO{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public SukanyaAccount register(SukanyaAccount sukanyaAccount) {
		return entityManager.merge(sukanyaAccount); 
	}

	
}
