package com.seed.service;


import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect  {
	
	@Before("execution(* LoanService.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("started: "+jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName()+": at"+LocalDateTime.now());
	}
	
	
	@After("execution(* LoanService.*(..))")
	public void after(JoinPoint jp) {
		System.out.println("End: "+jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName()+": at"+LocalDateTime.now());
	}
	
	


}
