package com.java.basics;
import java.util.*;

public class AgeProg {
	public void age()
	{
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		a=sc.nextInt();
		boolean eligible=(a>=18)?true:false;
		System.out.println("Are you eligible?"+eligible);
		
	}

	public static void main(String[] args)
	{

		AgeProg obj=new AgeProg();
		obj.age();
	}

}
