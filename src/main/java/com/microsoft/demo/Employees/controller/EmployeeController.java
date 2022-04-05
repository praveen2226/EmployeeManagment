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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.demo.Employees.entity.EmployeeEntity;
import com.microsoft.demo.Employees.repo.EmployeeRepo;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo eRepo;
   
	@PostMapping("/addData")
		public String addData(@RequestBody EmployeeEntity emp)
		{
//		System.out.println(emp);
	    eRepo.save(emp);
	    return "Added Successfully";
		}
	
	@GetMapping("/getData")
	public List<EmployeeEntity> getData(){
		List<EmployeeEntity> emp = new ArrayList<> ();
		 eRepo.findAll().forEach(emp1 -> emp.add(emp1));
		 return emp ;
	}
	
	@PutMapping("/updateData")
	public EmployeeEntity putData(@RequestBody EmployeeEntity emp)
	{
		eRepo.save(emp) ;
		return emp ;
	}
	@DeleteMapping("/deleteData/{id}")
	public String delete(@PathVariable("id") int id) {
		eRepo.deleteById(id);
		return "delete successfully" ; 
		
	}
	
}

