package com.java.l.package2;

import com.java.l.package1.A;

public class F extends A{

	public static void main(String[] args) {
		F f = new F();
		System.out.println("protected p " + f.p);
		
//		A a = new A();
//		System.out.println(a.); //only public property
	}

}
