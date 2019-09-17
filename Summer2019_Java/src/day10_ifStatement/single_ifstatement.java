package day10_ifStatement;

public class single_ifstatement {
	public static void main(String[] args) {
		/*
		 * single is: if(boolean expression){ //A }
		 */
		if (9 > 8) {
			// true
			System.out.println("9 is greater than 8");
		}
		// if(9<8) {
		// expression is false, therefore it will not print on the console.
		System.out.println("8 is greater than 9");

		// System.out.println("Test Completed"); // gets executed because it does not
		// belong to any if blocks.

//	task 01 greater number:
		int num1 = 100;
		int num2 = 300;
		int max = 0;
		if (num1 > num2) {
			// false, which is why it will not execute on the console.
			max = num1; // max=100;
			System.out.println("Maximum number between " + num1 + "and" + num2 + "is " + num1);
		}
		if (num2 > num1) {
			// true, which prints the statement on the console.
			max = num2; // max=300;
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is " + num2);
		}

	}

}
