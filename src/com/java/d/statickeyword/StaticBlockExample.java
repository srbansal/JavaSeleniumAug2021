package com.java.d.statickeyword;

/*
static block > executed even before main
so that we can initialize the static variables (class variables)

constructor: useful to initialize instance variables
static block: useful to initlize static variables 

*/
public class StaticBlockExample {

	static int s;
	
	static 
	{
		s = 67;
		System.out.println("Static block1 executed");
	}
	static 
	{
		System.out.println("Static block2 executed");
	}
	
	public static void main(String[] args) {
		System.out.println(s);
		System.out.println("main executed");
	}

}
