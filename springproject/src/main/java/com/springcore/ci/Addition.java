package com.springcore.ci;

public class Addition {
	private static int a;
	private static int b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor: int , int");}
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor: double , double");}
	
	public void sum() {
		System.out.println("Hello Addition");
	}

}
