package com.java.assignments;

import java.util.Scanner;

public class MaxOfThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.println("Largest number is "+num1);
		else
			if(num2>num1 && num2>num3)
				System.out.println("Largest number is "+num2);
			else
				System.out.println("Largest number is "+num3);
	}

}
