package com.codegnan.oopprogramming;

abstract class area{
	public abstract String calculatearea(); {
	}
class square extends area{
	public String calculatearea() {
		return 7;
	}
}

class rectangle extends area{
	public String calculatearea() {
		return "length * breadth";
	}
}

class circle extends area{
	public String calculatearea() {
		return "3.14 * radius * radius";
	}
}
}


public class shape {
	public static void main(String[] args) {
		square s=new square();
		s.calculatearea();
	}

}
