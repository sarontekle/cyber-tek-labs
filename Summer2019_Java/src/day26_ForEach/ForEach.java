package day26_ForEach;

import java.util.Arrays;

public class ForEach {
public static void main(String[] args) {
	
	/*
	 For Each:is another way to transverse data or values one by one in an array.
	  Syntax:
	     for(DataType each: ArrayName){
	     }
	 */
	int[] arr= {1,2,3,4,5};
	for(int i=0; i<arr.length;i++){
		arr[i]=i+1;
		System.out.println(arr[i]);
	}
	
	System.out.println("========================");
	for(int each: arr) {
		System.out.println(each);
	}
	
	String[] str1= {"A","b","C"};
	for(String values: str1) {
		System.out.println(values);
	}
	System.out.println();
	
	char[] ch= {'a','b','x','y','m','z'};
	Arrays.parallelSort(ch);
	
	for(char charzz: ch) {
		System.out.println(charzz);
	}
	System.out.println();
	
	int[] varname= {1,2,3,4,5,6,7,8,9,10};
	for(int nums: varname) {
		if(nums%2==0)
			System.out.print(nums+" ");
	
	}
	System.out.println();
	
	for(int nums: varname) {
		if(nums%2 !=0)
			System.out.print(nums+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
