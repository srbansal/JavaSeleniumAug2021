package com.java.e.thiskeyword;
//this > current object
//1. useful to refer the instance variable (mandatory: when there is a local var with the same name)


public class ThisKeyword {

	int i = 30;
	
	void show() 
	{
		int i = 90;   // without this local variable, instance property value gets printed 
//		but value of local variable if present
		System.out.println("local i: " + i);
		System.out.println("instance var i: " + this.i);
	}
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		ThisKeyword obj2 = new ThisKeyword();
		
		obj.show();
		
	}

}
