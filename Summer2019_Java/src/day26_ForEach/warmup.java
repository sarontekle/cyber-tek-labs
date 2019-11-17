package day26_ForEach;

import java.util.Arrays;

public class warmup {
	public static void main(String[] args) {
		/*
		 write a program that will check if two strings are made up of the same letters.
		 */
		
		String a="aabbbc", b="cabababbaccab";
		
		String a1=""; // store all non duplicate values of a
		for (int j=0;j<a.length();j++) {
		for(int i=0;i<a.length();i++) {
			if(!a1.contains(a.substring(j,j+1) ) ){
				a1+=a.substring(j,j+1);
			}
		}
		}
		System.out.println(a1);
		
		String b1="";
		
		for(int i=0; i<a.length();i++) {
			if(!b1.contains(b.substring(i,i+1) ) ) {
				b1+=b.substring(i,i+1);
			}
		}
		
		// a1="abc", b1="cab"

	char[] ch1=a1.toCharArray();
	char[] ch2=b1.toCharArray();
	System.out.println(Arrays.toString(ch1));
	}

}
