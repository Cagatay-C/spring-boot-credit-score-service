package com.cinkir.creditscoreservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinkir.creditscoreservice.entity.CreditScore;
import com.cinkir.creditscoreservice.service.CreditScoreService;


@RestController
@RequestMapping("/api")
public class CreditScoreRestController {
	
	private CreditScoreService creditScoreService;
	
	@Autowired
	public CreditScoreRestController(CreditScoreService creditScoreService) {
		this.creditScoreService = creditScoreService;
	}
	
	@GetMapping("/creditScore/{identityNO}")
	public CreditScore findCreditScore(@PathVariable String identityNO) {
		
		return creditScoreService.findCreditScore(identityNO);
	}
}
