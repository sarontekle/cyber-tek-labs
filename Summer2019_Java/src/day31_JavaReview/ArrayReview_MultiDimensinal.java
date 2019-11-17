package day31_JavaReview;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview_MultiDimensinal {
  /*
   
   */
	public static void main(String[] args) {
		// ask user to enter 3 numbers and find the maximum and minimum numbers
		
		Scanner scan=new Scanner(System.in);
		int[] arr= new int[3];
		
		System.out.println("Enter a number: ");
		  arr[0]=scan.nextInt();
		System.out.println("Enter a number: ");
		  arr[1]=scan.nextInt();
		System.out.println("Enter a number: ");
		  arr[2]=scan.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
		  Arrays.sort(arr);
		  System.out.println("Minimum value: "+arr[0]);
		  System.out.println("Maximum value: "+arr[arr.length-1]);
		  
		 
		
		
		
	}
}
