package com.java.basics;
import java.util.*;

public class Maxthreenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("Highest number is:"+a);
		else if(b>a && b>c)
			System.out.println("Highest number is:"+b);
		else
			System.out.println("Highest number is:"+c);
		

	}

}
