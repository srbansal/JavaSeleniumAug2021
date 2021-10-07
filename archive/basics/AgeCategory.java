package com.java.basics;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		age = sc.nextInt();
		
		if(age<18)
			System.out.println("Enjoy childhood!");
		else if(age<60)
			System.out.println("Howz you work going on!");
		else if(age<90)
			System.out.println("How are you enjoying Reitred life!");
		else
			System.out.println("Amazing!");
			
		
	}

}
