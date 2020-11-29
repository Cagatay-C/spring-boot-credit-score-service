package com.cinkir.creditscoreservice.service;

import com.cinkir.creditscoreservice.entity.CreditScore;

public interface CreditScoreService {
	
	public CreditScore findCreditScore(String identityNO);
}
