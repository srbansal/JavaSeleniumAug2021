package com.java.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		for(int i=1;i<=num;i++)
			f=f*i;
		
		System.out.println("Factorial of "+num+" is "+f);

	}

}
