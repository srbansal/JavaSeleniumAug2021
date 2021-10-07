package com.java.a.controlstructure.ii.arrays;
//search for a particular number (int search=10) in this arr and print if it is found or not
//print the postion of first occurence, if found
public class ArraySearchPosition {

	public static void main(String[] args) {

		
		int arr[] = {10, 15, 10, 13, 20, 13, 12, 10};
		int search = 25;
 
		System.out.println("Array");
		int i;
		for(i=0; i<arr.length; i++) 
		{								
			if(arr[i] == search)
				break;
		}		
		if(i<arr.length)
		{
//			String + any literal = String
//			System.out.println("Number "+search+" found at position " + i+1); // (str + index) + 1     
			System.out.println("Number "+search+" found at position " + (i+1));
		}
		else
			System.out.println("Number "+search+" not found");
			
	}

}
