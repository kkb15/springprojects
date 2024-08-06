package com.springproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void init() {
		System.out.println("Example INIT");
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Example Destroy");
	}

}
