package day05_recap;

public class Concatenation {
/*
 String: is a non primitive data type. it is used to store text rendered in double quotation marks.
 Concatenation: is used to combine or link things together. it is done with "+" or "-" operators.
 concatenation operations are done using algebra like manners. whichever operation is in parenthesis is done fist then moves on to other operations(BODMAS)
 strings can be attached or combined using concatenation operators. 
 which ever is next to a string with just + token is concated like a text rather than a number
 */
	public static void main(String[] args) {
		String str= "any text goes here";
		System.out.println(str);
		String hello="Hello World";
		System.out.println(hello);
//		concat:
		String myName="Cybertek " +"School";
	System.out.println(myName);	
	String Year= "This is"+ 2019;
	System.out.println(Year);
	System.out.println("1"+1+2); //112
	String str2="100"+10;
	System.out.println(str2);  //10010
	System.out.println("1+2+3"); //1+2+3
	System.out.println(1+2+3);   //6
	System.out.println("1"+2+3);  // "12"+3=123
//	Tasks:
	System.out.println("123"+4+5);  //12345
	System.out.println("123"+(4+5));  //1239
	System.out.println(1+"2"+3); //123
//	Task #2:
	System.out.println(1+("2"+3)); //123
	System.out.println(1+2+"3"); //1+2=3+"3"=33
	System.out.println((1+2)+"3"); //(1+2)=3+"3"=33
	System.out.println("3"+'3');
// char can not be concated as a character but rather as a number or digit it is assigned when being assigned String.
// We also cannot concat char to a number as the example below, but the representative number for the char value will be concated.
	System.out.println('3'+3); //'3'=51 in ACII table, 51+3=54.
	
	}
}