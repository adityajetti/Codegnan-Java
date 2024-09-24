package com.codegnan.oopprogramming;

public class overloading {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public int add(int[] numbers) {
		int sum=0;
		for(int num:numbers) {
			sum=sum+num;
		}
		return sum;
	}
	public static void main(String[] args) {
		overloading o=new overloading();
		System.out.println("The sum of 5 and 3 is : "+o.add(5,3));
		System.out.println("The sum of 5 and 3 is : "+o.add(5,3,1));
		int[] numbers= {10,20,30,40};
		System.out.println("The sum of array is : "+o.add(numbers));
	}

}
