package day41_InitializerBlocks;

public class instanceBlock {
	/*
	 Instance initializer block: used for initializing instance variables, which belongs to an object.
	 declaration:     {
	                   statement;
	               }
	    ==> block only gets executed when an object is created for that class.
	    ==>when the object is created, the instance block gets executed and then follows a constructor.
	    ==> if three objects are created, each object will execute instance then constructor and the rest of the objects follow in the same fashion. 
	 */
	
	{
		System.out.println("Instance Block");
	}
	
	public instanceBlock(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		instanceBlock obj= new instanceBlock();
		instanceBlock obj2= new instanceBlock();
		instanceBlock obj3= new instanceBlock();

	}
	
	
	

}
