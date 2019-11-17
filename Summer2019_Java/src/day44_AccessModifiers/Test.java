package day44_AccessModifiers;
//import static day44_AccessModifiers.TestData.Name;
//import static day44_AccessModifiers.TestData.ID;
import static day44_AccessModifiers.TestData.*;
public class Test {
	
	public static void main(String[] args) {
		System.out.println(Name);
		System.out.println(ID);
		System.out.println(age);
		TestData obj1= new TestData();
		System.out.println(obj1.num);
		
		defaultAccessModifier obj= new defaultAccessModifier();
		System.out.println(obj.namePublic);
//		System.out.println(obj.namePrivate); // private can not be accessed without getter and setter.
	}
	
	
	
	

}
