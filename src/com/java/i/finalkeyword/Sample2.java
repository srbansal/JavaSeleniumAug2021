package com.java.i.finalkeyword;

/*
final > restriction
final > data member > mandatory to be initialized  > constant
final > method > cannot be overridden 
final > class > cannot extend that class 
*/

class Parent {
	void show()
	{
		System.out.println("show method of parent");
	}
	
	final void display()
	{
		System.out.println("diplay method of parent which cannot be overridden");
	}
}


public class Sample2 extends Parent{

	final int f;
	
	Sample2()
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
		
		
		Sample2 s = new Sample2();
		s.show();
 
		
		
	}

}
