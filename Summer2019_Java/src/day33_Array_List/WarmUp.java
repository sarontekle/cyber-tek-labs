package day33_Array_List;

import java.util.Arrays;

public class WarmUp {
	/*
	 Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is prefered here

	 */
	

	public static void main(String[] args) {
		int[] arr= {1,4,5,8,3,6,9,0};
		arr=SortDe(arr);
		System.out.println(Arrays.toString(arr));
		
		double[] arr2= {10.5, 60.6, 89.4, 6.5};
		arr2=SortDe(arr2);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3= {'A','b','D','f','I'};
		arr3=SortDe(arr3);
		System.out.println(Arrays.toString(arr3));
		
		String[] arr4= {"Madina","Maria","Victor","Andrew","Yousef"};
		arr4=SortDe(arr4);
		System.out.println(Arrays.toString(arr4));
	}
	public static int[] SortDe(int[] arr) {
		Arrays.sort(arr);
		int[] arr2=new int[arr.length];
		int z=0;
		for(int i=arr.length-1; i>=0;i--) {
			arr2[z]=arr[i];
			z++;
		}
		return arr2;
	}
	
	public static double[] SortDe(double[] arr) {
		Arrays.sort(arr);
		double[] arr2=new double[arr.length];
		int z=0;
		for(int i=arr.length-1; i>=0;i--) {
			arr2[z]=arr[i];
			z++;
		}
		return arr2;
	}
	
	public static char[] SortDe(char[] arr) {
		Arrays.sort(arr);
		char[] arr2=new char[arr.length];
		int z=0;
		for(int i=arr.length-1; i>=0;i--) {
			arr2[z]=arr[i];
			z++;
		}
		return arr2;
		
	}
	public static String[] SortDe(String[] arr) {
		Arrays.sort(arr);
		String[] arr2=new String[arr.length];
		int z=0;
		for(int i=arr.length-1; i>=0;i--) {
			arr2[z]=arr[i];
			z++;
		}
		return arr2;
	}

}
