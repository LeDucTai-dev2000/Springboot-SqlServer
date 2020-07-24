package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringbootSql1Application {	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootSql1Application.class, args);
	}

	/**
	 * Các Class buộc phải nằm trong Backage cùng cấp với Main ("com.example.demo.**")
	 * Nên Sử dụng Log để in ra cho dễ nhin. ví dụ (CustomerController)
	 */


}
