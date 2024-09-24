package com.codegnan.javapractice;
import java.util.Scanner;
public class compoundinterest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter rate of interest:");
		int r=scanner.nextInt();
		System.out.println("Enter Time period:");
		int t=scanner.nextInt();
		System.out.println("Enter no. of times compounded:");
		int n=scanner.nextInt();
		System.out.println("Enter Principle amount:");
		int p=scanner.nextInt();
		int nt=n*t;
		double c=p*(Math.pow((1+(r/n)),(nt)));
		System.out.println("the compound interest is: "+c);
		
	}
}
