package com.java.arrays;

/*
	int array[] = new int[5]; // by default initialized to 0

	stack			heap
	array
	array[0]		0
	array[1]		0
	array[2]		0
	array[3]		0
	array[4]		0

*/

public class ArrayExample {

	public static void main(String[] args) {
		int array[] = new int[5]; // by default values are initialized with 0
//		we do not mention the size for ref variable of an array
//		int a; // local var, not initialized by default
//		System.out.println(a); // error
		
		System.out.println(array); // reference
		System.out.println(array[0]); // value at 0th index which is 0
		
		System.out.println("Array");
//		for(initialization; condition; increament/ decreament)
		for(int i=0; i<5; i++)
		{
			System.out.println(array[i]);
		}
		
//		for(int i=0; i<=5; i++)  // Array index out of bound exception
//		{
//			System.out.println(array[i]);
//		}
		
		int arr[] = {11, 15, 10, 13, 20, 13, 12, 10};
//		we do not mention the size for ref variable of an array 
		System.out.println("Array");
		for(int i=0; i<arr.length; i++) // arrays has length property
		{								// var i is local to the block
			System.out.println(arr[i]);
		}		

	}

}
