package day10_ifStatement;

public class If_else_statement {
	/*
	 if else statement: the same declaration as a single if statement.
	     if (condition){
	       //A
	        }
	         else statement{
	        //B
	         }
	      ==>if condition is true --> A will be executed
	      ==>if condition is false --> B will be executes as an else statement. 
	 */
	public static void main(String[] args) {

		if (9>=8) {
			System.out.println("9 is greater than or equal to 8");
		}
		else {
			System.out.println("9 is less than 8");
		}
		// if 9 is not greater than or equal to 8, then 9 must be less than 8 which is why the if block gets executed instead of the else block.
		if(false!=false) {
			System.out.println("if clock");
		}
		else {
			System.out.println("else block");
		}
		/*
		 Task01:
		 if score<60==>failed
		 if score>=60 but score is <90==>pass
		 if score is >=90==> passed with distinction
		 */
		int score=99;
		if(score>=60) {
			System.out.println("Passed");
					}
		else {
			System.out.println("Failed");
		}
		if(score>=90) {
			System.out.println("you have an A+, good job!");
		}
		else {
			System.out.println("you have not gotten an A+");
		}
    /*
      triangle:has three angles,
         and sum of three angles must be equal to 180
         1. declare three variables angle1, angle2, and angle3
         2. write a program to check if the triangle is valid or not.
     */
		int angle1=20, angle2=50,angle3=75;
		boolean valid= (angle1+angle2+angle3)==180;
		if(valid) {
			System.out.println("it is a valid triangle");
		}
		else {
			System.out.println("Invalid triangle, do some math");
		}
		
		
		}

}
