package com.seed;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.seed" })
public class MyConfig {

	@Bean
	public Connection connection() {
		DriverManagerDataSource ds = new DriverManagerDataSource("jdbc:oracle:thin:@localhost:1521/ORCLPDB", "hr", "hr");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
