package com.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springproject/lifecycle/Configsamosa.xml");
		
//		Samosa s1 = (Samosa) context.getBean("samosa");
//		System.out.println(s1.toString());
		//register shutdown
		context.registerShutdownHook();
//		
//		Pepsi p=(Pepsi) context.getBean("p");
//		System.out.println(p);
		
		Example e=(Example) context.getBean("e");
		System.out.println(e);

	}

	

}
