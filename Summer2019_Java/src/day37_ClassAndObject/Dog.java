package day37_ClassAndObject;

public class Dog {
	/*
	 Dog
	   Attributes/data:
	     breed, size, age, color, name, gender...
	   actions:
	     eat, sleep, bark, play...
	 */
	
	String Breed;
	String Size;
	byte Age;
	String Color;
	String Name;
	char Gender;
	
	public void getInfo() {
		System.out.println(Breed+ " "+ Size+" "+Age+" years old");
	}

	

}
