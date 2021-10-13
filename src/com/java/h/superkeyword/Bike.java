package com.java.h.superkeyword;

/*
this refer to the current object:  1. refers to the instance var  2. constructor calling

super (useful in case of inheritance only): refer to the immeidate parent object
usage:
1. to refer to the instance variable of the immediate parent class
2. to refe to the instance method of immediate parent class
3. to invoke constructor of immediate parent class

*/
class Vehicle
{
	int speed = 80;
	
	void show() 	// print speed of Vehicle
	{
		System.out.println("Speed of Vehicle: " + speed);
	}

	void print()
	{
		System.out.println("V print");
	}
}

public class Bike extends Vehicle {
	int speed = 60; 
	
	void show() 	// print speed of Bike
	{
		System.out.println("Speed of Bike: " + speed);
	}
	
	void showSpeed() 	// print both speeds (bike and vehicle in same method)
	{
		System.out.println("Speed of Bike: " + speed); // by default it would access local instance var
		System.out.println("Speed of Vehicle: " + super.speed);
	}
	
	public static void main(String[] args) {
		Bike b;
		b = new Bike();
//		System.out.println("Speed of Bike: " + b.speed);
//		b.show();
//		b.showSpeed();
//		b = new Vehicle();  // not possible without type casting
			
		
//		Solution
		Vehicle v;
		
		v = new Bike();
		v.show();
//		v.print();  // query possible?: response > not possible as method overriding is not applicable here 
		
		v = new Vehicle();
		v.show();
//		v.print();  // this is possible
		
	}

}
