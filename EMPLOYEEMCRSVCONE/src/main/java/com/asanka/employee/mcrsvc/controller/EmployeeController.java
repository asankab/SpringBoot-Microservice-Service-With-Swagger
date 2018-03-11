package com.asanka.employee.mcrsvc.controller;

import java.util.ArrayList;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asanka.employee.mcrsvc.model.Employee;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class EmployeeController {
	
	//private static final Logger logger = new Logger();

	@RequestMapping(value = "/api/v1/employees", method = RequestMethod.GET)
	public ResponseEntity<Collection<Employee>> employees() {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.set_id("1");
		emp.set_name("A");
		
		Employee emp1 = new Employee();
		emp1.set_id("2");
		emp1.set_name("A");
		
		list.add(emp);
		list.add(emp1);
		
		return new ResponseEntity<>(list, list == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
	}
	
}
