package com.java.basics;
import java.util.*;

public class AgeProgram {
	public void age()
	{
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible for license");
		}
		else
		{
			System.out.println("Try once you 18");
		}
	}

	public static void main(String[] args)
	{

		AgeProgram obj=new AgeProgram();
		obj.age();
	}

}
