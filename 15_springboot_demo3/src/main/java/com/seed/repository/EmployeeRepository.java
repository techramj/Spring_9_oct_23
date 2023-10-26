package com.seed.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.seed.entity.Employee;

@Component
public class EmployeeRepository {
	
	private static List<Employee> employees = new ArrayList<Employee>();
	
	static {
		employees.add(new Employee(1, "Jack", 5000));
		employees.add(new Employee(2, "Sam", 51000));
		employees.add(new Employee(3, "Jackie", 50000));
		employees.add(new Employee(4, "Jackson", 35000));
		employees.add(new Employee(5, "Jack sparrow", 15000));
	}
	
	public Employee save(Employee emp) {
		employees.add(emp);
		return emp;
	}
	
	public Employee update(Employee emp) {
		for(Employee e :employees) {
			if(e.getId() == emp.getId()) {
				e.setName(emp.getName());
				e.setSalary(emp.getSalary());
				return e;
			}
		}
		
		return null;
	}
	
	public Employee delete(int id) {
		Iterator<Employee> itr = employees.iterator();
		Employee deletedEmployee = null;
		if(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() == id) {
				deletedEmployee = emp;
				itr.remove();
			}
		}
		return deletedEmployee;
	}
	
	public Employee findById(int id){
		return employees.stream().filter(e->e.getId()== id).findAny().get();
	}
	
	public List<Employee> findAll(){
		return employees;
	}

}
