package com.java.c.methodoverloading;
// method overloading > Main function
//We can overload the main function in Java
//We can not override the main function in Java



public class MethodOverloadingMain {

	public static void main(int i)
	{
		System.out.println("main with int "+ i);
	}
	
	public static void main(float f)
	{
		System.out.println("main with float "+ f);
	}
	
	public static void main(int i, float f)
	{
		System.out.println("main with int and float "+ i + " " + f);
	}
	
	
//	Overriding not possible, if we comment both of the below main functions, it would result in error
//	Error: Main method not found in class , please define the main method as:
//	   public static void main(String[] args)
//	public static void main(String[] args) 
	{
		System.out.println("main with string array");		
		main(89);
		main(8.4f);
		main(5, 6.7f);
	}
//	public static void main(String... args)  // variable args 
//	{
//		System.out.println("main with string array");		
//		main(89);
//		main(8.4f);
//	}

}
