package com.vibha.springs.springcoreadvanced.springcoreadvanced.expression.language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/springs/springcoreadvanced/springcoreadvanced/expression/language/config.xml");
		Instructor i = (Instructor) ctx.getBean("instr");
		System.out.println(i);

	}

}
