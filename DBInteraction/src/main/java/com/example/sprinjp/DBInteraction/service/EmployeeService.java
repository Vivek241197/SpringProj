package com.example.sprinjp.DBInteraction.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.sprinjp.DBInteraction.entity.Department;
import com.example.sprinjp.DBInteraction.entity.DepartmentDB;
import com.example.sprinjp.DBInteraction.entity.Employee;
import com.example.sprinjp.DBInteraction.entity.EmployeeDB;
import com.example.sprinjp.DBInteraction.repo.DepartmentRepo;
import com.example.sprinjp.DBInteraction.repo.EmployeeRepo;

import ch.qos.logback.core.spi.LogbackLock;
import lombok.extern.slf4j.Slf4j;

	
	@Service
	@Slf4j
	public class EmployeeService {
		
		@Autowired
		EmployeeRepo erpo;
		
		@Autowired
		DepartmentRepo deRepo;
		
		@Autowired
		RestTemplate restTemplate;
		
		public List<EmployeeDB> getAllEmployeesWithDepartment() {
			

			return (List<EmployeeDB>)erpo.findAllWithDepartments();

	 }
		public void getEmployee(Long id) {
	        String url = "http://localhost:8080/" + id;
	        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
	        

	        System.out.println("Status Code: " + response.getStatusCode());
	        System.out.println("Response Body: " + response.getBody());
	    }
		
		public EmployeeDB saveDetails(EmployeeDB emp) {
		
			erpo.save(emp);
			log.info("great");
			/*EmployeeDB em= new EmployeeDB();
			if(!(emp.getEname().isEmpty())) {
				em.setEname(emp.getEname());
				log.info("Before entering dept");
				if(emp.getDepartment()!=null) {
					
					String deptName = emp.getDepartment().getDeptName();

	                // Check if the department already exists
	                DepartmentDB existingDept = deRepo.findByDeptName(deptName).orElse(null);

	                if (existingDept == null) { 
						DepartmentDB de = new DepartmentDB();
					de.setDeptName(emp.getDepartment().getDeptName());
					deRepo.save(de);
					em.setDepartment(de);
					log.info("Insisde dept");
					}else {
						em.setDepartment(existingDept);
					}
				}
				erpo.save(em);
			}*/
			
			return emp; 
		}

	}

