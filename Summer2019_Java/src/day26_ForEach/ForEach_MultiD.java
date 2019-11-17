package day26_ForEach;
import java.util.Arrays;
public class ForEach_MultiD {
public static void main(String[] args) {
	
//    n dimensional arrays contain multiple (n-1) dimensional arrays.
	
	int[] arr1= {1,2,3,4,5};
	for(int each: arr1) {
		System.out.print(each+" ");
	}
	System.out.println();
	
	int[][] arr2D= { {1,2,3},{4,5,6,7} };
	for(int i=0; i<arr2D.length;i++) { //counts the 1D array
		for(int j=0; j<arr2D[i].length;j++) {
			System.out.print(arr2D[i][j]+" ");
		}
		
	}
	System.out.println();
	
	for(int[] each1: arr2D) {
		for(int each2: each1) {
			System.out.print(each2+" ");
		}
	}
	System.out.println();
	
	int[][][] num3D= { { {7,8},{9,10}},{{33,5},{78,8,9} } };
	
	for(int[][] each3D: num3D) { //each3D: each 2D array contained within the 3D array.
		for(int[] each2D: each3D) {//each2D:each 1D array contained within the 2D array.
			for(int each1D: each2D) { //each1D: each value contained within the 1D array.
				System.out.print(each1D+" ");
			}
		}
	}
	System.out.println();
	
	
}
}
