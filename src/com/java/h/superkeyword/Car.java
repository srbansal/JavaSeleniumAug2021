package com.java.h.superkeyword;

class Vehicle3
{
	
	Vehicle3()  // constructor without any args
	{
		System.out.println("Vehicle Running");
	}
	
	Vehicle3(int s)
	{
		System.out.println("Vehicle Running with the speed of " + s);
	}
	
	
}


public class Car extends Vehicle3 {

	int i;
	Car()
	{
//		super();  // invoke constructor of parent class/ super class
//		even after commenting it, constructor of super class is getting called
//		as compiler will do it for us, if we don't call super() explicitly. 
		
//		if parent class does not have a empty constructor, then we have to call parameterised 
//		constructor explicitly, oherwise it will give an error
		
//		super(90);
//		i=1;  // value 1 if assigned, otherwise default 0 value is used.  
		System.out.println("Car Running");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.i);
		
	}

}
