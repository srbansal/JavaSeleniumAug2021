package com.java.basics;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		age = sc.nextInt();
		
		if(age >= 18)
			System.out.println("You are eligible for a driving license");
		else
			System.out.println("Please try once you are 18 years old");
		
	}

}
