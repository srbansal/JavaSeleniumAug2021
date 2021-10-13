package com.java.n.collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;

/*
arrays (static/ fixed size): cannot increase/ decrease the size 
every element has an index 0 to n-1
faster
arrays > collection of same type of elements
e.g. array of integers, array of String, array of students

different operations on array (but no inbuilt method to search, sort, etc.)
enchanced for loop : works only with arrays and collection

Collection Framework (dynamic size)
Framework in Java: group of classes

comes with huge lib: methods to apply for different operations

ArrayList: array with duplicate elements
Set: no duplicate values

Map: Key value pair
-------
ArrayList: array with duplicate elements
by default: 10 elements

Iterator: universal cursor: any of the collection classes
ListIterator > applicable only for List


*/
public class ArrayListExample {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		
//		al.add("Ram");
//		al.add("Pranav");
//		al.add("Ram");
//		al.add("Deeksha");
//		int i=9;
//		al.add(i); // autoboxing > convert from primitive to class type > Integer
//		
//		System.out.println(al);

//		------- generics (type safety)    ArrayList<String> -----------
		ArrayList<String> al = new ArrayList<String>(); // <> is called generics
		ArrayList<String> al2 = new ArrayList<String>(); 
		

		al.add("Ram");
		al.add("Pranav");
		al.add("Ram");
		al.add("Deeksha");
		al.add("Naugesh");
		al.add("Rakesh");
		al.add("Raj");
		al.add("Rimsha");
//		int i=9;
//		al.add(i); // autoboxing > convert from primitive to class type > Integer
		System.out.println(al);
		
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al.addAll(al2);
//		first way
		System.out.println(al);
		System.out.println("size " + al.size());
		
		System.out.println(al.get(0)); // fetching first element
		
//		second way
//		for(String e: al)
//			System.out.println(e);
		
//		for(String e: al)
//		{
//			if(e.startsWith("R"))
//				System.out.println(e);
//		}
		
//		third way to traverse: using Iterator
		Iterator<String> it = al.iterator(); // Note: always import from util class)
//		Iterator is an interface here
//		iterator is a method of ArrayList
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}






