package day47_JavaReview;

class A {
	public String name1="Haben";
	
}
class B extends A {
	public String name2="Kisanet";
	protected String name3="Sami";
	
}

public class Inheritance extends B{
	/*
	public String name1;
	public String name2;
	public String name3;
	 */
	public String name4="Maekele";
	public String name5="Ghirmay";
	public static void main(String[] args) {
		
	
	Inheritance obj= new Inheritance();
	System.out.println(obj.name1);
	System.out.println(obj.name2);
	System.out.println(obj.name3);
	System.out.println(obj.name4);
	System.out.println(obj.name5);
	System.out.println();
	
	B obj2= new B();
	System.out.println(obj.name1);
	System.out.println(obj.name2);
	System.out.println(obj.name3);
	System.out.println(obj.name4);
	System.out.println(obj.name5);
	
	}
}
