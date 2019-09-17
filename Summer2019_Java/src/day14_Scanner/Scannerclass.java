package day14_Scanner;
import java.util.Scanner;

public class Scannerclass {
	// it is a class that provides the method to get the user inputs
	// scanner class is presented in package "java.util".
	// must be imported as follows:
	// import java.util.Scanner;  // import statement is placed between package name and class name
	/*
	 Declaration:
	 Scanner VariableName= new Scanner(system.in);
	 VariableName: references an object of the Scanner class
	 new Scanner(System.in):creates the object of the scanner class.
	 
	 methods of scanner class:
	    VariableName.nextByte();
	 */

	 public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Byte Value");
		byte byteNum=input.nextByte();
		System.out.println("You have entered:"+byteNum);
		System.out.println("Enter another Byte Value");
		byte byteNum2=input.nextByte();
		System.out.println("You have entered:"+byteNum2);
		
		System.out.println("Addition is:"+(byteNum+byteNum2));
	}
}
