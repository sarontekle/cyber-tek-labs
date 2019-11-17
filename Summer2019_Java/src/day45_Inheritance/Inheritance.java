package day45_Inheritance;

/*
Inheritance: used for building relationships between classes, it build super and sub relationships between classes.
=> we use the "extends" keyword to build this super and sub relations

       public class A extends B
                   sub        super
  Sub class: also called child class, inherits the features of the super class(parent class)
  Super class:    also called the parent class, super class can not inherit any features from sub class.
  
  ** features that have public or protected access modifiers can be inherited anywhere even outside of the package.**
  ** features that have default access modifiers can only be inherited to classes within the same package.**
  ** features that have private access modifiers are not inheritable.**
*/

class TestBase{
	static String chromeDriver;
	public static void TakeScreenShot() {
		System.out.println("Took screenshot");
		
	}
	private static void closeBrowser() {
		System.out.println("Broswer closed");
	}
}

public class Inheritance extends TestBase{
	          // sub              //super
	//sub class is going to inherit all visible or protected features from the super class
	public static void main(String[] args) {
		TakeScreenShot();
		System.out.println(chromeDriver);
	}
	

}
