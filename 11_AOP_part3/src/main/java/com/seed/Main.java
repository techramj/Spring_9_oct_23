package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.service.LoanService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoanService service = context.getBean("loanService", LoanService.class);
		service.issueLoan("Jack");
		
		System.out.println("---------------------------------");
		
		service.payDue("jack");
	}

}
