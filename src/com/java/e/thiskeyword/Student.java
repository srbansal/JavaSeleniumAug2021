package com.java.e.thiskeyword;

// this()  > invoke constructor from another constructor 

public class Student {
	int id;
	String name;
	
	Student()
	{
//		this(); // this refer to the current object, this() will call empty constructor without arg
		this(2, "Nirmal"); 
		System.out.println("Empty constructor called");
//		note: please ensure constructor call is not resulting infinite exeuction.
//		it would give error, Recursive constructor invokation
		
	}
	
	Student(int id, String name)
	{
//		id = id;	// 0 will be printed
//		name = name; // null will be printed
		this.id = id;	// should assign it to instance var
		this.name = name;
		System.out.println("Parameterised contructed called");
	}
	
	void show()
	{
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		
		
		Student s2 = new Student(1, "abc");  // 0 null	error	1 abc
		s2.show();

	}

}
