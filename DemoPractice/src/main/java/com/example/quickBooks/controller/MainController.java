package com.example.quickBooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quickBooks.entity.EmployeeEntity;
import com.example.quickBooks.service.MainService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MainService employeeService;

	@GetMapping("/getAllEmployees")
	public List<EmployeeEntity> getAllEmployees()  {
		System.out.println("Inside controller");
	return employeeService.getEmployeeData();
		
	}
	
//	@GetMapping("/savedata")
//	public void saveemployees() {
//		System.out.println("inside save employees");
//		employeeService.saveEmployeeData();
//	}
}
