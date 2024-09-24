package com.codegnan.javapractice;

import java.util.Scanner;

public class ternery {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter purchased amount:");
		int p=scanner.nextInt();
		double d=(p>=100)?0.2*p:((p>=50)?0.1*p:p);
		System.out.println("The final price is : "+(p-d));
	}

}
