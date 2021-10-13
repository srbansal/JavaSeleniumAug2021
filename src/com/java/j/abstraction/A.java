package com.java.j.abstraction;

/*
abstract class can have concrete methods, abstract methods, startic methods, 
constructors and even main methods

only restriction is: it can't be instantiated 
*/

public abstract class A {

	A()
	{
		System.out.println("A class constructor");
	}
	
	void m1()  // non static, non abstract method: may or may not be overridden
	{
		System.out.println("m1 from A");
	}
	
	abstract void m2(); // abstract method: must be overridden
	
//	static void m3(); // static method not allowed without body
	
	static void m3()	// static method: cannot be overridden
	{
		System.out.println("Static method from class A");
	}
	
	
	public static void main(String[] args) {
		
//		which methods can be called from main directly?
		m3();
	}

}
