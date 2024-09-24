package com.codegnan.javapractice;
import java.util.Scanner;
public class Areacircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=scanner.nextInt();
		double Area=3.14*r*r;
		System.out.println("Area of the circle is: "+Area);

	}

}
