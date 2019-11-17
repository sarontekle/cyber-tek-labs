package day28_JavaRecap;

import java.util.Arrays;

public class Warmup_01 {
	/*
	 1. Write a method that can convert km to miles
	       1 km=0.612 miles.
	 2. Write a method that can convert gallons to liters.
	          1 gallon=3.75 L
	 
	 */
	
	public static void main(String[] args) {
		kmToMiles(10);
		GallonsToLiters(50);
		int[] arr= {0,-1,1000,2000,5000};
		SortDes(arr);
	}
	
	public static void kmToMiles(double KM) {
       double Miles=0.612*KM;
       System.out.println(KM+" km equals to "+Miles+" miles");
	}
	public static void GallonsToLiters(double G) {
		double Liters=G*3.75;
		System.out.println(G+" gallons is equal to "+Liters+" liters");
	}
	public static void SortDes(int[] array) {
		Arrays.sort(array);
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}

}
