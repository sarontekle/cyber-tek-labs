package day41_InitializerBlocks;

public class StaticBlock {
	/*
	 * static members: 1.static variables
	 *                 2. static methods
	 *                 3. static initializer block
	 *                 4. inner class( nested class)
	 Static variable: a variable that you can call anywhere using an object or using the class name.
	 => declared in the class, but outside any method.
	 Initializer blocks:
	 Static Initializer block=> used for initializing static variables.
		 static{
		 statement;
		 }
		 =>special block that gets executed once immediately after class is loaded(called), even before the main method and constructors.
		 =>static block execution does not depend on creation of an object
		 => we can have multiple static blocks, and whichever one comes first from top to bottom will get executed first.
	 */
	
	public StaticBlock() {
		System.out.println("This is constructor");
	}
	static {
		System.out.println("Static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		StaticBlock obj= new StaticBlock();
		System.out.println("Main method");
	}

}
