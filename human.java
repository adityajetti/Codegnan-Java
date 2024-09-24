package com.codegnan.oopprogramming;

public class human {
	String name;
	int age;

	public human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		human h1=new human("ravi",11);
		//h1.name="Aditya";
		//h1.age=21;
		System.out.println("Name is "+h1.name+" age is "+h1.age);
		

	}

}
