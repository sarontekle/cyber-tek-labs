package day18_StringClass_Continue;
import java.util.Scanner;

public class Warmup {
	/*
	 1. Write a program that asks a user's first and last name 
	 out put should display the first and last name initials
	 */
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your first and last name");
	String firstName=scan.nextLine();
	String lastName=scan.nextLine();
	System.out.println(firstName.charAt(0)+""+lastName.charAt(0));
	System.out.println(firstName.substring(0,1)+lastName.substring(0,1));
}
}
