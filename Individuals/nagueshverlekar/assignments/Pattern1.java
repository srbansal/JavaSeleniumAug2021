package com.java.assignments;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int j=1;j<=num;j++) {
			for(int i=1;i<=j;i++)
				System.out.print(" * ");
			    System.out.println();
		}

	}

}
