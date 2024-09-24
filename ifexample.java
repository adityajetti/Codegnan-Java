package com.codegnan.javapractice;

import java.util.Scanner;

public class ifexample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		int n=scanner.nextInt();
		if(n>=30) {
			System.out.println("The day is too hot.Wear cotton clothes");
		}
		if(n>=20 && n<30) {
			System.out.println("The day is good.Enjoy your day");
		}
		if(n>=10 && n<20) {
			System.out.println("The day is too cold.Wear sweater");
		}
}
}
