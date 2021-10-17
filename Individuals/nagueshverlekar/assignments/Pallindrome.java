package com.java.assignments;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d,r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		do {
			d = n%10;
			r=r*10+d;
			n=n/10;
		}while(n>0);
		if(r==temp)
		System.out.println("Number "+temp+" is a pallindrome");
		else
			System.out.println("Not a pallindrome");
	}

}
