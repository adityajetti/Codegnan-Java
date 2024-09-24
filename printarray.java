package com.codegnan.arrays;

import java.util.Scanner;

public class printarray {

	public static void main(String[] args) {
		/*int [] numbers= {10,20,30,40,50}; 
		for(int i=0;i<numbers.length;i++) {
			System.out.println("The element at "+i+" is "+numbers[i]);
		}*/
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=scanner.nextInt();
		int [] numbers=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter element at "+i+":");
			numbers[i]=scanner.nextInt();
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println("The element at "+i+" is "+numbers[i]);
		}
}
}