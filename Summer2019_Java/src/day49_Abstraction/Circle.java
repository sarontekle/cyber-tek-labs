package day49_Abstraction;

public class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	protected void Area() {
		double Area=3.14*radius*radius;
		System.out.println("Area is "+Area);
	}
	
	protected void Perimeter() {
		double Perimeter=3.14*2*radius;
		System.out.println("Perimeter is "+Perimeter);
	}

}
