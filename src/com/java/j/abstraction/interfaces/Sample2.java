package com.java.j.abstraction.interfaces;

public class Sample2 implements Printable, Testable {

	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.print();
		System.out.println(Printable.data);
		System.out.println(Testable.data);
		s.m1();
		Printable.m2();
	}

	@Override
	public void print()		// must be overridden (in a concrete class) 
	{		
		System.out.println("print from Sample");
	}
	
	@Override
	public void m1()	// may or may not be overridden
	{
		System.out.println("m1 from Sample");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public static void m2()		// error: static method cannot be overridden
//	{
//	}

}
