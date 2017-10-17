package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//Default scope Singleton
/*
 * @Repository - Used to mark a bean as DAO Component on persistence Layer
 * @Service - Used to mark a bean as Service Component on business Layer
 * @Controller - USed to mark a bean as Controller Component on Presentation Layer
 * @Configuration - Used to mark a bean as Configuration Component.
 * @Component - General purpose annotation, can be used as a replacement for above
 * http://www.baeldum.com/spring-bean-scopes
 */
public class HelloWorld {

	@Autowired
	@Value("Hello World From Annotations!")
	private String hello;
	
	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}
	
	
}
