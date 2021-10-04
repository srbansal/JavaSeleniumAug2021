package com.java.basics;

import java.util.Scanner;

public class DrivingLicenseTernary {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		age = sc.nextInt();
		
		boolean eligible = (age>=18)? true: false;
		System.out.println("Are you eligible for a driving license? " + eligible);
		
	}

}
