package com.codegnan.javapractice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scanner.nextInt();
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		System.out.println("The factorial of "+n+" is "+result);

	}

}
