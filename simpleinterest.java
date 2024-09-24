package com.codegnan.javapractice;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter rate of interest:");
		int r=scanner.nextInt();
		System.out.println("Enter Time period:");
		int t=scanner.nextInt();
		System.out.println("Enter Principle amount:");
		int p=scanner.nextInt();
		int s=(p*t*r)/100;
		System.out.println("Simple interest is: "+s);
		int ta=s+p;
		System.out.println("Total amount to be paid: "+ta);
	}

}
