package day40_StaticKeyword;

public class StaticVariables {
	
	/*
	 Static variables- declared within the class, outside any method.
	 - can only be 1 copy, and is shared with all methods and all objects.
	   declaration:  static datatype variablename;
	 => static method is a method that only accepts class members.
	 */
     static String name;
     static double staticNum;
     int num1;
     
     public static void method1() {
    	 System.out.println("Open the browser");
     }
     
     public static void main(String[] args) {
    	 
    	 StaticVariables.method1();
		
    	 StaticVariables obj1= new StaticVariables();
    	 obj1.name = "Omer";
    	 
    	 StaticVariables obj2= new StaticVariables();
    	 System.out.println(obj2.name); //Omer
    	 obj2.name = "Khurshed";
    	 System.out.println(obj1.name); //Kurshed because it is being reinitialized 
//    	 =========================================================
    	 System.out.println(StaticVariables.staticNum); //0.0==>default
    	 
    	 StaticVariables object1= new StaticVariables();
    	 object1.staticNum= 4.5;
    	 System.out.println(object1.staticNum); //4.5
    	 
    	 StaticVariables object2= new StaticVariables();
    	 System.out.println(object2.staticNum);//4.5
    	 
    	 Static_Keyword.printHello();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
