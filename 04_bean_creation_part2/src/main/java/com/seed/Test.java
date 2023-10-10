package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	}

	public static void example2(ApplicationContext context) {
		// Employee e1 = context.getBean("com.seed.Employee#0", Employee.class); //default name convention
		String[] beanNamesForType = context.getBeanNamesForType(Employee.class);
		for (String str : beanNamesForType) {
			System.out.println(str);
		}

	}

	public static void example1(ApplicationContext context) {
		Employee e1 = context.getBean("emp", Employee.class);
		Employee e2 = context.getBean("emp", Employee.class);

		Employee emp1 = new Employee(1, "Jack", 1000);
		Employee emp2 = new Employee(1, "Jack", 1000);

		System.out.println(e1 == e2); // true for singleton & false for prototype
		System.out.println(emp1 == emp2); // false

		Employee emp3 = new Employee();
		emp3.setId(1);
		emp3.setName("sam");
		emp3.setSalary(8000);

		Employee emp4 = new Employee(1, "Jack", 1000);
	}

}
