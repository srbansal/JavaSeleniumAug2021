package com.java.l.package1;

public class A {

	private int id = 1;
	protected int p = 100;
	String fund = "society";
	public String name = "popular";
	
	public void m1()
	{
		System.out.println("m1 from A");
		System.out.println(p); // all properties are accessible within class
	}
	
	public static void print()
	{
		System.out.println("Hello from a static method print() of A: Package1");
	}


}
