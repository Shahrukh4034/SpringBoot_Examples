package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {
public static void main(String[] args) {
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	System.out.println("Data Of Student");
	student st=(student) ac.getBean("Data");
	System.out.println(st.getId());
	System.out.println(st.getName());
	System.out.println(st.getAddress());
	System.out.println(st.getDept());
	
	
	System.out.println("Data Of Employee");
//	Employee e1=new Employee(0, null, null, null, null);
	Employee emp= (Employee) ac.getBean("Emp");
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getCity());
	System.out.println(emp.getDept());
	System.out.println(emp.getSalary());
	
//	System.out.println(emp.g);

}
}
