package com.codegnan.javapractice;

import java.util.Scanner;

public class vendingmachine {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter option:");
		int a = scanner.nextInt();
		switch(a) {
		case(1):
			System.out.println("Sprite");
		    break;
		case(2):
			System.out.println("Pepsi");
			break;
		case(3):
			System.out.println("Thumps up");
			break;
		case(4):
			System.out.println("Fanta");
			break;
		case(5):
			System.out.println("coca-cola");
			break;
		default:
			System.out.println("choose option only from 1-5");
		}

	}

}
