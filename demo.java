package com.codegnan.oopprogramming;

abstract class vehicle{
	public abstract int getnoofwheels();
}

class bus extends vehicle{
	public int getnoofwheels() {
		return 7;
	}
}
class auto extends vehicle{
	public int getnoofwheels() {
		return 3;
	}
}

public class demo {

	public static void main(String[] args) {
		bus b=new bus();
		auto a=new auto();
		System.out.println("no. of wheels of bus : "+b.getnoofwheels());
		System.out.println("no. of wheels of auto : "+a.getnoofwheels());

		
		}
	}

