package day44_AccessModifiers;

public class TestData {
/*
 Import:
     import PackageName.className;
     //imports a single class from the package 
      example: import java.util.ArrayList;
      
      import PackageName.*;
      //imports all classes from the package.
       
    static import: used to import the class members, we can access them directly without using the class name.
    
      //import static PackageName.ClassName.StaticName;
       * imports a single static member from the class.
      //import static PakcageName.ClassName.*;
       * imports all the static members from the class.
 */
	/*
	 Access Modifiers: public, private, default
	 public: open for all the world, visible everywhere
	 ex. public int num=100;
	 private: only visible within the class.
	 ex. private int num=100;
	 default: if no public or no private access modifier is given, then compiler automatically assigns default to the data.
	 => it is only visible between the classes within the package.
	 protected: only visible to the classes in the same package, but its inheritable outside the package.
	 */
   public static String ID="007";
	public static String Name="Juline";
	public static String SchoolName="Cybertek";
    
	private static String  Password="cybertek";
	
	static int age; //default access modifier.
	protected double num=123;
	
	
	
	
	
}
