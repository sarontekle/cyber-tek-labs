package day16_Recap;
import java.util.Scanner;

public class NextLine {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your phone number");
		int phonenum=scan.nextInt();
		   scan.nextLine();  //this allows for the nextLine() coming after any other next method to be executed. 
		System.out.println("Enter your name");
		String name=scan.nextLine();
		String word=scan.nextLine();
	     char lastLetter=word.charAt(word.length()-1);

	}

}
