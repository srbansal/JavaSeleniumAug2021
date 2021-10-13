package com.java.l.package2;

//import com.java.l.package1.A;
//import com.java.l.package1.B;
import com.java.l.package1.*;
//import com.java.l.package1.pkga.D;

import static com.java.l.package1.pkga.D.display;


public class C {

	public static void main(String[] args) {
////		using fully qualified name
//		com.java.l.package1.A a = new com.java.l.package1.A(); // when we want to use only once
		

		A a = new A();
		B b = new B();
		
		a.m1();
		b.m2();
//		System.out.println(a.p); // not accessible outside package
//		a.print();  // this is not a static way: so we get a warning
		A.print(); // static way: ClassName.methodName()
		
//		D d = new D();
//		System.out.println(d.check); // not accessible outside package
		
//		display();
//		D.display();
		display();
		
	}

}
