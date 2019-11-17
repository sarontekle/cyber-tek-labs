package day23_Arrays;
import java.util.Scanner;
public class Warmup {
	/*
	 interview question:
	 1. write a program that can divide two numbers without using division operators
	 */
	public static void main(String[] args) {
		int a=10;
		int b=3;
		System.out.println(a/b);//3
		/*
		 10-3=7
		 7-3=4
		 4-3=1   //the amount of times being devided will be the answer
		 
		 another example:
		 15-6=9
		 9-6=3
		 */
		int x=20;
		int y=6;
		int count =0;
		while(x>=y) {
			x-=y;
			count++;
		}
		System.out.println(count);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int result=0;
		if(num2!=0) {
		while(num1>=num2) {
			num1-=num2; //num1 becomes the remainder
			result++;
		}
		System.out.println("division is: "+result);
		}
		else {
			System.out.println("Invalid Entry");
		}
		int A,B;
		if(num1>num2) {
			A=num1;
			B=num2;
		}
		if(num2>num1) {
			A=num2;
			B=num1;
		}
		
	}

}
