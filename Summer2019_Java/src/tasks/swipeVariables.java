package tasks;
import java.util.Scanner;

public class swipeVariables {
	public static void main(String[] args) {
//		int a=10;
//		int b=15;
//		System.out.println(a+5);
//		System.out.println(b-5);
		
		/*
		 write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
            DO NOT USE IF STATEMENT
ex 1: 
input:
enter a number between 0 to 9:
1
out put:
you have entered: one
ex 2:
input:
enter a number between 0 to 9:
2
output:
you have entered: two
ex 3:
enter a number between 0 to 9:
10
output:
you have entered: Invalid number
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number between 0 and 9: ");
		int num=scan.nextInt();
		String output=scan.nextLine();
		switch(num) {
		case 1:
			output="one";
			break;
		case 2:
			output="two";
			break;
		case 3:
			output="three";
			break;
		case 4:
			output="four";
			break;
		case 5:
			output="five";
			break;
		case 6:
			output="six";
			break;
		case 7:
			output="seven";
			break;
		case 8:
			output="eight";
			break;
		case 9:
			output="nine";
			break;
		case 0:
			output="zero";
			break;
		default:
			output="Invalid number";
			break;
		}
		System.out.println("You have entered: "+output);
	}

}
