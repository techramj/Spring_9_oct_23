package com.seed.service;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogginAspect implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("End: "+target.getClass().getName()+"."+method.getName()+" :"+LocalDateTime.now() );
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("started: "+target.getClass().getName()+"."+method.getName()+" :"+LocalDateTime.now() );	
	}

}
