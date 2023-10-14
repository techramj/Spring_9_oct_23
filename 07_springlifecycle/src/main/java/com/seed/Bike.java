package com.seed;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bike implements BeanNameAware, BeanFactoryAware, 
	ApplicationContextAware, InitializingBean, DisposableBean{

	private String name;
	private String color;

	public Bike() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Bike constructor called");
	}

	public Bike(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("-----------------------------------------------------");
		System.out.println("settter method Bike#setName is called");
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("-----------------------------------------------------");
		System.out.println("BeanNameAware#setBeanName => Bean is created and name of bean is "+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("-----------------------------------------------------");
		System.out.println("ApplicationContextAware#setApplicationContext called");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("-----------------------------------------------------");
		System.out.println("BeanFactoryAware#beanFactory called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-----------------------------------------------------");
		System.out.println("InitializingBean#afterPropertiesSet => init");
		
	}
	
	public void init() {
		System.out.println("-----------------------------------------------------");
		System.out.println("custom init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("-----------------------------------------------------");
		System.out.println("DisposableBean#destory method called");	
	}
	
	public void customDestroy() {
		System.out.println("-----------------------------------------------------");
		System.out.println("custom desoty method called");
	}

}
