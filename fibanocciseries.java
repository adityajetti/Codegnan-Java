package com.codegnan.javapractice;

import java.util.Scanner;

public class fibanocciseries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of terms in fibonacci series:");
		int nt=scanner.nextInt();
		int ft=0;
		int st=1;
		System.out.println("Fibonacci series:");
		System.out.print(ft+" "+st+" ");
		for(int i=2;i<nt;i++) {
			int nextterm=ft+st;
			System.out.print(" "+nextterm);
			ft=st;
			st=nextterm;
		}
		

	}

}
