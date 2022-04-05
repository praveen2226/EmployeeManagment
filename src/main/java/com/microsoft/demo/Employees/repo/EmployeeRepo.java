package com.microsoft.demo.Employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microsoft.demo.Employees.entity.EmployeeEntity;
import com.microsoft.demo.Employees.entity.EmployeeEntity2;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>  {

//	EmployeeEntity findByEmail(String email);
}
