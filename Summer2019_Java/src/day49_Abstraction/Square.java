package day49_Abstraction;

public class Square extends Shape{
	double side;
	
	public Square(double side) {
		this.side=side;
	}
	protected void Area() {
		double Area=side*side;
		System.out.println("Area is "+Area);
	}
	protected void Perimeter() {
		double Perimeter=4*side;
		System.out.println("Perimeter is "+Perimeter);
	}

}
