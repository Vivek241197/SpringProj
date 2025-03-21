package com.example.sprinjp.DBInteraction.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sprinjp.DBInteraction.entity.DepartmentDB;

@Repository
public interface DepartmentRepo extends CrudRepository<DepartmentDB, Integer>{

	Optional<DepartmentDB> findByDeptName(String deptName);
}
