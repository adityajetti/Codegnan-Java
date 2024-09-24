package com.codegnan.javapractice;

import java.util.Scanner;

public class atmswitchcase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int acc_balance=10000;
		System.out.println("Choose the option:");
		int o=scanner.nextInt();
		switch(o) {
		case(1):
			System.out.println(acc_balance);
		    break;
		case(2):
			System.out.println("Enter the amount to be deposited:");
		    int d=scanner.nextInt();
		    if(d>=500 && d%100==0) {
		    	acc_balance=acc_balance+d;
		    	System.out.println("Current balance= "+acc_balance);
		    }else {
		    	System.out.println("Amount less than 500 cannot be deposited.");
		    }break;
		case(3):
			System.out.println("Enter the amount to be withdrawn:");
		    int w=scanner.nextInt();
		    if( w>=acc_balance) {
		    	System.out.println("Insufficient balance.");
		    }else if(w>=500 && w%100==0) {
		    	acc_balance=acc_balance-w;
		    	System.out.println("Current balance= "+acc_balance);
		    	
		    }
		    else if(w<500){
		    	System.out.println("Amount less than 500 cannot be withdrawn.");
	        }else{
	        	System.out.println("Money with denomination of 100 can only be withdrawn.");
	        }break;
		case(4):
			System.out.println("Thank you!");
		    break;
		default:
			System.out.println("Enter options from 1-4.");
		}
	}

}
