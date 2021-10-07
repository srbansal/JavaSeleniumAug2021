package com.java.arrays;

import java.util.Scanner;

public class MathLibSwitchDoWhile {

	public static void main(String[] args) {


		int a=15;
		int b=5;
		int result=0;
		char choice='A';
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter two numbers");
//		a = sc.nextInt();
//		b = sc.nextInt();
		
		do
		{
			System.out.println("** MENU **");
			System.out.println("A. Add");
			System.out.println("S. Sub");
			System.out.println("M. Mult");
			System.out.println("D. Div");
			System.out.println("R. Remainder/ Modulus");
			System.out.println("Q. Quit");
			System.out.println("Please enter your choice");		
			choice = sc.next().toUpperCase().charAt(0);
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
//				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid choice");
			}
		System.out.println("\n\n");
//		}while(true);		
		}while(choice!='Q');		

	}
}
