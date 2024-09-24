package com.codegnan.javapractice;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter year:");
		int y=scanner.nextInt();
		String s= y%4==0 && y%100!=0?"Leap year":"Not a leap year";
		System.out.println(s);
	}

}
