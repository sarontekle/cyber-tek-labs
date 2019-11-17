package day48_Method_OverRiding;

class Holly{
	public void printName() {
		System.out.println("Erhan");
	}
}

public class FinalKeyWord extends Holly{
	/*
	 Final keyword: 
	    Variables==> that will not change regardless of any condition.
	           =>instance and static variables MUST be assigned immediately
	           =>local variables need to be assigned before use.
	    Methods==> the implementation of the method cannot changed.
	           => if method is final, it is not able to be overridden for this purpose.
	           =>main method can be final.
	 */
	@Override
	public void printName() {//if access modifier is final, then method can not be overridden
		System.out.println("Erhan");
	}
	final int AGE=35;
	public static void main(String[] args) {
		final String SSN="123456789";
		// SSN="456789123"; final variable will not be reassigned 
		System.out.println(SSN);
		
		final String DOB;
		
		FinalKeyWord obj= new FinalKeyWord();
	         System.out.println(obj.AGE);
	}
	
	public final static void add(int a, int b) {
		System.out.println( (a+b) );
	}
	public static double add(double x, double y) {
		return (x+y);
	}

}
