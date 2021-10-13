package com.java.j.abstraction.interfaces;

interface One
{
	void m1();
}

interface Two
{
	void m2();
}

public interface Three extends One, Two  // multiple inheritance thru interface in Java
{
	void m3();
}


class Test3 implements Three {

	@Override
	public void m1() {

		
	}

	@Override
	public void m2() {

		
	}

	@Override
	public void m3() {
		
	}

}
