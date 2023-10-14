package com.seed;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomerBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-----------------------------------------------------");
		System.out.println("BeanPostProcessor#postProcessBeforeInitialization");
		System.out.println("Bean: "+bean);
		System.out.println("Bean Name: "+beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-----------------------------------------------------");
		System.out.println("BeanPostProcessor#postProcessAfterInitialization");
		System.out.println("Bean: "+bean);
		System.out.println("Bean Name: "+beanName);
		return bean;
	}

}
