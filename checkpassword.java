package com.codegnan.oopprogramming;

import java.util.Scanner;
interface PasswordChecker{
	public abstract String checklength(String password); 
	public abstract String checkcomplexity(String password);
}
class simplechecker implements PasswordChecker{
	public String checklength(String password) {
		return("length: "+password.length());
	}


public String checkcomplexity(String password) {
			if(password.length()<8) {
				return "weak";
			}else if(password.length()==8) {
				return "medium";
			}else {
				return "strong";
			}
	}
}
	
public class checkpassword {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a password: ");
		String password=scanner.nextLine();
		
		PasswordChecker simplechecker=new simplechecker();
		System.out.println(simplechecker.checklength(password));
		System.out.println(simplechecker.checkcomplexity(password));

	}

}
