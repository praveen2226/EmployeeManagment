package com.microsoft.demo.Employees.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name  = "EmpPersionalDetail")
public class EmployeeEntity2 {
     
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "Emp_id")
	  private int id ;
	  
	  @Column (name  = "Emp_name")
      private String name ;
      
	  @Column (name = "father_name")
      private String father_name ;
      
	  @Column (name = "mother_name")
      private String mother_name ;
      
	  @Column(name = "address")
      private String address ;
      
	  @Column(name = "email")
      private String email ;
	  
	  @Column(name ="dob")
	  private LocalDate date_of_birth ;
	  
	  @OneToOne (cascade = CascadeType.ALL)
	  @JoinColumn(referencedColumnName = "Emp_id", name = "user_id")
	  private EmployeeEntity user;
	  
	  
    

	public EmployeeEntity getUser() {
		return user;
	}

	public void setUser(EmployeeEntity user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public EmployeeEntity2(int id, String name, String father_name, String mother_name, String address, String email,
			LocalDate date_of_birth) {
		super();
		this.id = id;
		this.name = name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.address = address;
		this.email = email;
		this.date_of_birth = date_of_birth;
	}
	  
	public EmployeeEntity2()
	{
		
	}
}
