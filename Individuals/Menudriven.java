package com.java.basics;

import java.util.Scanner;
import java.lang.*;

public class Menudriven {
	

	public static void main(String[] args) {
			int a,b;
			char ch;
			Scanner sc= new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("A: Addition of two numbers");
			System.out.println("S: Subtraction of two numbers");
			System.out.println("M: Multiplication of two numbers");
			System.out.println("D: Division of two numbers");
			System.out.println("R: Mod of two numbers");
			ch=sc.next().charAt(0);
			switch(ch)
			{
			case 'A':
				System.out.println(a+b);
				break;
			case 'S':
				System.out.println(a-b);
				break;
			case 'M':
				System.out.println(a*b);
				break;
			case 'D':
				System.out.println(a/b);
				break;
			case 'R':
				System.out.println(a%b);
				break;
			default:
				System.out.println("invalid choice");
			}
	}

}
