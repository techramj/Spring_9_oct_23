package com.seed.service;

import java.time.LocalDateTime;

public class LoanService {
	
	public void issueLoan(String custId) {
		System.out.println("Loan issued to customer "+custId);
	}
	
	public void payDue(String custId) {
		//logging
		System.out.println("started : LoanService.payDue: at "+LocalDateTime.now());
		
		//transaction
		System.out.println("Begin transaction");
		try {
			System.out.println("pending due is cleared for customer "+custId);
			System.out.println("commit");
		}catch(Exception e) {
			System.out.println("rollback");
		}
		
		System.out.println("End : LoanService.payDue: at "+LocalDateTime.now());
	}
	
	public void method1() {
		
	}

}
