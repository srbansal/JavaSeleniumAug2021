package com.java.basics;

public class overloadingex {


		void printArea(float r)
	    {
	        System.out.println("Area of Circle "+(3.14*r*r));
	    }
	    
	    void printArea(float l, float b)  // method overloading
	    {
	        System.out.println("Area of Rectangle "+(l*b));
	    }
	    
	    void printArea(float pt, float b, float h)  // method overloading pt 0.5f
	    {
	        System.out.println("Area of Triange "+(pt*b*h));
	    }
	    public static void main(String args[])
	    {
	    	overloadingex obj = new overloadingex();
	        
	        obj.printArea(9f);
	        obj.printArea(2.3f, 6.7f);
	        obj.printArea(0.5f, 3f, 5.6f);
	    }

	

}
