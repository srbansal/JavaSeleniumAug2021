package com.java.a.controlstructure.ii.arrays;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {

		int arr1[] = new int[5]; // default value 0
		
		System.out.println("Please enter 5 numbers");
	/*	Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr1.length; i++)
			arr1[i] = sc.nextInt();
//		for(int a:arr1)				// can't be used to assign/ modify values 
//			a = sc.nextInt();
		sc.close();
	*/
		
		System.out.println("Elements of Array");
//		for(int i=0; i<arr1.length; i++)
//			System.out.println(arr1[i]);;
		
		for(int a:arr1)
			System.out.println(a);
		
//		String
//		Array of char
		String players[] = {"Sachin", "Rahul", "Virat", "Dhoni"};
		
		for(String player: players)
			System.out.println(player);
		
		String s = "Java";
		char ch = s.charAt(3);
		char ar[] = s.toCharArray();
		System.out.println(ch);
		
		for(char c:ar)
			System.out.println(c);
		
	}

}
