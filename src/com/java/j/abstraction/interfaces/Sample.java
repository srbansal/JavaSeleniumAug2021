package com.java.j.abstraction.interfaces;

public class Sample implements Printable {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.print();
		System.out.println(data);
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
	
//	@Override
//	public static void m2()		// error: static method cannot be overridden
//	{
//	}

}
