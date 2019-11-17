package day34_Constructors;

public class ConstructorMethods {
/*
   Constructor is a very special method.
   - every single class must have a constructor or else the compiler will give a default constructor
   -only a constructor can call another constructor.
   - there is no constructor that passes a String as a parameter
   Declaration:
    default constructor:
     access-modifier className(){
     }
    constructors with arguments:
     access-modifier className(parameters)
     
  ==>creating a constructor object:
      ConstructorName objectName= new ConstructorName(argument); *constructor name has to be the same as the class name.
      eg=> ConstructorMethods obj = new ConstructorMethod(); ==> this is a default Constructor.
     
   ==>Calling of constructors:
   this() is used to call a constructor in another constructor, if the constructor has an argument then the argument is passed in the ().
   calling a constructor should be the priority before writing any other code.(coming first)
   ONLY one constructor can be called in one constructor.
 */
	public ConstructorMethods() {
		System.out.println("Hello World");
		System.out.println("I am a default constructor");
	}
	
	public ConstructorMethods(int num) {
		 System.out.println("Hello world");
	     System.out.println("I am a constructor with an argument of int: "+num);
	}
	
	public static void main(String[] args) {
		ConstructorMethods obj= new ConstructorMethods();
		
		ConstructorMethods obj2= new ConstructorMethods(8);
	}
}
