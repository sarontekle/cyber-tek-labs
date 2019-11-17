package day23_Arrays;
import java.util.Scanner;
public class arrays {
	public static void main(String[] args) {
		
	
/*
 Arrays:  is an object container that holds fixed number of values of the single type.
         datatype[] variableName= {value1, value2};
         datatype variableName[]={value1, value2}; 
         each value(element)in an array has their own index numbers:
         int[] variableName={10,20,30,40,50}
             //index num:    0  1  2   3  4
       to retrieve the data of array:
       VariableName[indexNumber of data]:
       example: variableName[0]==>10
    
 */
		int[] arr= {1,2};
		
		String[] names= {"Sumeyya","Madina","Juline"};
		//                  0        1        2
		System.out.println(names[0]);
		String str1=names[0];
		String str2=names[2];
		System.out.println(str1+" "+str2);
		
		double[] myArray= {1,2,3,4,5,8,0,2};
		for(int i=0; i<8; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		
		// length of Array:
		   String str="ABC";
		   int A=str.length();
		   System.out.println(A);//3
		int[] Numbers= {12,24,48,96,2,3,4,5,6,7,8,9,10,11};
		int B=Numbers.length;
		System.out.println(B);  //14
		int HighestIndexnumber=Numbers.length-1;
		System.out.println(HighestIndexnumber); //13
		for(int i=0; i<Numbers.length; i++) {
			int s1=Numbers[i];
			System.out.print(s1+" ");
		}
		System.out.println();
		
//		 Array's size is fixed, therefore, assigning any new value to the array outside of the curly braces is going to be a compiler error.
		String[] newArray= {"Saron", "Rahwa","Meri"};
		newArray[0]="Tim";
		newArray[3]="Emanuel";
		System.out.println(newArray[3]);// will give an error message because of the fixed size of the array initialized at first.
		
		// initializing the size only without giving the value:
		int[] array=new int[4];  //this array can contain 4 values(length 4and indices 3)
		System.out.println(array.length);
		System.out.println(array[0]); //default value of int is 0 so if we did not initializing the value of arrays, it will give default values.
		
		Scanner scan=new Scanner(System.in);
		int[] Input=new int[10];
		for (int i=0; i<Input.length;i++) {
		
		System.out.println("Enter a number: ");
		Input[i]=scan.nextInt();
		}
		for(int  i=0;i<Input.length;i++) {
			System.out.print(Input[i]+" ");
		}
		}
}