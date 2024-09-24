package com.codegnan.oopprogramming;

public class person {
	private String name;
	private int age;
	private char gender;
	
	public person(String name,int age,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public void displayinfo() {
		System.out.println("name: "+name+" age: "+age+" gender: "+gender);
	}

	public static void main(String[] args) {
	person person1=new person("Aditya",21,'m');
	person1.displayinfo();
		
	person1.setName("Sunny");
	person1.setAge(22);
	person1.setGender('f');
	person1.displayinfo();

	}

}
