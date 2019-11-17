package day45_Inheritance;

public class MultiClass {
/*
 Access modifiers: public, private, default, and protected
    public am=>visible everywhere
    private am=> only visible within the class, can only be accessed through getters and setters in other classes of the package
    default am=> only visible to classes in the package, not outside the package. if no other access modifier is given, then default is assigned.
    
    examples==> package A
                 public class a{
                    1. private int num=100;
                    2. public int num=100;
                    3. default int num=100;
                 }
                 package B
                 public class b{
                 1. num is not visible unless getter/setter is called
                 2. num is visible anywhere
                 3. if no other access modifier is given, this is the format, only visible within the package
                 }
 
 */
	
	
	/*
	 MultiClasses==> as soon as we create a class, public access modifier is given by compiler
	 ==> there can only be one public class in the java file that matched the file name
	 ==>other classes have default access modifier, and names of classes need to be unique.
	 ==> java compiler only runs only one class at a time.
	 ==> we can create main method in all the classes that are created.
	 */
	
	public static void main(String[] args) {
		System.out.println("Main public class");
	}
}

class A{
	public static void main(String[] args) {
		System.out.println("default class A");
	}
}
class B{
	public static void main(String[] args) {
		System.out.println("Default class B");
	}
}
