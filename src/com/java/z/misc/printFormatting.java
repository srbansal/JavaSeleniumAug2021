package com.java.z.misc;
// method overloading > diff. number of params


public class printFormatting {

	void printArea(float r)
	{
		System.out.printf("Area of Circle %.2f\n",(3.14*r*r));
	}
	
	void printArea(float l, float b)  // method overloading
	{
		System.out.println("Area of Rectangle "+String.format("%.2f", l*b));
	}
	
	void printArea(float pt, float b, float h)  // method overloading pt 0.5f
	{
		System.out.println("Area of Triange "+Math.round(pt*b*h));
	}
	
	
	public static void main(String[] args) {
		printFormatting obj = new printFormatting();
		
		obj.printArea(9f);
		obj.printArea(2.3f, 6.7f);
		obj.printArea(0.5f, 3f, 5.6f);
		
		
	}

}
