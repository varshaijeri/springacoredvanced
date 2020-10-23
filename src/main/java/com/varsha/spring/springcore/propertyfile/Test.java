package com.varsha.spring.springcore.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/varsha/spring/springcore/propertyfile/config.xml");
		WSClient wsclient = (WSClient) ctx.getBean("wsclient");
		System.out.println(wsclient);
	}
}
