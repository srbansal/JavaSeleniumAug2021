package com.java.i.finalkeyword;

/*
final > restriction
final > data member (and local variables)> mandatory to be initialized  > constant
final > method > cannot be overridden 
final > class > cannot extend that class 
*/

final class Parent3 {  // Parent3 class is immutable (cannot be extended)
	void show()
	{
		System.out.println("show method of parent");
	}
	
	final void display()
	{
		System.out.println("diplay method of parent which cannot be overridden");
	}
}

// following won't work: cannot extend the final class
//public class Sample3 extends Parent3{
public class Sample3{

	final int f;
	
	Sample3()
	{
		f=60;  // final must be initialized: either while declaring it or in constructor 
	}
	
	void show()
	{
		System.out.println(f);
	}
	
//	following will not work: final method of Parent cannot be overridden
//	void display()
//	{
//		System.out.println("diplay method of parent which cannot be overridden");
//	}
	
	
	public static void main(String[] args) {
		
		
		Sample3 s = new Sample3();
		s.show();
 
		
		
	}

}
