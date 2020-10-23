package com.varsha.springcore.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("com/varsha/springcore/springcoreadvanced/stereotype/annotation/config.xml");
		Instructor instructor = (Instructor)ctx.getBean("inst");
		System.out.println(instructor);
		System.out.println(instructor.hashCode());
		
		Instructor instructor2 = (Instructor)ctx.getBean("inst");
		System.out.println(instructor2);
		System.out.println(instructor2.hashCode());

	}

}
