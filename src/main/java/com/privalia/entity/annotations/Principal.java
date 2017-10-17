
package com.privalia.entity.annotations;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entity.annotations");
		annotationContext.refresh();
		
		Student student1 = (Student) annotationContext.getBean(Student.class);
		
		StringBuilder texto = new StringBuilder();
		texto.append(student1.getIdStudent());
		texto.append(" , ");
		texto.append(student1.getName());
		texto.append(" , ");
		texto.append(student1.getSurname());
		texto.append(" , ");
		texto.append(student1.getAge());
		texto.append(" , ");
		texto.append(student1.getAddress().getIdAddress());
		texto.append(" , ");
		texto.append(student1.getAddress().getStreet());
		
		System.out.println(texto);
		
	}

}