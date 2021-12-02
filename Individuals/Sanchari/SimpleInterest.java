package com.java.basics;

public class SimpleInterest {
	
	public float simple()
	{
		int p=6000;
		float t=2.5f;
		float r=5.5f;
		float si=(p*t*r)/100;
		return(si);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest obj=new SimpleInterest();
		float s=obj.simple();
		System.out.println("The simple interest is "+s);
		
		
	}

}
