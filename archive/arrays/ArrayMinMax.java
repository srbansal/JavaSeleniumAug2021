package com.java.arrays;

//print Minimum and maximum value from the array
public class ArrayMinMax {

	public static void main(String[] args) {

		
		int arr[] = {10, 15, 10, 13, 20, 13, 12, 10};
		int min = arr[0];
		int max = arr[0];
 
		System.out.println("Array");
		for(int i=1; i<arr.length; i++) 
		{								
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
			System.out.println(arr[i]);
		}		
		System.out.println("Max Number from array is "+max);
		System.out.println("Min Number from array is "+min);

	}

}
