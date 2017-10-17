package com.privalia.entity.listas;

import java.util.function.Consumer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.privalia.entity.listas.Student;

public class Principal {

	public static void main(String[] args) {
AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = (Student)context.getBean("SudentWithTeachers");
		
		System.out.println("Name: " + student.getName());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Age: " + student.getAge());
		System.out.println("Id: " + student.getIdStudent());
		
		student.getListTeacher().forEach(new Consumer<Teacher>() {
			public void accept(Teacher teacher) {
				System.out.println("=======================");
				System.out.println("Teacher;");
				System.out.println("Name:" + teacher.getName());
				System.out.println("Id: " + teacher.getIdTeacher());
			}
		});

		
		System.out.println("=======================");
		
		context.close();

	}

}
