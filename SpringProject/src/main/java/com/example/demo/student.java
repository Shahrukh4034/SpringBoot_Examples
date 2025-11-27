package com.example.demo;

public class student {
	private int id;
	private String name;
	private String Address;

	private String dept;

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
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
	
	
	
	
//	public student(int id) {
//		super();
//		this.id = id;
//	}
//	public student(String name) {
//		super();
//		this.name = name;
//	}

}
