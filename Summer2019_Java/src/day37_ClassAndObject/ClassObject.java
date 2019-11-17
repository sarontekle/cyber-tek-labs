package day37_ClassAndObject;

public class ClassObject {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.Brand = "BMW";
		car1.Color = "White";
		car1.Mileage = 100000;
		car1.Model = "X6";
		car1.price = 15678.5;
		car1.Year = 2000;
		System.out.println(car1.Brand);
		System.out.println(car1.Color);
		System.out.println(car1.Mileage);
		System.out.println(car1.Model);
		System.out.println(car1.price);
		System.out.println(car1.Year);
		System.out.println("=============================");
		
		Car car2 = new Car();
		
		car2.Brand = "Toyota";
		car2.Model = "Corolla";
		car2.Color = "Black";
		car2.Mileage = 15000;
		car2.price = 5400.6;
		car2.Year= 2015;
		
		String words="one two three two two";
		words=words.replaceAll("two", "");
		words=words.replaceAll("\\s"," ");
		System.out.println(words);
		
	}

}
