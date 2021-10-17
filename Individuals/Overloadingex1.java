package com.java.basics;

public class Overloadingex1 {
	public float area(float l,float b)
	{
		float rect=l*b;
		return(rect);	
	}
	public float area(float s)
	{
		float sq=s*s;
		return(sq);
	}
	public float area(int r)
	{
		float pi=3.14f;
		float cir=pi*r*r;
		return(cir);
		
	}
	public static void main(String[] args) {
		Overloadingex1 obj=new Overloadingex1();
		System.out.println("Area of rectangle "+obj.area(10.5f,6.5f));
		System.out.println("Area of square "+obj.area(12.7f));
		System.out.println("Area of circle "+obj.area(19));

	}

}
