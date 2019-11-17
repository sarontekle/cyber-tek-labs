package day27_CustomMethods;

public class VoidMethod_WithArgument {
/*
 Methods with argument:
 access-modifier   specifier  return-type name(parameter){
 }
 parameter: any data type
 */
	public static void main(String[] args) {
		oddOrEven(85);
	}
	
	public static void oddOrEven(int a) {
		if(a%2==0) {
			System.out.println(a+" is Even number");
		}else {
			System.out.println(a+" is Odd number");
		}
	}
}
