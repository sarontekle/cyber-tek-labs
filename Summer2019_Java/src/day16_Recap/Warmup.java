package day16_Recap;
import java.util.Scanner;

public class Warmup {
	/*
	 write a program that asks user to enter first and last name
	 printout users full name in all capital letters
	 full name:LastName FirstName
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter last name");
		String LastName= scan.nextLine();
		System.out.println("Enter first name");
		String FirstName= scan.nextLine();
		LastName= LastName.toUpperCase();
		FirstName=FirstName.toUpperCase();
		System.out.println("Full name: "+ FirstName+" "+LastName);
	}

}
