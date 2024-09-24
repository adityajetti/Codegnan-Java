package com.codegnan.arrays;

public class countofarray {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		System.out.println("The count of array is: "+a.length);
		int sum=0;
		for(int number:a) {
			sum=sum+number;
		}
		System.out.println("The sum of the elements is : "+sum);
	}
}
