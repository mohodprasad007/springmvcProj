package com.myproj.ConfigJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@PropertySource("classpath:application.properties")
@Component
public class DBConUtil {
	private static HikariDataSource dataSource = null;
	@Autowired
	Environment env;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.driverclass}")
	private String drierclass;

	/*
	 * static { HikariConfig config = new HikariConfig();
	 * 
	 * config.setJdbcUrl(url); config.setUsername(username);
	 * config.setPassword(password); config.addDataSourceProperty("minimumIdle",
	 * "5"); config.addDataSourceProperty("maximumPoolSize", "25");
	 * config.setDriverClassName(drierclass);
	 * 
	 * 
	 * config.setJdbcUrl("jdbc:mysql://localhost:3306/?user=root");
	 * config.setUsername("root"); config.setPassword("pushp");
	 * config.addDataSourceProperty("minimumIdle", "5");
	 * config.addDataSourceProperty("maximumPoolSize", "25");
	 * config.setDriverClassName("com.mysql.jdbc.Driver");
	 * 
	 * dataSource = new HikariDataSource(config); }
	 */
	public HikariDataSource geDataSource() {
		// this class is responsible for all connection pooling .property data come from
		// application.propperty
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		config.addDataSourceProperty("minimumIdle", "5");
		config.addDataSourceProperty("maximumPoolSize", "25");
		config.setDriverClassName(drierclass);

		return dataSource = new HikariDataSource(config);

	}

}
