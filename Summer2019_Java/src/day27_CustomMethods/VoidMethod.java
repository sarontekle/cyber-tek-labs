package day27_CustomMethods;

public class VoidMethod{

	
	/*
	 Methods: grouping of series of statements together to perform specific tasks.
	 - methods can make our codes reusable.
	 
	 Method declaration:
	
	access-modifier   specifier  return-type    name(){}
	      public       static       void         main(String[] args){
	      }
	access-modifier:makes this method visible. public, protected, default, private.
	specifiers: static, abstract, final
	return-types: void, and any other data types(int, double...) 
	 */
	
	public static void main(String[] args) {
		myFirstMethod();
		even1To100();
//		calling of methods by their names within the main method lets us execute the codes under these methods
		
	}
	public static void myFirstMethod() {
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
	}
	public static void even1To100() {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
			System.out.print(i+" ");
			}
		}
		
	}
}
