package com.vibha.springs.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/springs/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO i = (OrderBO) ctx.getBean("bo");
		i.placeOrder();

	}

}
