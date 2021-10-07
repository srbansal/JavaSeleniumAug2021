package com.java.a.controlstructure.i.basics;

import java.util.Scanner;

public class MathLibSwitchWhile {

	public static void main(String[] args) {


		int a=15;
		int b=5;
		int result=0;
		char choice='A';
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter two numbers");
//		a = sc.nextInt();
//		b = sc.nextInt();
		
//		either compare choice with Q with break in switch
//		or go for infinite while loop with System.exit(0);
		
		while(choice!='Q')		
//		while(true)
		{
			System.out.println("\n\n** MENU **");
			System.out.println("A. Add");
			System.out.println("S. Sub");
			System.out.println("M. Mult");
			System.out.println("D. Div");
			System.out.println("R. Remainder/ Modulus");
			System.out.println("Q. Quit");
			System.out.println("Please enter your choice");
//			User is allowed to enter A and a. 
//			method call chaining
			choice = sc.next().toUpperCase().charAt(0);
//			choice = sc.next().toUpperCase().charAt(0).toLowerCase(); // error: cannot invoke a method on primitive datatype char
//			String str = sc.next();
//			choice = str.toUpperCase().charAt(0);
			
			switch(choice)
			{
			case 'A':
				result = a + b;
				System.out.println("Result is " + result);
				break;
			case 'S':
				result = a - b;
				System.out.println("Result is " + result);
				break;
			case 'M':
				result = a * b;
				System.out.println("Result is " + result);
				break;
			case 'D':
				result = a / b;
				System.out.println("Result is " + result);
				break;
			case 'R':
				result = a % b;
				System.out.println("Result is " + result);
				break;
			case 'Q':
				System.out.println("Thank you!");
				break;
//				System.exit(0);
			default:
				System.out.println("Please enter a valid choice");
			}
		}
	}
}
