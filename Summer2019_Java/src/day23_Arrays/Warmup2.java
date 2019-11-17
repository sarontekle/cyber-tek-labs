package day23_Arrays;
import java.util.Scanner;
	
public class Warmup2 {
/*
   2. Write a program that will find unique characters from the String.
   example:
   input:AAAABCDEEFF
   output: BCD
 */
	public static void main(String[] args) {
		String str="AAAABCDEEFF";
		String unique="";
		for(int j=0; j< str.length();j++) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.substring(i,i+1).contentEquals(""+str.charAt(j))) {
				count++;
			}
		}
		System.out.println(count);
		if(count==1) {
			unique+=""+str.charAt(j);
		}
		}
		System.out.println("Unique characters are: "+unique);
	}
}
