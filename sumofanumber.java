package com.codegnan.javapractice;

import java.util.Scanner;

public class sumofanumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scanner.nextInt();
		int on =n;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("The sum of "+on+" is "+sum);

	}

}
