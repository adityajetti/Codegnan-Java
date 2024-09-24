package com.codegnan.javapractice;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		int on=n;
		int rn=0;
		while(n!=0) {
			int rem=n%10;
			rn=rn*10+rem;
			n=n/10;
		}
		System.out.println("The reverse of "+on+" is "+rn);

	}

}
