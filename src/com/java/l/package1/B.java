package com.java.l.package1;

public class B {
//	A a = new A();
	
	public void m2()
	{
		System.out.println("m2 from B");
//		System.out.println(a.id);
//		System.out.println(a.p);
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.fund); // default
		System.out.println(a.p); // protected 
//		System.out.println(a.id); // private not accessible 
		
//		B b = new B();
	}
}
