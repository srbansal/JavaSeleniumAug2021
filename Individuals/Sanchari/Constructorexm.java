package com.java.basics;

public class Constructorexm {
	Constructorexm()
	{
		System.out.println("hello");
	}
	Constructorexm(int a,String b)
	{
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexm obj=new Constructorexm();
		Constructorexm obj1=new Constructorexm(10,"ABC");
		
		

	}

}
