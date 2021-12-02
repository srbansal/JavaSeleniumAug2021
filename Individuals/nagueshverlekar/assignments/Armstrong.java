package com.java.assignments;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d,r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		do {
			d = n%10;
			r=r+d*d*d;
			n=n/10;
		}while(n>0);
		if(r==temp)
		System.out.println("Number "+temp+" is an armstrong number");
		else
			System.out.println("Not an armstrong number");
	}

}
