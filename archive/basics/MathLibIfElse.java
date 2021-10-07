package com.java.basics;

import java.util.Scanner;

public class MathLibIfElse {

	public static void main(String[] args) {


		int a=15;
		int b=5;
		int result=0;
		char choice;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("** MENU **");
		System.out.println("A. Add");
		System.out.println("S. Sub");
		System.out.println("M. Mult");
		System.out.println("D. Div");
		System.out.println("R. Remainder/ Modulus");
		System.out.println("Q. Quit");
		System.out.println("Please enter your choice");		
		choice = sc.next().charAt(0);
		sc.close();
		
		if(choice == 'A')
		{
			result = a + b;
			System.out.println("Result is " + result);
		}	
		else if (choice == 'S')
		{
			result = a - b;
			System.out.println("Result is " + result);
		}
		else if (choice == 'M')
		{
			result = a * b;
			System.out.println("Result is " + result);
		}
		else if (choice == 'D')
		{
			result = a / b;
			System.out.println("Result is " + result);
		}
		else if (choice == 'R')
		{
			result = a % b;
			System.out.println("Result is " + result);
		}
		else if (choice == 'Q')
			System.out.println("Functionality is yet to be implmented");
		else
			System.out.println("Please enter a valid choice");
		
		
	}

}
