package com.java.arrays;
//search for a particular number (int search=10) in this arr and print if it is found or not
//print the postion of first occurence, if found
public class ArrayExampleWhileLoop {

	public static void main(String[] args) {

		
		int arr[] = {10, 15, 10, 13, 20, 13, 12, 10};
		int search = 15;
 
		System.out.println("Array");
		int i=0;
		while(i<arr.length)  // i<=arr.length: ArrayIndexOutOfBounds Exception
		{
			if(arr[i] == search)
				break;
			i++;
		}		

		if(i<arr.length)
		{
			System.out.println("Number "+search+" found at position " + (i+1));
		}
		else
			System.out.println("Number "+search+" not found");
			
	}

}
