package com.java.k.strings;

public class CountChars {

	public static void main(String[] args) {
		String s1 = "Welcome";
		int count=0;
		
		for(int i=0; i<s1.length(); i++)  // if i<=s1.length()	exception "String index out of range"
		{
			if(s1.charAt(i)=='e')
				count++;
		}
		
		System.out.println("count of e " + count);

//		for(value: values)
//		for(char ch: s1)
		count = 0;
		for(char ch: s1.toCharArray())
		{
			if(ch == 'e')
				count++;
		}
		System.out.println("count of e " + count);
		
		
	}

}
