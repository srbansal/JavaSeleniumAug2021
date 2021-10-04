package com.java.basics;

import java.util.Scanner;

public class Operators_UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int add = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(mod);
		
		
		
		
	}

}
