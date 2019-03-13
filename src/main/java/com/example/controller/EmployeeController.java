package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;
 
 @GetMapping(value = "/getAll")
 @ResponseBody
 public ResponseEntity<List<Employee>> getAllEmployee(){
	 
	// List<Employee> employees = new ArrayList<>();
	 List<Employee> listEmployee = employeeService.getAllEmployees();
	 return ResponseEntity.status(200).body(listEmployee);
	 
 }
}