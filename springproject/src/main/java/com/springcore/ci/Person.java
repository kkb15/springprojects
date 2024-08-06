package com.springcore.ci;

public class Person {
	private String name;
	private String personId;
	private Cert certno;
	
	
	public Person(String name, String personId, Cert certno) {
		super();
		this.name = name;
		this.personId = personId;
		this.certno=certno;
	}


	@Override
	public String toString() {
		return this.name+" : "+this.personId + " : "+ this.certno;
	}

}
