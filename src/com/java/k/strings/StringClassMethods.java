package com.java.k.strings;

public class StringClassMethods {

	public static void main(String[] args) {
		String s1 = "Hello, How are you?";
		String s2 = "Welcome";
		String s3 = "Bad-Luck";
		String s4 = "hello";
		String s5 = "GOOD";
		
		System.out.println(s1.charAt(1)); // e
		System.out.println(s2.length()); // 7
		System.out.println(s1.substring(7)); // How are you?
		System.out.println(s1.substring(7,14)); // How are
		System.out.println(s2.indexOf('e')); // 1
		System.out.println(s2.indexOf('e',2)); // 6 
		System.out.println(s4.toUpperCase()); // HELLO
		System.out.println(s5.toLowerCase()); // good
		System.out.println(s3.replace("Bad", "Good"));
		System.out.println(s5.equals("GOOD")); // true 
		System.out.println(s5.equals("good")); // false
		System.out.println(s1.contains("are")); // true
		
//		------------------
		
		
	}

}
