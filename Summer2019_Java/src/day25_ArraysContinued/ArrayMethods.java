package day25_ArraysContinued;

import java.util.Arrays;

public class ArrayMethods {
public static void main(String[] args) {
	
	int num1=0;
	System.out.println(num1);
	
	int[] arr= {1,2,3};
	System.out.println(arr[0]);
/*
 	to print an entire array as a whole, we need to convert the array to String.
 	Arrays.toString(VariableName): used to convert single dimensional arrays to a String value.
 	
 	Arrays class: utility of all the arrays, arrays class is also included in java util class which is imported whenever in use.
 */
	String str=Arrays.toString(arr);
	System.out.println(str);
	
	String[] names= {"Elvira","Bibish","Tural","Daulet","Hakan"};
	System.out.println(names[0]); // only prints out the value at the index number.
	System.out.println(names);  // prints out hash code
	System.out.println(Arrays.toString(names));
	
	/*
	 Arrays.sort(VariableName):
	 sorts the values of the array in ascending order( smallest to largest)
	 the arrays sort method is not put in the print statements
	 
	 */
  int[] Numbers= {9,8,26,45,6,7};
  System.out.println(Arrays.toString(Numbers));
   Arrays.sort(Numbers);
	System.out.println(Arrays.toString(Numbers));
//	when using the sort method on a String array, it follows alphabetical order.
//	write a program that will reverse the ascending order of an array.
	System.out.println();
	String result="[";
	for(int i=Numbers.length-1; i>=0;i--) {
		result+=Numbers[i]+", ";
	}
	result=result.trim().substring(0,result.length()-2)+"]";
	System.out.print(result);
	System.out.println();
	
	int[] arr2= {99,10,30,45,67,89};
	Arrays.sort(arr2);
	int[] arr3=new int[arr2.length];
	int z=0;
	for(int i=arr2.length-1; i>=0;i--) {
		arr3[z]=arr2[i];
		z++;
	}
	System.out.println("Ascending order:"+ Arrays.toString(arr2));
	System.out.println("Descending order:"+Arrays.toString(arr3));


	
}
}
