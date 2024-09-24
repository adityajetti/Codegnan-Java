package com.codegnan.javapractice;
import java.util.Scanner;
public class Areaofsphere {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=scanner.nextInt();
		double a=4*3.14*Math.pow(r, 2);
		System.out.println("The area of sphere is :"+a);
	}

}
