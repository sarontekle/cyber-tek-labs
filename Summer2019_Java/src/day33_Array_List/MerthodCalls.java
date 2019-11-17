package day33_Array_List;

public class MerthodCalls {
/*
    Any custom methods that are created, can be called in each other.
    - calling a custom method in an other custom method, lets the method execute in a nested fashion.
    * A method can not call itself, meaning a method called in another method can not be called again in itself.
 */
	public static void main(String[] args) {
		method3();
		
		int max2=max(10,50);
		System.out.println(max2); //50
		
		int max3=max(100,200,506);
		System.out.println(max3);
		
		maximum(400,5000,888988);
		
	}
	
	public static void method1() {
		System.out.println("A");
	}
	public static void method2() {
		method1();
		System.out.println("B");
	}
	public static void method3() {
		method2();
		System.out.println("C");
	}
	public static int max(int a, int b) {
		return(a>b)?a:b;
	}
	
	public static int max(int a, int b, int c) {
		// int LargestNum=max(a,b);
		return(max(a,b)>c)?max(a,b):c;
	}
	
	public static void maximum(int a, int b, int c) {
		System.out.println(max(a,b,c));
	}
	
}
