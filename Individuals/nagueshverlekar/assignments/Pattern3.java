package com.java.assignments;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		for(int j=1;j<=4;j++) {
			for(int i=1;i<=j;i++)
				System.out.print(" "+(x--)+" ");
			    System.out.println();
		}

	}

}
