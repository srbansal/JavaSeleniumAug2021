package com.java.assignments;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is even or odd");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("Number "+num+" is an even number");
		else
			System.out.println("Number "+num+" is a odd number");
	}

}
