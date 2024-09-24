package com.codegnan.javapractice;

import java.util.Scanner;

public class stdresult {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter student marks:");
		int marks=scanner.nextInt();
		if(marks>=80) {
			System.out.println("Passed in distinction");
		}else if(marks<80 && marks>=70) {
			System.out.println("Passed in first class");
		}else if(marks<70 && marks>=60) {
			System.out.println("Passed in second class");
		}else if(marks<60 && marks>=50) {
			System.out.println("Passed in third class");
		}else {
			System.out.println("Failed");
		}

	}

}
