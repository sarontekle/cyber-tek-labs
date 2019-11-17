package day48_Method_OverRiding;

class Student{
	public void printName() {
		System.out.println("Hakan");
	}
}

public class MethodOverriding extends Student{
	/*
	Method overloading: same name, different parameter, return type, and access modifiers do not matter because any method can be overloaded.
	Method overriding: same name, same parameter.
	=> needed to implement specific functionality to the method, 
	==> can not override a method in the same class
	==> inheritance needs to occur first before overriding
	==> overriding can only occur in the sub class.
	
	
	Example: WebDriver driver= new ChromeDriver(); //ChromedDiver is a child class of the WebDriver which inherits the features of the web driver
	         driver.get(URL): goes to URL in Chrome browser//features such as get() method are inherited from the web driver on to any browser driver.
	         WebDriver driver= new FirefoxDriver();
	         driver.get(URL): this is an example of overriding since the same name and the same class is used and different implementation is used.
	 */
	
	public void print(String str) {
		
	}
	public void print(double a) {
		
	}
	//public void print(String str) {} overriding can not happen in the same class.
	public void printName() {
		System.out.println("Shukran");
	}
	public static void main(String[] args) {
		
		MethodOverriding obj= new MethodOverriding();
		obj.printName();//in order to print another name "Shukran" using the sub class, we need to override the method in sub class 
		
		Student obj2= new Student();
		obj2.printName();//Hakan
		
		
		
	}

}
