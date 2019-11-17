package day46_SuperKeyword;

class A{
	
	 String name = "Madina";
	    
	    public void methodA() {
	        
	    }
	    
	    
	    public A ( int a ) {
	        
	    }

}

public class SuperKeyword extends A{
	
	public SuperKeyword(double b) {
		super(10);// super class' constructor MUST be called in the sub class
		
		
		

		
	}
	 public void method() {
	        super.name = "Mahir";
	        this.name = "Ihsan";
	        super.methodA();// to call the instance method that is in the super class
	        this.methodA();// to call the method that is in the sub class
	        
	        System.out.println(super.name);
	        System.out.println(this.name);
	    }
	 public static void main(String[] args) {
		SuperKeyword obj=new SuperKeyword(4.5);
		obj.method();
		obj.methodA();
		
	}

}
