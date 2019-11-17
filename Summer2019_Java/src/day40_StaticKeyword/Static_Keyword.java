package day40_StaticKeyword;

public class Static_Keyword {
	/*
	 static keyword: means we can access the members through the class name
	 - static members belong to the class, also called class members.
	 
  What can be static in java:
      1. static variables
      2. static methods
      3. static initializer block
      4. static inner class( nested class)
      
   instance variables: created in the class outside any method, and belongs to the object. each object will have its own copy
   
   local variable: created within a method or block and only works within the method.
   
   static variables: creates in the class ad outside any method with the keyword static.
   - when a variable is static, its shared by class and all objects.
   - unlike the instance variables, static variables only have 1 copy, which means initializing it once and only once.
	 */
	
	int a;
	static int b;
	
	public static void main(String[] args) {
		
		Static_Keyword obj1= new Static_Keyword();
		obj1.a= 100;
		
		Static_Keyword obj2= new Static_Keyword();
		obj2.a=200;
		System.out.println(obj1.a); // 100 because each object has its own copy of instance variable
		
		System.out.println(Static_Keyword.b);
		System.out.println(obj1.b);// because it is not initialized, it will print out the default value which is 0.
		
		Static_Keyword obj3= new Static_Keyword();
		obj3.a=200; //will print 200==> instance variable.
		obj3.b=400; //will print 400==>static variable==>now the static variable will always be 400 because it only had 1 copy.
		

	}
	public static void printHello() {
		System.out.println("Hello Cybertek");
	}
	
	

}
