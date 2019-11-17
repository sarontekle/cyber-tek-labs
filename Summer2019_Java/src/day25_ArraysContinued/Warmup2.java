package day25_ArraysContinued;

public class Warmup2 {
/*
 Write a program that can print out the unique values in the String array.
 */
	public static void main(String[] args) {
		
		String[] arr= {"A","A","B","C","C"};
		for(int j=0; j<arr.length;j++) {
		int count=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i].equals(arr[j])) {
					count++;
		}
			}
		if(count==1) {
		System.out.println(arr[j]);
		}
		}
	}
}
