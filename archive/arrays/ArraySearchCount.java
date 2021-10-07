package com.java.arrays;

//search for a particular number (int search=10) in this arr and print the number of times it is found in the array
public class ArraySearchCount {

	public static void main(String[] args) {

		
		int arr[] = {10, 15, 10, 13, 20, 13, 12, 10};
		int search = 25;
		int count = 0;
 
		System.out.println("Array");
		for(int i=0; i<arr.length; i++) 
		{								
			if(arr[i] == search)
				count++;
			System.out.println(arr[i]);
		}		
		if(count == 0)
			System.out.println("Number "+search+" not found");
		else
			System.out.println("Number "+search+" appeared " + count + " times");
	}

}
