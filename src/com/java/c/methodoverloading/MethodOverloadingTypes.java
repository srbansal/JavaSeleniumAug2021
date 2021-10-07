package com.java.c.methodoverloading;
// method overloading > diff. types of params


public class MethodOverloadingTypes {

	void sum(int a, int b)
	{
		System.out.println("sum of int values "+(a + b));
	}
	
	void sum(float a, float b)  // method overloading
	{
		System.out.println("Sum of float values "+(a + b));
	}
	

	public static void main(String[] args) {
		MethodOverloadingTypes obj = new MethodOverloadingTypes();
		
//		obj.sum(9f);  // single arg, so error
		obj.sum(23, 67);
		obj.sum(23.5f, 5.6f);
		obj.sum(23.5f, 76); 
		
//		int a = 5;
//		float f;
//		f = a;
//		by default
//		int can be promoted to float
//		but float cannot be demoted to int
		
	}

}
