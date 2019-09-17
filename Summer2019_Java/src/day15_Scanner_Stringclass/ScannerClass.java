package day15_Scanner_Stringclass;
import java.util.Scanner;
/*
 two import types:
 import java.util.Scanner;
 wild import:
 import java.util.*;   // it means it imports all the classes within "java.util" package.
 */

public class ScannerClass {
	 
	public static void main(String[] args) {
		
		
		/*
 	1. make a program that allows a person to go on vacation
	5000-10,000 is a cheap vacation
	10000-15,000 is average
	15000-20,000 is expensive
    2. ask the person to input budget
	have a statement that prints out for each one about whether it is “cheap, avg, or expensive”
	3. for cheap vacation give them the option
	1. west Virginia OR Florida
	for the AVG vacation give them the option
	CANADA or MEXICO
	for the EXPENSIVE vacation JAPAN or ENGLAND
	and make the vacation “not possible ” if budget is under 5,000
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your budget?(between 5,000 and 20,000)");
		int budget=scan.nextInt();
		if(budget>=5000 && budget<=10000) {
			System.out.println("You have chosen a cheaper getaway, but we can work with it.");
		}
		else if(budget>10000 && budget<=15000) {
			System.out.println("You have chosen an average vacation");
		}
		else if(budget>15000 && budget<=20000) {
			System.out.println("You have chosen a luxurious vacation");
		}
		else {
			System.out.println("Not possible");
		}
		String destination=scan.nextLine();
		destination=(budget>=5000 && budget<=10000)?"Would you like to go to West Virginia or Florida?"
				:(budget>10000 && budget<=15000)?"Would you like to go to Canada or Mexico?"
						:(budget>10000 && budget<=15000)?"Would you like to go to Japan or England?"
								:"Invalid";
		System.out.println(destination);
		
		String dest2=scan.nextLine();
		
		switch(dest2){
		case "West Virginia":
			System.out.println("Enjoy the mountaintops and great outdoors!");
			break;
		case "Florida":
			System.out.println("Enjoy the waves, and don't forget your sunscreen!");
			break;
		case "Canada":
			System.out.println("Bundle up, and don't forget to see the great Niagara Falls");
			break;
		case "Mexico":
			System.out.println("Ahh! Buena eleccion. Mexico tiene paisajes muy bonitos");
			System.out.println("Please visit the chichen itza.");
			break;
		case "Japan":
			System.out.println("kon'nichiwa yokoso! Don't get lost in the biggest metropolitan are in the world");
			break;
		case "England":
			System.out.println("Get ready to eat lots of fishNchips, and say hi to the queen");
			break;
		default:
			System.out.println("Sorry, not one of our destinations");
			break;
			
		}
		
	}
	
	

}
