package com.seed;

import java.sql.Connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.seed" })
public class MyConfig {

	@Bean
	public Connection con() {
		Connection conn = null;
		
		return conn;
	}

}
