package com.seed.dao;

import java.util.List;

import com.seed.Entity.Employee;

public interface EmployeeDao {
	String INSERT_QUERY = "insert into emp(id,name,salary) values (?,?,?)"; //by default all data member in interface are public static final
	String UPDATE_QUERY = "update emp set salary=?, name =? where id =?";
	String DELETE_QUERY = "delete from emp where id =?";
	String FIND_BY_ID = "select * from emp where id =?";
	String FIND_ALL = "Select * from emp";

	Employee save(Employee emp);

	Employee update(Employee emp);

	Employee delete(int id);

	Employee findById(int empId);

	List<Employee> findAll();
}
