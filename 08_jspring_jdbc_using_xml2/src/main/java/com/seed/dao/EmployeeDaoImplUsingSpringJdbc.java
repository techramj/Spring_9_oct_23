package com.seed.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.seed.Entity.Employee;

public class EmployeeDaoImplUsingSpringJdbc implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	private HibernateTemplate hibernateTemplate;

	@Override
	public Employee save(Employee emp) {
		int count =jdbcTemplate.update(INSERT_QUERY, new Object[] {emp.getId(), emp.getName(), emp.getSalary()});
		return emp;
	}

	@Override
	public Employee update(Employee emp) {
		int count =jdbcTemplate.update(UPDATE_QUERY, 
				new Object[] {emp.getSalary(), emp.getName(), emp.getId()});
		return emp;
	}

	@Override
	public Employee delete(int id) {
		int count =jdbcTemplate.update(DELETE_QUERY, new Object[] {id});
		return null;
	}

	@Override
	public Employee findById(int empId) {
		System.out.println(this.getClass());
		return jdbcTemplate.queryForObject(FIND_BY_ID,new Object[] {empId}, new EmpRowMapper());
	}

	@Override
	public List<Employee> findAll() {
		System.out.println(this.getClass());
		return jdbcTemplate.query(FIND_ALL, new EmpRowMapper());
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	class EmpRowMapper implements RowMapper<Employee>{
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			return emp;
		}
		
	}

}
