package com.java.d.statickeyword;

public class Student {
	int id;
	String name;
	static String collegeName="Pune University";
	static String collegeAddress="Pune";
	
	Student(int i, String n)
	{
		id = i;
		name = n;
	}
	
	void show()
	{
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
	}
	
	static void showCollegeDetails()
	{
		System.out.println("College: " + collegeName);
		System.out.println("College Address: " + Student.collegeAddress);
	}
	
	
	public static void main(String[] args) {
//		static String college;  // a local variable cannot be static.
//		We cannot define a static variable inside main() or other methods()
		
//		System.out.println(Student.collegeAddress);
//		showCollegeDetails();

		Student.showCollegeDetails();  // both are fine in the same class
		
//		show(); // can't be called without an object. It's instance level method
		
		Student s1 = new Student(1, "abc");
		s1.show();
		
		Student s2 = new Student(2, "xyz");
		s2.show();
		
		System.out.println("access s1.name without method " + s1.name);
		
	}

}
