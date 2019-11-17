package day37_ClassAndObject;

public class DogObjects {

	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		System.out.println(dog1.Name); //null
		
		dog1.Breed = "Husky";
		dog1.Size = "small";
		dog1.Age = 25;
		dog1.Color = "gray and white";
		dog1.Name = "Holly";
		dog1.Gender = 'F';
		
		dog1.getInfo();
		
		
		
		
		
	}
}
