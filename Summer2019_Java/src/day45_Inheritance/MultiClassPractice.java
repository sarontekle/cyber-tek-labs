package day45_Inheritance;

class Data{
	public String name;
	private String age;
	String ID;
	
	public void Hello() {// instance methods, only called through an object
		Hola();
		System.out.println("Hello");
	}
	private void Hola() {
		System.out.println("Hola");
	}
	void Aloha() {
		Hola();
		System.out.println("Aloha");
	}
}

public class MultiClassPractice {
	public static void main(String[] args) {
		Data obj= new Data();
		System.out.println(obj.name); // public is visible everywhere
	//  System.out.println(obj.age); //private is not visible anywhere outside the class
		System.out.println(obj.ID); //default is visible in classes within the same package 
		
		obj.Aloha();// because it has default AM
		obj.Hello();// because it had public AM
//		obj.Hola(); // because it has private AM can only be called in methods within the class.
		
		
		
		
	}

}
