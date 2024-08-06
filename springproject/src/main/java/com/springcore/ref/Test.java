package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/Refconfig.xml");
		A aref=(A) context.getBean("aref");
		System.out.println(aref.getX());
		System.out.println(aref.getObj().getY());
		System.out.println(aref.getObj());

	}

}
