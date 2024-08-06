package org.springproject.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("org/springproject/collections/Empconfig.xml");
	       Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1);

	}

}
