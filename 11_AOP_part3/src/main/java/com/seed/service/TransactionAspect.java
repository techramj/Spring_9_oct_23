package com.seed.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TransactionAspect {
	
	@Around("execution(* LoanService.payDue*(..))")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Begin Transaction");
		try {
			jp.proceed();
			System.out.println("commit");
		}catch(Throwable e) {
			System.out.println("Rollback");
		}
	}

}
