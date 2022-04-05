package com.microsoft.demo.Employees.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.demo.Employees.entity.EmployeeEntity;
import com.microsoft.demo.Employees.entity.EmployeeEntity2;
import com.microsoft.demo.Employees.repo.EmployeeRepo;
import com.microsoft.demo.Employees.repo.EmployeeRepo2;

@RestController
public class EmployeeController2 {
	
	@Autowired
	private EmployeeRepo2 Erepo ;
	
	@Autowired
	private EmployeeRepo eRepo;
    
	@PostMapping("/gettingdata")
	public String adddata1(@RequestBody EmployeeEntity2 emp2)
	{
//		EmployeeEntity employee = eRepo.findByEmail(emp2.getEmail());
//		emp2.setUser(employee);	
		Erepo.save(emp2);
		return "Add successfully" ;
		
	}
	
	@GetMapping("/readingdata")
	public List<EmployeeEntity2> readdata()
	{
		List<EmployeeEntity2> l1 = new ArrayList<EmployeeEntity2>();
		Erepo.findAll().forEach(emp1 -> l1.add(emp1));
		return l1;
	}
	
	@PutMapping("/updatingdata")
	public String updatedata(@RequestBody EmployeeEntity2 emp)
	{   
		Erepo.save(emp) ;
		return "Update successfully" ;
	}
	
	@DeleteMapping("/deletedata/{id}")
	public String deletedata(@PathVariable("id") int id){
		Erepo.deleteById(id);
 		return "Delete successfully" ;
		
	}
}
