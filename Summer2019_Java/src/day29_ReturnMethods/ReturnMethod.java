package day29_ReturnMethods;

public class ReturnMethod {
	
	/*
	 method declaration:
	 access-modifier  specifier  return-type  name(parameter){}
	     public          static     void
	
	if the return type is void: it does not return any value.
	if the return type is not void, it must return a value. this means using a return statement to exit the method
	return-type for today: primitive or non primitive data types. 
	Basic rules of this return type:
	- does not contain void,
	- Must return a value,
	-the returning value must match the return type (data type),
	- After return statement execution, it exits the method and the code after is unreachable.  
	 */
	
	public static void main(String[] args) {
		name();  //this is a String value
		System.out.println(name()); //return methods are either printed or assigned to the same data type
		
		String str=name();
		System.out.println(str);
		
		boolean result=name2();
		System.out.println(result);
	}
	
	
//	if the return type is void:
	public static void method1() {
		System.out.println("Hello");
	}
//	if the return type is not void:
	public static String name() {
		return "Batch12";
	}
	public static boolean name2() {
		return 9<8;
	}

}
