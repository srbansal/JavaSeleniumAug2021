package com.java.d.statickeyword;
import static com.java.d.statickeyword.Student.showCollegeDetails;
//import static com.java.d.statickeyword.Student.*; // import all static members


public class Test {
	
	public static void main(String[] args) {
//		showCollegeDetails(); // gives error as this method is not available in current class

//		Student.showCollegeDetails();  // outside the class, called using class name
//		com.java.d.statickeyword.Student.showCollegeDetails();
			
		showCollegeDetails(); // can be called directly if the method is imported statically
		
		Student s1 = new Student(1, "abc");
		s1.show();
		
		Student s2 = new Student(2, "xyz");
		s2.show();
		
		System.out.println("access s1.name without method " + s1.name);
		System.out.println(Student.collegeName);
		
	}

}
