package com.java.j.abstraction.interfaces;

/*

interfaces
Can a class extend interface? No
an interface can be implemented by classes

interface can be exteded by interface

interface					vs				abstarct
can contain only abstract methods			abstract classes can have constructor, concrete, abstract, static methods
(java8 onwards, concrete methods were
also allowed, to support lamda expression)

interfaces do not have constructors			abstract class can have constructors
it's done by compiler					must use abstract keyword
interfaces needs to be implemented by classes		abstract classes needs to be extended by classes

similarities
both can't be instantiated
both are used to achieve abstraction
interfaces can be implemented by one or more classes
------------------------------

concrete methods > default/ static
int a=10; public static final: added by compiler by default

*/
public interface Printable {
	int data=80; // public static final: added by compiler by default
	void print(); // public abstract: it must be overridden
//	public void print2(); // public can be written explicitly also
	
	
//	public default void m1(): this is also allowed (writing public)	// may or may not be overridden
	default void m1()	// may or may not be overridden
	{
		System.out.println("m1 from printable");
	}
//	default here is a keyword to implement concrete methods in an interface
	
//	void m3()	// by default methods would be considered abstract. for concrete, default/ static
//	{
//		System.out.println("m1 from printable");
//	}
	
	static void m2()	// static cannot be overridden, it can only be invoked
	{
		System.out.println("m2 from printable");
	}
	
	
}
