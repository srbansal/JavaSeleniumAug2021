package com.java.basics;
import java.util.*;

public class AgePro {
	public void age()
	{
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		a=sc.nextInt();
		if(a<18)
				System.out.println("You are a kid");
		else if(a>=18 && a<60)
				System.out.println("e");
		else if(a>=60 && a<90)
				System.out.println("Retired");
		else
				System.out.println("Amazing");

		
	}

	public static void main(String[] args)
	{

		AgePro obj=new AgePro();
		obj.age();
	}

}
