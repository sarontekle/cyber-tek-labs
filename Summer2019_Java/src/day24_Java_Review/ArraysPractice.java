package day24_Java_Review;
import java.util.Scanner;
public class ArraysPractice {
	public static void main(String[] args) {
		/*
		 ask users to enter five numbers, then find the sum of those five numbers.
		 Must use an Array.
		 */
		int[] numbers=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<numbers.length;i++) {
			System.out.println("Enter a number");
			numbers[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];			
	}
		System.out.print("Sum is:"+sum);
	
	String[] names= {"Seyfo","Asiya","Myra","Kateryna","Daulet","vladmir slovakrokogo"};
	String LongestName="";
	int max=0;
	for(int i=0;i<names.length;i++) {
		if(names[i].length()>max){
			max=names[i].length();
			LongestName=names[i];
		}
	}
	System.out.println(max);
	System.out.println(LongestName);
	}
	}	


