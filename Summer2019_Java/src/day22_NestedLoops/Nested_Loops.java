package day22_NestedLoops;

public class Nested_Loops {
public static void main(String[] args) {
	/*
	 Nested loops: is a loop within the loop
	 it repeats a certain output inner loop times the outer loop.
	 */
	for(int z=0; z<5; z++) {
	for(int i=1; i<=5; i++) {
		System.out.print(i);
		break;
	}
	System.out.println();
	}
	/*
	 *****
	 *****
	 *****
	 
	 */
	for(int z=0; z<5; z++) {
	int i=1;
	while(i<=5) {
		System.out.print("*");
		i++;
		break;
	}
	System.out.println();
	}
	
	
	
	/*
	 * for(int j=1; j<=7;j++) {
		for(int i=1; i<=j; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	int A=1;
	while(A<=7) {
	int B=1;
	while(B<=A) {
		System.out.println("*");
		
	}
	System.out.println();
	A++;
	}*/
}
}
