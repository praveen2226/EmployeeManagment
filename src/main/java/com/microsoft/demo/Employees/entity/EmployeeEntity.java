package com.microsoft.demo.Employees.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Table(name="Employee")
@EntityListeners(AuditingEntityListener.class)
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "Emp_id")
	private int Id ; 
	
	@Column (name  = "Emp_name")
	private String Name ;
	
	@Column(name  = "Emp_age")
	private int Age ;
	
	@Column(name  = "Emp_address")
	private String Address  ;
	
	@Column(name = "Emp_email")
	private String Email ; 
	
	@Column (name  = "Emp_DOJ")
	@CreatedDate
	private Date DateOfJoining ;
	
	@OneToOne(mappedBy = "user")
	private EmployeeEntity2 details;
	
	

	public EmployeeEntity2 getDetails() {
		return details;
	}

	public void setDetails(EmployeeEntity2 details) {
		this.details = details;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getDateOfJoining() {
		return DateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", Email="
				+ Email + ", DateOfJoining=" + DateOfJoining + "]";
	}

	public EmployeeEntity(int id, String name, int age, String address, String email, Date dateOfJoining) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Address = address;
		Email = email;
		DateOfJoining = dateOfJoining;
	} 
	
	
	public EmployeeEntity()
	{
		
	}

}

