package com.java.basics;

import java.util.*;

public class MenudrivenProgram {
	public void menu()
	{
		int a,b,ch;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1: Addition of two numbers");
		System.out.println("2: Subtraction of two numbers");
		System.out.println("3: Multiplication of two numbers");
		System.out.println("4: Division of two numbers");
		System.out.println("5: Mod of two numbers");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		default:
			System.out.println("invalid choice");
		}

	}


	public static void main(String[] args) 
	{
		MenudrivenProgram obj=new MenudrivenProgram();
		obj.menu();
	}
		

}
