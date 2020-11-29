package com.cinkir.creditscoreservice.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cinkir.creditscoreservice.entity.CreditScore;

@Repository
public class CreditScoreDAOHibernateImpl implements CreditScoreDAO{

	
	private EntityManager entityManager;
	
	@Autowired
	public CreditScoreDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public CreditScore getCreditScoreByIdentityNO(String identityNO) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<CreditScore> query = currentSession.
				createQuery("from CreditScore cs where cs.identityNO=:identityNO", CreditScore.class);
		query.setParameter("identityNO", identityNO);
		
		CreditScore creditScore = query.uniqueResult();
		
		return creditScore;
	}
	
}
