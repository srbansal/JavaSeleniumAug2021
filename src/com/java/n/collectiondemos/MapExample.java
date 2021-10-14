package com.java.n.collectiondemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
Map > collection of elements > key: value pair (one entry)
duplicate values are allowed
duplicate keys are not allowed, value would be overwritten

Map is an Interface
Implemented by Classes
HashMap			> insertion order is not maintained, key can be null
LinkedHashMap   > maintains insertion order, key can be null
TreeMap			> sorted order of key > null not allowed for key (null key causes exception)
										value can be null

*/
public class MapExample {

	public static void main(String[] args) {
	
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
////		two generics: one for key, one for value
//		hm.put(3, "C");  // entry
//		hm.put(2, "A"); 
//		hm.put(3, "E");  // duplicate key > No error, value would be overwritten  
//		hm.put(null, "T");  
//		hm.put(1, "C");  
//		hm.put(7, "C");  
//		hm.put(6, "Y");  
//		System.out.println(hm);
		
////		Maintains the insertion order
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
//		hm.put(3, "C");  // entry
//		hm.put(2, "A"); 
//		hm.put(3, "E");  // duplicate key > No error, value would be overwritten  
//		hm.put(null, "T");  
//		hm.put(1, "C");  
//		hm.put(7, "C");  
//		hm.put(6, "Y");  
//		System.out.println(hm);
		
//		TreeMap: sorted on keys, null key not allowed (null values allowed)
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(3, "C");  // entry
		hm.put(2, "A"); 
		hm.put(3, "E");  // duplicate key > No error, value would be overwritten  
//		hm.put(null, "T");  // null key not allowed: exception
		hm.put(1, "C");  
		hm.put(7, "C");  
		hm.put(6, "Y");  
		System.out.println(hm);
		
		
	}

}
