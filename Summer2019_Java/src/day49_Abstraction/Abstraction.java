package day49_Abstraction;

public class Abstraction {
	/*
	 Abstraction:concentrating on the essential or important things,
	 => not worrying about the details of implementation
	 => hiding the implementation details.
	 
	  car: 
	    start(){
	        put the keys
	        turn the engine on
	        start driving
	    }
	    
	Abstract method: a method without body/implementation
	     public abstract start(); ==>generic
	     =>it's a method that is meant to be overridden.( can not be final, private)
	     =>only instance methods can be overridden and can be abstract.
	     => abstract method can only be declared in abstract class and interface 
	     
	     ex: Pontanic car:
	     start(){
	         call the mechanic
	         put in the key
	         start engine
	         jump start
	         drive
	         }
	     Tesla car:
	        start(){
	          say"start"
	          drive
	          } 
  Abstract Class:is something that is not concrete
                => we can not create objects from this class.
                =>it is a class that is extendable(it is meant to be extended)
                =>it cannot be final   
	 */
	
	//protected abstract void startTheCar();
		
	

}

//abstract class Toyota extends Abstraction{
//	
//	@Override
//	//public void startTheCar() {
//		System.out.println("Brake");
//		System.out.println("push the start button");
//		System.out.println("release the brake");
//		
//	}
//	public static void main(String[] args) {
//		
//	}
//}

//class Tesla extends Abstraction{
//	
//	@Override
//	//public void startTheCar() {
//		System.out.println("say start");
//		System.out.println("drive");
//	}
//}







