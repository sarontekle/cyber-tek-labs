package day25_ArraysContinued;

import java.util.Arrays;

public class Multi_dimensionalArray {
/*
  n dimensional array contains (n-1) dimensional array.
 */
	public static void main(String[] args) {
		
		int[] arr1D= {1,2,3};
		
// 2 dimensional array: array that contains 1 dimensional arrays.
		int[][] arr2D= { {1,2,3},{4,5,6} };
		
		String[] arr= {"A","B"};
		String[][] str2D= { {"A","B"},{"C","D"} };
//		[ represents the index number of 1 dimensional array] [represents the index number of the inner 1 dimentional array]
		//print A:
		System.out.println(str2D[0][0]);
		//print D:
		System.out.println(str2D[1][1]);
		// to print [C,D]:
		System.out.println(str2D[1]); //this will give hash code
		System.out.println(Arrays.toString(str2D[1]));
//		deeptoString(vairableName): converts multi-dimensional arrays to String.
		
	}
}
