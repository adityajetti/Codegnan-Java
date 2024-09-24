package com.codegnan.javapractice;

import java.util.Scanner;

public class plan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your talktime:");
		int t=scanner.nextInt();
		if(t<=100) {
			System.out.println("Basic Plan");
		}else if(t<=300) {
			System.out.println("Standard plan");
		}else if(t<=500) {
			System.out.println("Premium plan");
		}else {
			System.out.println("Unlimited plan");
		}
		}

}
