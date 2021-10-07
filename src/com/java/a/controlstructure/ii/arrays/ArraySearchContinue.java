package com.java.a.controlstructure.ii.arrays;

//print all the numbers from the array but 10
public class ArraySearchContinue {

	public static void main(String[] args) {

		
		int arr[] = {10, 15, 10, 13, 20, 13, 12, 10};
		int search = 10;
 
		System.out.println("Array");
		
		for(int i=0; i<arr.length; i++) 
		{								
			if(arr[i] == search)
				continue;
			System.out.println(arr[i]);
		}		
		
			
	}

}
