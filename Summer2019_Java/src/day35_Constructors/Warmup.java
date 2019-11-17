package day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup {
	/*
	 Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
	 */
	public static void main(String[] args) {
		//Task01:
		int[] arr= {1,2,3,4,5};
		Result1(arr);
		ArrayList<Integer> list= Result1(arr);
		System.out.println(list);
		
		//Task02:
	  ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	  int max=MaxNum(list2);
	  System.out.println(max);
	  
	  //Task03:
	  int secondMax=SecMax(list2);
	  System.out.println(secondMax);
	  
		
	}
	
	//Task01:
	public static ArrayList<Integer> Result1(int[] arr){
		ArrayList<Integer> list= new ArrayList<> ();
		for(Integer each: arr) {
			list.add(each);
		}
		return list;
	}
	
	//Task02:
	public static int MaxNum(ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int each: list) { //unboxing
			if(each > max) {
				max=each;
			}
		}
		return max;
	}

	//Task03:
	public static int SecMax(ArrayList<Integer> list) {
		Integer max=MaxNum(list);
		list.remove(max);
		int secondMax=MaxNum(list);
		return secondMax;
	}
	
	//Task04:
	public static int Min(ArrayList<Integer> list) {
		int min= Integer.MAX_VALUE;
		for(Integer each: list) {
			if(each < min) {
				min=each;
			}
		}
		return min;
	}
	
	//Task05:
	public static int SecMin(ArrayList<Integer> list) {
		Integer min=Min(list);
		list.remove(min);
		int secondMin=Min(list);
		return 0;
	}
}
