package com.example.sprinjp.DBInteraction.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sprinjp.DBInteraction.entity.EmployeeDB;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeDB, Integer> {

	@Query("SELECT e FROM EmployeeDB e JOIN FETCH e.department")
    List<EmployeeDB> findAllWithDepartments();
	
}
