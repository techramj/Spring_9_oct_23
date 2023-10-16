package com.seed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.seed.Entity.Employee;

@Component("empDao1")
public class EmployeeDaoImplUsingJdbc implements EmployeeDao {
	
	//@Autowired
	private Connection con;

	@Override
	public Employee save(Employee emp) {
		String insertQuery ="insert into emp(id,name,salary) values (?,?,?)";
		try(PreparedStatement ps = con.prepareStatement(insertQuery)){
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			int count = ps.executeUpdate();
			if(count == 1) {
				return emp;
			}
		}catch(SQLException e) {
			
		}
		return null;
	}

	@Override
	public Employee update(Employee emp) {

		return null;
	}

	@Override
	public Employee delete(int id) {
		
		return null;
	}

	@Override
	public Employee findById(int empId) {
		String selectByIdQuery ="select * from emp where id =?";
		try(PreparedStatement ps = con.prepareStatement(selectByIdQuery)){
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
			}
		}catch(SQLException e) {
			
		}
		return null;
	}

	@Override
	public List<Employee> findAll() {
		String selectByIdQuery ="select * from emp";
		List<Employee> employees  = new ArrayList<Employee>();
		try(PreparedStatement ps = con.prepareStatement(selectByIdQuery)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				employees.add(emp);
			}
		}catch(SQLException e) {
			
		}
		
		return employees;
	}

}
