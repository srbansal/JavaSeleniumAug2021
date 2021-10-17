package com.java.assignments;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d,r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		do {
			d = n%10;
			r=r*10+d;
			n=n/10;
		}while(n>0);
		System.out.println("Reversal is "+r);
	}

}
