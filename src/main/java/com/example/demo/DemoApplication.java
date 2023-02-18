package com.example.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	private static final String p = "root"; // hard-coded credential
	private static final String url = "jdbc:mysql://localhost:3306"; 
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);
		String u = "root";
		// hard-coded credential
		//getConn(url, u, p);
	}

	@GetMapping("/api")
	public static void getConn() throws SQLException {
		DriverManager.getConnection(url); // sensitive call
	}

}
