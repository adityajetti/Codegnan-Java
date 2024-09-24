package com.codegnan.javapractice;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name:");
		String s=scanner.next();
		System.out.println("Enter ID:");
		int i=scanner.nextInt();
		System.out.println("Enter Gender:");
		char b=scanner.next().charAt(0);
		System.out.println("Enter Age:");
		int a=scanner.nextInt();
		System.out.println("Enter Marks:");
		int m=scanner.nextInt();
		 System.out.println("Name: "+s+'\n'+"ID: "+i+'\n'+"Gender: "+b+'\n'+"Age: "+a+'\n'+"Marks: "+m);
		}
}
