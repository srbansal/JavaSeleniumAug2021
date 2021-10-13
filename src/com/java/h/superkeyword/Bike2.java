package com.java.h.superkeyword;

/*
this refer to the current object:  1. refers to the instance var  2. constructor calling

super (useful in case of inheritance only): refer to the immeidate parent object
usage:
1. to refer to the instance variable of the immediate parent class
2. to refer to the instance method of immediate parent class
3. to invoke constructor of immediate parent class

*/
class Vehicle2
{
	void show() 	
	{
		System.out.println("Vehicle Running");
	}
	
	
}

public class Bike2 extends Vehicle2 {

	void show() 	
	{
		System.out.println("Bike Running");
	}
	
	void display()
	{
		show();
		super.show();
	}
	
	public static void main(String[] args) {
		Bike2 b = new Bike2();
		b.display();
		
	}

}
