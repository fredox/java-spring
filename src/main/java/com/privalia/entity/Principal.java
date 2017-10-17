package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = (Student)context.getBean("Student");
		
		System.out.println("Name: " + student.getName());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Age: " + student.getAge());
		System.out.println("Id: " + student.getIdStudent());
		
		System.out.println("Town: " + student.getAddress().getTown());
		System.out.println("City: " + student.getAddress().getCity());
		System.out.println("Street: " + student.getAddress().getStreet());
		
		Student anotherStudent = (Student)context.getBean("studentByConstructor");
		
		System.out.println("=======================");
		
		System.out.println("Name: " + anotherStudent.getName());
		System.out.println("Surname: " + anotherStudent.getSurname());
		System.out.println("Age: " + anotherStudent.getAge());
		System.out.println("Id: " + anotherStudent.getIdStudent());
		
		System.out.println("Town: " + anotherStudent.getAddress().getTown());
		System.out.println("City: " + anotherStudent.getAddress().getCity());
		System.out.println("Street: " + anotherStudent.getAddress().getStreet());
		
		context.close();

	}

}
