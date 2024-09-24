package com.codegnan.javapractice;

import java.util.Scanner;

public class countofanumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scanner.nextInt();
		int on =n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println("The count of "+on+" is "+count);
		
	}

}
