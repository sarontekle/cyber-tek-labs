package day40_StaticKeyword;

public class staticPractice {
	/*
	 Static methods: a method that we can call through the class name.
	  - static method only accepts class members(Static)
	  - non static methods can only be called through objects in static methods.
	 */
	
	static long num1;
	long num2;
	
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(staticPractice.num1);
		
		staticPractice.method1();
		// staticPractice.method2(); gives compiler error because it is an instance method, and there is no object created to call the method.
		
		staticPractice obj= new staticPractice();
		   obj.method1();
		   obj.method2();
	}
	public static void method1() {
		System.out.println("A");
	}
	public void method2() {
		System.out.println("B");
	}

}
