package com.example.quickBooks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EmployeeDetails")
public class EmployeeEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	String employeeId;
	
	@Column(name="employee_name")
	String employee_name;
	
	@Column(name="city")
	String city;
	
	@Column(name="pincode")
	Integer pincode;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	
}
