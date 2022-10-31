package com.employee.EmployeeApplication;

import com.employee.EmployeeApplication.entity.Address;
import com.employee.EmployeeApplication.entity.Project;
import com.employee.EmployeeApplication.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeApplication.class, args);
	}



	@Bean
	public CommandLineRunner initialCreate(EmployeeService employeeService){
	                   return(args) ->{
						   Address address1 = new Address("Line 1","Line 2","ZipCode 1","City1","State1","Country1);
						   Project project1 = new Project("Name 1","Client")
		};
	}



}
