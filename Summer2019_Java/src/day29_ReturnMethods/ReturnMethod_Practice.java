package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethod_Practice {
	
	public static void main(String[] args) {
		sum(10,20);
		addition(10,20);  // this is just an int value, it needs to be passed in a print statement or assign it to a variable.
		
		System.out.println(addition(10,20));
		
//		int max=sum(10,20);   //the mothod does not return a value which is why it will give error if assigned to a variable.
		
		double max=greaterNum(90,34,56);
		System.out.println(max);
		
		int[] array= {1,2,3,4,5,6,78,98};
		array=Sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
//	write a method that accepts 3 numbers and return the largest number.
	
	public static double greaterNum(int a, int b, int c) {
		int[] arr= {a,b,c};
		Arrays.sort(arr);
		return arr[2];
		
	}
	
//	write a method that accepts an int array and sorts it the returns an array.
	
	public static int[] Sort(int[] arr) {
		                 //[5,3,2,22,3]
		Arrays.sort(arr); //[2,3,3,5,22]
		int[] numbers=new int[arr.length];
		int z=0;
		for(int i=arr.length-1;i>=0;i--) {
			numbers[z]=arr[i];
			z++;
			
		}
		return numbers;
	}
	

}
