package com.codegnan.javapractice;
import java.util.Scanner;
public class volumeofcuboid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=scanner.nextInt();
		System.out.println("Enter breadth:");
		int b=scanner.nextInt();
		System.out.println("Enter height:");
		int h=scanner.nextInt();
		int v=l*b*h;
		System.out.println("the volume of cuboid is :"+v);
		
		
	}

}
