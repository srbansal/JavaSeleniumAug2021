package com.java.f.encapsulation;

public class Student {

	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.id);
		
		s.setId(1);
		s.setName("Sunil");
		
		System.out.println("Id: " + s.getId());
		System.out.println("Name: " + s.getName());
		
//		Reflection in Java to get class name
		System.out.println("Name: " + s.getClass());
	}

}
