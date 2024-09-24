package com.codegnan.javapractice;

import java.util.Scanner;

public class arithmeticswitchcase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A:");
		int a = scanner.nextInt();
		System.out.println("Enter B:");
		int b = scanner.nextInt();
		System.out.println("Enter operation to be performed:");
		int i = scanner.nextInt();
		switch(i) {
		case(1):
			System.out.println(a+"+"+b+"="+(a+b));
		    break;
		case(2):
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case(3):
			System.out.println(a+"*"+b+"="+(a*b));
			break;	
		case(4):
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		case(5):
			System.out.println(a+"+%"+b+"="+(a%b));
			break;
		default:
			System.out.println("Select options from1-5");
	}

}
}