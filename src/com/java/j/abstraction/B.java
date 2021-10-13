package com.java.j.abstraction;

public class B extends A {

	B()
	{
		System.out.println("B class constructor");
	}
	
	@Override
	void m2() {
		System.out.println("m2 from B");
	}
	
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		m3();
	}
}
