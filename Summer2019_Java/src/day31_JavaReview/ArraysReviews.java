package day31_JavaReview;

import java.util.Arrays;

public class ArraysReviews {
	/*
	 Arrays:store multiple data to a variable.
	 */
	public static void main(String[] args) {
		int num=10;
		//declaration of an array:
         
		int[] arr= {10};
		//initializing the size of an array.
		int[] arr2=new int[2];  //[0,0] unless the  values have been assigned one by one.
		
//	print each value of the given array in descending order:
		int[] nums= {200,300,20,7890,40,-9,-100};
		 
		  Arrays.sort(nums);
		  System.out.println(Arrays.toString(nums));
		  String result="";
		  for(int i=nums.length-1;i>=0;i--) {
              result+=nums[i]+", ";
		  }
		  result=result.trim().substring(0,result.lastIndexOf(","));
		  System.out.println("["+result+"]");
		
		
	}

}
