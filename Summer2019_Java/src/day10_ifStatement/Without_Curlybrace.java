package day10_ifStatement;

public class Without_Curlybrace {
	public static void main(String[] args) {
		/*
		 single if statement:
		 if(condition){
		 //some codes
		 }
		 */
		if(false) {
			System.out.println("Today is friday");
			System.out.println("Tommorow is day off");
			System.out.println("there is no java class tomorrow");
		}
		if (false)
			System.out.println("Today is friday");   // without curly brace, if statement can only contain one line of code, or one semicolon
		
		System.out.println("Tomorrow, there is no class");
		if (true)
			System.out.println("Hello"); //no curly brace means, only first line of code following the if statement will print under conditions.
		// else statement can be declared right after one line semicolon in the if statement
		// this is because the end semicolon is considered the end of the if block.
		
		/*
		 multi-branch statement:
		 if(condition1)
		 //single line of statement;
		 else if(condition2)
		 // single line of statement;
		 else if(condition3)
		 // single line of statement;
		 else
		 // single line of statement;
		 */
		if (true)
			System.out.println("if block");
		else if(true)
			System.out.println("else-if block");
		else
			System.out.println("else block");   //else block is not mandatory.
	}
}
