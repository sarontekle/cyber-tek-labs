package day52_Interface;
/*
 Interface: is a blueprint of a class.
 - it can do anything that a class can do but not everything.
 ==>we use the 'implements' keyword to do the same methods as extending
  a class to another class.
  ==> a class can only extend one class
  ==> a class can implement multiple interfaces
  ==>sub class in class is called subtype in interface, and super 
  class is supertype
  What ca we have in Interface:
  => abstract methods
  => static methods belong to interfaces and shared by anything in the interface
  => default methods
  => public static final is given by default when we declare a variable in interface. 
  What we can NOT have in interface:
  => constructors, because no class no constructor
  => no object instances whatsoever( no instance variables, blocks, or methods).
  => no static block because variables in interface are static final, so no need for blocks.
  
 */

public interface InterfaceIntro {
	
	//public InterfaceIntro() { }  no constructors in interface
	// public void methodB() { }  no instance method in interface
	public void methodD(); 
	
	public abstract void methodA();
	
	public static void mm() {
		
	}

}
 interface Data{
	 
 }

class Test implements InterfaceIntro, Data{

	@Override
	public void methodA() {
		
		
	}

	@Override
	public void methodD() {
		
		
	}
	
	public static void main(String[] args) {
		InterfaceIntro.mm();
	}
	
}
