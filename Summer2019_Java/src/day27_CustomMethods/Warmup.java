package day27_CustomMethods;

import java.util.Arrays;

public class Warmup {
public static void main(String[] args) {
	
	int[] numbers= new int[100];
	for(int i=0;i<numbers.length;i++) {
		numbers[i]=i;
		} System.out.println(Arrays.toString(numbers));
		
		System.out.println();
		
		for(int each: numbers) {
			System.out.print(each+" ");
			
			if(each%2 !=0) {
				continue;
			}
		}
	
	
	
	
	
}
}
