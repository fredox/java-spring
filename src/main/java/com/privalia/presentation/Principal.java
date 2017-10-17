package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		
		HelloWorld helloWorldConst = (HelloWorld)context.getBean("HelloWorldConstructor");
		
		System.out.println(helloWorldConst.getHello());
		
		System.out.println(helloWorld.getHello());
		
		context.close();
	}

}
