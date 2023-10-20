package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.service.LoanService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoanService service = context.getBean("loanServiceProxy", LoanService.class);
		service.issueLoan("Jack");
	}

}
