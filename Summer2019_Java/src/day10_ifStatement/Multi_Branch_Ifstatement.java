package day10_ifStatement;

public class Multi_Branch_Ifstatement {  //more than two choices in answers
	/*
	 
         Multi-branch if statements:
         if(condition1){
           //A
         }
         else if(condition2){
          //B
         }
         else {
         //C
         }
         if condition1 is true=>A
         if Condition 1 is false & condition2 is true==>B
         if contiion1 and 2 are false==>C
         
 */
	public static void main(String[] args) {
		if(false) {
			System.out.println("if block");
		}
		else if(false) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		/*
		 Task01:
		 90<=grade==>A
		 80<=grade<90==>B
		 70<=grade<80==>C
		 60<=grade<70==>D
		 else==>F
		 */
		int grade=85;
		if(grade>=90) {
			System.out.println("You have made an A");
		}
		else if(grade<90 && grade>=80) {
			System.out.println("You made a B");
		}
		else if(grade<80 && grade>=70) {
			System.out.println("You made a C");
		}
		else if(grade<70 && grade>=60) {
			System.out.println("You made a D");
		}
		else {
			System.out.println("Sorry! You failed");
		}
		/*
		 Task 02:
		 Write a program that:
		  1. 0~12==>good morning;
		  2. 12~15==> good afternoon;
		  3. 15`23==> good night;
		  4. 12==>good noon;
		 */
		int hour=12;
		if(hour>=0 && hour<12) {
			System.out.println("Good morning");
		}
		else if(hour>=12 && hour<=15) {
			System.out.println("Good afternoon");
		}
		else if(hour>15 && hour <=23) {
			System.out.println("Good night");
		}
		else {
			System.out.println("noon");
		}
		/*
		 Task 03:
		 int num1,num2,num3,
		 find the biggest number
		 */
		int num1=200, num2=300, num3=50;
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the biggest number");
			}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the biggest number");
		}
		else if (num3>num1 && num3>num2){
			System.out.println(num3 +" is the biggest number");
		}
		else if(num3==num2 && num3>num1) {
			System.out.println(num3+" and "+num2+" are the bigger numbers");
		}
		else if(num3==num1 && num3>num2) {
			System.out.println(num3+" and "+num1+" are the bigger number");
		}
		else if (num1==num2 && num1>num3) {
			System.out.println(num1+" and "+num2+" are the bigger numbers");
		}
		else {
			System.out.println("all of them are equal");
		}
	}


}
