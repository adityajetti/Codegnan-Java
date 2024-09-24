package com.codegnan.oopprogramming;

class parent{
	public void methodone() {
		System.out.println("parent class method one");
		}
}

class child extends parent {
	public void methodone() {
		System.out.println("child class method two");
	}
}
public class inheritance {

	public static void main(String[] args) {
		//parent p1=new parent();
		//p1.methodone();
		parent c1=new parent();
		c1.methodone();
		child c2=new child();
		c2.methodone();
		

	}

}
