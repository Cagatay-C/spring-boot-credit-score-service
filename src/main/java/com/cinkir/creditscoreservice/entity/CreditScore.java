package com.cinkir.creditscoreservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_score")
public class CreditScore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="identity_no")
	private String identityNO;
	
	@Column(name="score")
	private int score;
	
	public CreditScore() {
		
	}

	public CreditScore(String identityNO, int score) {
		this.identityNO = identityNO;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentityNO() {
		return identityNO;
	}

	public void setIdentityNO(String identityNO) {
		this.identityNO = identityNO;
	}

	public int getScore() {
		return score;
	}

	public void setCreditScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "CreditScore [id=" + id + ", identityNO=" + identityNO + ", score=" + score + "]";
	}
	
}
