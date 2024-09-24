package com.codegnan.oopprogramming;

class animal{
	public void makesound() {
		System.out.println("Some sound...");
	}
}

class dog extends animal{
	public void makesound() {
		System.out.println("bark");
	}
	public void fetch() {
		System.out.println("fetch a ball");
	}
}

class cat extends animal{
	public void makesound() {
		System.out.println("bark");
    	}

	public void scratch() {
		System.out.println("scratching");
}
	
public class typecasting {

	public static void main(String[] args) {
		animal a1=new dog();
		animal a2=new cat();
		
		a1.makesound();
		a2.makesound();
		
		
		if( a1 instanceof dog) {
			dog d=(dog) a1;
			d.fetch();
		}

	}
}
}

