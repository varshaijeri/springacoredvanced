package com.varsha.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/varsha/spring/springcore/propertyplaceholder/config.xml");
		MyDAO mydao = (MyDAO) ctx.getBean("myDAO");
		System.out.println(mydao);
	}
}
