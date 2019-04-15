package com.starter.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.starter")
@PropertySource("classpath:application.properties")
@Component
public class ConnectionManger {	

	        DriverManagerDataSource driverManagerDataSource = null;

	    	@Autowired
	    	Environment environment;

	    	private final String URL = "spring.datasource.url";
	    	private final String USER = "spring.datasource.username";
	    	private final String DRIVER = "spring.datasource.driver-class-name";
	    	private final String PASSWORD = "spring.datasource.password";

	    	@Bean
	    	DataSource getDataSource() {
	    		driverManagerDataSource = new DriverManagerDataSource();
	    		driverManagerDataSource.setUrl(environment.getProperty(URL));
	    		driverManagerDataSource.setUsername(environment.getProperty(USER));
	    		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
	    		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
	    		return driverManagerDataSource;
	    	}

}
