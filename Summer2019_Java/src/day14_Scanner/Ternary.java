package day14_Scanner;
import java.util.*;
public class Ternary {
	/*
	 Ternary:
	 if(condition) ==> (condition)?
	 else    ==>    :
	 else if(condition)  ==> :(condition)?
	 */
  public static void main(String[] args) {
	int num=0;
	if(false) {    // if and else if conditions print return anything under sysout print method
		num=100;
	}
	else {
		num=50;
	}
	int n=(false)?100:50;   //ternary returns a value
	int y=false?100:50;
	System.out.println(50);
	
	System.out.println(num);  //50
	System.out.println(n);  //50
	System.out.println(y);  //50
	
	
	String Schoolname="";
	boolean Batch12=true;
	if(Batch12) {
		Schoolname="Cybertek";
	}
	else {
		Schoolname="Invalid";
	}
	System.out.println(Batch12? "Cybertek":"Invalid");   //Cybertek
	String BestSchool= Batch12? "Cybertek": "Invalid";
	System.out.println(BestSchool);//Cybertek
	
	double d=10;
	if(true) {
		d=10.5;
	}
	double z= true? 10.5:0;   // in ternary, ? and : are supposed to be equal in number
	System.out.println(z);  //10.5 
	
	char Finalgrade='A';
	String Group="";
	if(Finalgrade=='A') {
		Group="Early bird";
	} else if(Finalgrade=='B') {
		Group="Group 1";
		} else if(Finalgrade=='C') {
			Group="Group 2";
		} else { 
			Group="After group 2";
		}
	
	Group=(Finalgrade=='A')?"Early bird" 
			:(Finalgrade=='B')?"Group1"
					:(Finalgrade=='C')?"Group2"
							:"After group 2";
	System.out.println(Group);
	
	int score=80;
	char Finals=' ';
	if(score>=90 && score <=100) {
		Finals='A';
	} else if(score>=80 && score <=89) {
		Finals='B';
	} else if(score >=70 && score<=79) {
		Finals='C';
	} else if( score>=60 && score <=69) {
		Finals='D';
	} else if( score>=0 && score <=59) {
		Finals='F';
	} else {
		Finals=' ';
	}
	
	Finals=score>=90 && score <=100?'A'
			:score>=80 && score <=89? 'B'
					:score >=70 && score<=79?'C'
							:score>=60 && score <=69?'D'
									:score>=0 && score <=59?'F'
											:' ';
	    System.out.println(Finals);
	    
	    int n1=100, n2=300, n3=400;
	    int max=(n1>n2 && n1>n3)?n1
	    		:(n2>n1 && n2>n3)? n2
	    			:n3;
	    System.out.println(max);
	    
	    /*
	     write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
           DO it with TERNARY
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
	   System.out.println("Enter a number between 0 and 9:");
	    int Num= scan.nextInt();
	    String output="";
	    output=(Num==0)?"zero"
	    		:(Num==1)?"one"
	    		 :(Num==2)?"two"
	    		   :(Num==3)?"three"
	    			 :(Num==4)?"four"
	    			  :(Num==5)?"five"
	    			   :(Num==6)?"six"
	    			     :(Num==7)?"seven"
	    				  :(Num==8)?"eight"
	    					:(Num==9)?"nine"
	    					  :"Invalid Number";
	    System.out.println("You have entered: "+ output);
}
}
