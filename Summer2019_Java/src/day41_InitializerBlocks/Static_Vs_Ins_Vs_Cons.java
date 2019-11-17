package day41_InitializerBlocks;

public class Static_Vs_Ins_Vs_Cons {
	
	static {
		System.out.println("Static block"); //static block execution does not depend on object creation
		                                    // only gets executed once and as soon as class is loaded.
	}
	{
		System.out.println("Instance block"); //instance block execution depends on creation of object
		                                     //instance block runs after object is created followed by constructor.
	}
	
	public Static_Vs_Ins_Vs_Cons() {
		System.out.println("Constructor"); //constructor execution depends on the creation of object in main method.
	}
	
	public static void main(String[] args) {
		Static_Vs_Ins_Vs_Cons obj= new Static_Vs_Ins_Vs_Cons();
		
	}
	
	

}
