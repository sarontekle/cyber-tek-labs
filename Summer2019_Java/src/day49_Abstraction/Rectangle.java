package day49_Abstraction;

public class Rectangle extends Shape{
	double width;
	double length;
	
	public Rectangle(double length, double width) {
		this.length= length;
		this.width=width;
	}
	
	@Override
	protected void Area() {
		double Area= length*width;
		System.out.println("Area is "+Area);
	}
	
	protected void Perimeter() {
		double Perimeter=(width+length)*2;
		System.out.println("Perimeter is "+Perimeter);
	}

}
