package com.java.n.collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Set > collection of unique elements
if we try to add duplicate elements, it will ignore it(no error)

Set is an Interface
Implemented by Classes
HashSet			> insertion order is not maintained
LinkedHashSet   > maintains insertion order
TreeSet			> sorted order > null not allowed (it causes exception)

*/
public class SetExample {

	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("abc");
//		hs.add("xyz");
//		hs.add("ttt");
//		hs.add("abc");
//		hs.add("atb");
//		hs.add("eee");
////		hs.add("null");		
//		hs.add(null);		
//		System.out.println(hs);
		
//		LinkedHashSet<String> hs = new LinkedHashSet<String>();
//		hs.add("abc");
//		hs.add("xyz");
//		hs.add("ttt");
//		hs.add("abc");
//		hs.add("atb");
//		hs.add("eee");
//		hs.add("null");		
//		hs.add(null);		
//		System.out.println(hs);
		
		TreeSet<String> hs = new TreeSet<String>();
		hs.add("abc");
		hs.add("xyz");
		hs.add("ttt");
		hs.add("abc");
		hs.add("atb");
		hs.add("eee");
		hs.add("null");		
//		hs.add(null); // exception 		
		System.out.println(hs);
		
		
		
	}

}
