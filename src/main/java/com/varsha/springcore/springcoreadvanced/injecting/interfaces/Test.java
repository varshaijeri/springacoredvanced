package com.varsha.springcore.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/varsha/springcore/springcoreadvanced/injecting/interfaces/configAnnotation.xml");
		OrderBO orderBO = (OrderBO) ctx.getBean("bo");
		orderBO.placeOrder();
	}

}
