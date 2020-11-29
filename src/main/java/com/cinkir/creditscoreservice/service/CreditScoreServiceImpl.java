package com.cinkir.creditscoreservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinkir.creditscoreservice.dao.CreditScoreDAO;
import com.cinkir.creditscoreservice.entity.CreditScore;

@Service
public class CreditScoreServiceImpl implements CreditScoreService {
	
	private CreditScoreDAO creditScoreDAO;
	
	@Autowired
	public CreditScoreServiceImpl(CreditScoreDAO creditScoreDAO) {
		
		this.creditScoreDAO = creditScoreDAO;
	}

	@Override
	@Transactional
	public CreditScore findCreditScore(String identityNO) {
		
		return creditScoreDAO.getCreditScoreByIdentityNO(identityNO);
	}

}
