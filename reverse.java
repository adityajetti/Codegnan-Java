package com.codegnan.oopprogramming;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int on=scanner.nextInt();
		int n=on;
		int rn=0;
		if(on<0) {
			on=on-(2*on);
			System.out.println(on);
			while(on!=0) {
				int rem=on%10;
				rn=rn*10+rem;
				on=on/10;
			}
			}else {
				while(on!=0) {
					int rem=on%10;
					rn=rn*10+rem;
					on=on/10;
			}
		}
		System.out.println("Revere of a number is : "+rn);

	}
}

