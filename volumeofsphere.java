package com.codegnan.javapractice;
import java.util.Scanner;
public class volumeofsphere {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=scanner.nextInt();
		System.out.println((int)(Math.pow(r, 3)));
		double v=(4/3)*(3.14)*((int)(Math.pow(r, 3)));
		System.out.println("the volume of the sphere is: "+v);
	}

}
