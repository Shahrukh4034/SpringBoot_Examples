package com.example.demo;

public class Employee {
	
	
	public Employee(int id, String name, String city, String dept, Float salary) {
		super();
		this.id = id;
		this.name = name;
		City = city;
		Dept = dept;
		Salary = salary;
	}
	private int id;
	private String name;
	private String City;
	
	private String Dept;
	private Float Salary;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Float getSalary() {
		return Salary;
	}
	public void setSalary(Float salary) {
		Salary = salary;
	}
	

}
