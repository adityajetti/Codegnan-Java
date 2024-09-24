package com.codegnan.pattern;

public class trianglepattern {

	public static void main(String[] args) {
		int rows=10;
		for(int i=0;i<10;i++) {
			for(int j=0;j<rows-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<rows-i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
