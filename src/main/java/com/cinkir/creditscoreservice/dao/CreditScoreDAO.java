package com.cinkir.creditscoreservice.dao;

import com.cinkir.creditscoreservice.entity.CreditScore;

public interface CreditScoreDAO {
	
	public CreditScore getCreditScoreByIdentityNO(String identityNO);
	
}
