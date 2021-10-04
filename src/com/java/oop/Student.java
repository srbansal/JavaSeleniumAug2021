package com.java.oop;

public class Student {
//	instance variables/ properties
	private int rollNo; 
	private String firstName;
	public String address;
	String city;  // default: can be accessed within package
	
	static String schoolName;  // common,  class level property are static in nature
	
	
	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getFirstName() {
//		System.out.println(schoolName);
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


//	by default, package level method
	String getCity() {
		return city;
	}


	void display() {
		System.out.println(firstName);
		System.out.println(address);
		System.out.println(city);
		System.out.println(schoolName);
		
	}

	void setCity(String city) {
		this.city = city;
	}

	public static void printSchoolName()
	{
		System.out.println(schoolName);
//		System.out.println(city);
	}

	public static void main(String[] args) {
		int count=0;	// local
		System.out.println(count); 
		System.out.println(schoolName); // can be accessed from static method directly
		System.out.println(Student.schoolName); 
		
		printSchoolName();
//		System.out.println(address);  // instance property can't be accessed directly from static method
//		display(); // instance method can't be called directly from static method
		
//		static properties & methods can be accessed using both static or static methods
//		Non-static properties & methods can NOT be accessed using static methods
		
//		instance properties and methods can be accessed through object
		
		Student s1;		// declaration
		Student s2 = new Student();		// declaration, instantiation
		
//		System.out.println(s1.address);   // not possible, as s1 is not initialized yet
		System.out.println(s2.rollNo);  // private, instance
		System.out.println(s2.address);  // public, instance
		System.out.println(s2.firstName); // private, instance
		
	}

}
