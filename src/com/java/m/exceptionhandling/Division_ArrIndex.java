package com.java.m.exceptionhandling;

public class Division_ArrIndex {

	public static void main(String[] args) {

		int no1=5, no2=2;
		int res, index=4;
//		String s = null;
		String s = "value";
		int arr[] = {10, 30, 20, 70, 20};
		try
		{
			res = no1/ no2; 
			System.out.println("Division is " + res);
			System.out.println("Element at index " + arr[index]);
			System.out.println(s.length()); 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Array index should be 0 to 4");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("please include some value in the string var s");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("General catch block");
		}
		finally
		{
			System.out.println("This will always get executed");
		}
		
	}

}
