package com.java.i.finalkeyword;

/*
final > restriction
final > data member > mandatory to be initialized  > constant
final > method > cannot be overridden 
final > class > cannot extend that class 
*/
public class Sample {

	final int f;
	
	Sample()
	{
		f=60;  // final must be initialized: either while declaring it or in constructor 
	}
	
	void show()
	{
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		final int i=10;
		
//		final int j;
//		j = 20;
		
//		i=90; // can't be modified as it is a constant now;
		
		Sample s = new Sample();
		s.show();
//		s.f = 20;  // value cannot be assigned 
		
		
	}

}
