package com.codegnan.javapractice;

import java.util.Scanner;

public class areaofcuboid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=scanner.nextInt();
		System.out.println("Enter breadth:");
		int b=scanner.nextInt();
		System.out.println("Enter height:");
		int h=scanner.nextInt();
		int a=2*(l*b+b*h+h*l);
		System.out.println("The area of cuboid is: "+a);
	}

}
