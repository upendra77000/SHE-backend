package com.lti.WE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.WE.entity.SukanyaAccount;

@Repository
public interface SukanyaRepository extends JpaRepository<SukanyaAccount, Long>{

}
