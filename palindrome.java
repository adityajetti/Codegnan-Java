package com.codegnan.javapractice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		int on=n;
		int rn=0;
		int cn=n;
		int count=0;
		while(cn!=0) {
			cn=cn/10;
			count=count+1;
		}
		while(n!=0) {
			int rem=n%10;
			rn=rn+(int)Math.pow(rem,count);
			n=n/10;
		}
		if(on==rn) {
			System.out.println("The number "+on+" is armstrong number");
		}else {
			System.out.println("Not an armstrong");
		}

	}	

	}

