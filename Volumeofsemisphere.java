package com.codegnan.javapractice;

import java.util.Scanner;

public class Volumeofsemisphere {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=scanner.nextInt();
		double a=(2*3.14*Math.pow(r, 3))/3;
		System.out.println("The volume of semisphere is :"+a);
	}

}
