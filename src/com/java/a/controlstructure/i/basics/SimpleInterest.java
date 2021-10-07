package com.java.a.controlstructure.i.basics;

//Compute SI
public class SimpleInterest {

	float computeSimpleInterest() {
		float p, r, t, si;
		p = 8000;
		r = 2.5f;
		t = 4.5f;

		si = (p*r*t)/100;
		return si;
	}

	public static void main(String[] args) {
		SimpleInterest s1 = new SimpleInterest();
		
		float s = s1.computeSimpleInterest();
		System.out.println("SI: "+ s);
		
//		or
//		System.out.println("SI: "+ s1.computeSimpleInterest());
	}

}
