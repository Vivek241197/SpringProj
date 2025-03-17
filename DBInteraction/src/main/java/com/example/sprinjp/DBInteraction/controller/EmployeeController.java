package com.example.sprinjp.DBInteraction.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.sprinjp.DBInteraction.Hmac.HmacSignature;
import com.example.sprinjp.DBInteraction.entity.Department;
import com.example.sprinjp.DBInteraction.entity.DepartmentDB;
import com.example.sprinjp.DBInteraction.entity.Employee;
import com.example.sprinjp.DBInteraction.entity.EmployeeDB;
import com.example.sprinjp.DBInteraction.repo.DepartmentRepo;
import com.example.sprinjp.DBInteraction.repo.EmployeeRepo;
import com.example.sprinjp.DBInteraction.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService eps;
	
	@Autowired
	EmployeeRepo erpo;
	
	@Autowired
	DepartmentRepo deRepo;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping("/getdetails")
	public void fetchDetails() throws JsonProcessingException {
		try {
		String req= null;
		
		
		List<EmployeeDB> er = eps.getAllEmployeesWithDepartment();
		req=objectMapper.writeValueAsString(er);
		HmacSignature.generateHMACSignature(req);
		
	}catch(Exception e) {
		 e.printStackTrace();
		}
		}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<String> getEmployeeDetails(@PathVariable Long id) {
	        try {
	            eps.getEmployee(id);
	            return ResponseEntity.ok("Employee details fetched successfully. Check logs for details.");
	        } catch (Exception e) {
	            return ResponseEntity.status(500)
	                    .body("Failed to fetch employee details: " + e.getMessage());
	        }
	    }
	 
	 @PostMapping("/save")
	 public EmployeeDB saveTheDetails(@RequestBody EmployeeDB emp) {
		try {
			EmployeeDB ep= eps.saveDetails(emp);
			 
		 return ep;
				 } catch (Exception e) {
            return null;
        }
		 
	 }
	 
	 @GetMapping("/dept")
	 public List<DepartmentDB> getDepartmentDetails() {
		 
		 return StreamSupport.stream(deRepo.findAll().spliterator(), false).collect(Collectors.toList());
		
	 }
	 
	 @GetMapping
	 public void sayingHello() {

	        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
	        factory.setConnectTimeout(1000);
	        
			RestTemplate tp = new RestTemplate(factory);
			tp.getForEntity("abc", String.class);
	 }
}
