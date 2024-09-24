package com.codegnan.javapractice;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your city name:");
		String cityname=scanner.next();
		if(cityname.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi..Adaab..");
			
		}else if(cityname.equalsIgnoreCase("Chennai")) {
			System.out.println("Hello madrasi..vanakkam..");
		}else if(cityname.equalsIgnoreCase("Bangalore")){
			System.out.println("Hello Kannadiga..Namaskara");
		}else {
			System.out.println("Please enter valid city name");
		}

	}

}
