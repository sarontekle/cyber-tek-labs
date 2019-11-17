package day25_ArraysContinued;
public class Warmup {
public static void main(String[] args) {
	
	/*
	 Write a program that can print out the unique values from an int array.
	 example:
	 if arr-->{1,1,2,3,3}
	 output: 2
	 */
	
	
	
	int[] arr= {1,1,2,2,2,2,3,4,};
	for(int j=0; j<arr.length;j++) { 
		
	int count=0; //to find out how many times a value appears in the array
	for(int i=0; i<arr.length;i++) { 
	if(arr[i]==arr[j]) {//compares each index in the array with the given value
		count++; // every time a value occurred in the array, it will increase the number by 1.
	}
	     
	}
	if(count==1) { // if there is only 1 occurrence, then it will print out the number with 1 occurrence.
		System.out.println(arr[j]);
		}
	}
	
}
}
