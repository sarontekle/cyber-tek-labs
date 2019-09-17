package day15_Scanner_Stringclass;
import java.util.Scanner;

public class Warmup {
	/*
	 Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.
Input: 
Enter price in cents: 95
Output:
Your change is 0 quarters, 0 dimes, and 1 nickels.
Remember:
1 quarter = 25 cents.
1 dimes = 10 cents.
1 nickels  = 5 cents.
you will need to use assignment and short hand operators for this task. Good luck (edited) 
	 */
	
	public static void main(String[] args) {
		
		int quarter=0, dimes=0, nickels=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter price in cents: ");
		int cents= scan.nextInt();
		quarter=(100-cents)/25;
		dimes=(100-cents)/10;
		nickels=(100-cents)/5;
		System.out.println("Your change is: "+quarter+" quarters, "+dimes+" dimes, and "+nickels+" nickels");
		
	}

}
