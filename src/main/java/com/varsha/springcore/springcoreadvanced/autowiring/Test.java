package com.varsha.springcore.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("com/varsha/springcore/springcoreadvanced/autowiring/config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp);

	}

}
