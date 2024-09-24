package com.codegnan.javapractice;

import java.util.Scanner;

public class ifexample2 {

	public static void main(String[] args) {
		int acc_balance=10000;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount:");
		int w=scanner.nextInt();
		if(w<=acc_balance) {
			System.out.println("The withdrawal of "+w+" is successful.The remaining balance is: "+(acc_balance-w));
		}else {
			System.out.println("Insufficient balance");
		}
		
	}

}
