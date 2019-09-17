package day10_ifStatement;

public class Nested_If {
	/*
	 Nested if: is when an if condition contains another if condition. the code is executed when bothe the inner and outer conditions are both true.
	   if(condition1){
	       //A
	      if (condition2{
	      //B
	       }
	     }
	 
	 */
	public static void main(String[] args) {
	
		if(true) {
			if(true) {
				System.out.println("Hello World");
			}
		}
		//  condition1 is true but condition2 is false==> A will print out.
		// condition 1 and condition2 are both true==>both A and B print out. example:
		if(true) {
			System.out.println("Hello Batch 12");  // printed because it is the main if statement
			if(false) {
				System.out.println("Hello Programmers");  //will not print because it is false
			}
			else {
				System.out.println("Hello Team SDET");  // printed because it is an else option for the inner if statement.
			}
		}
		
		/*
		 
		 60>=grade<70==>D
		 70>=grade<80==>C
		 80>=grade<90==>B
		 90>=grade<=100==>A
		   grade<60==>F
		 */
		int grade=70;
		if(grade>=60) {
			System.out.println("You passed");
			if(grade>=90 && grade<=100) {
				System.out.println("\tWith an A");
			}
			else if(grade>=80 && grade<90) {
				System.out.println("\tWith a B");
			}
			else if(grade>=70 && grade<80) {
				System.out.println("\tWith a C");
			}
			else if(grade>=60 && grade<70) {
				System.out.println("\tWith a D");
			}
			else {
				System.out.println("You failed");
			}
		}
		/*
		Task:
		  50<= grade < 60 ==>F
          40<= grade < 50 ==>G
         30<= grade < 40 ==>H
         20<= grade < 30 ==>I
         10<= grade < 20 ==>J
         0<= grade < 10 ==>K
         */
	int grade1= 55;
	if(grade1>=0){
		System.out.println("you failed");
		if(grade1>=50 && grade1<60 ) {
			System.out.println("\t With an F");
		}
		else if(grade1>=40 && grade1<50) {
			System.out.println("\tWith a G");
		}
		else if(grade1>=30 && grade1<40) {
			System.out.println("\tWith an H");
		}
		else if(grade1>=20 && grade1<30) {
			System.out.println("\tWith an I");
		}
		else if(grade1>=10 && grade1<0) {
			System.out.println("\tWith a J");
		}
		else {
			System.out.println("What are you doing in class!");
		}
	}
}
	

}
