package com.java.a.controlstructure.ii.arrays;

//print the array contents in reverse order of index 
public class ArrayPrintReverse {

	public static void main(String[] args) {

		
		int arr[] = {10, 15, 10, 13, 20, 13, 12, 10};
 
		System.out.println("Array");
		
		for(int i=arr.length-1;i>=0;i--) 
			System.out.println(arr[i]);
			
	}

}
