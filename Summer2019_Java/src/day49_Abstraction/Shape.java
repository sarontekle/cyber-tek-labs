package day49_Abstraction;
/*
WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    Perimeter of circle:    3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
    volume of cylinder: 3.14 * radius * radius * height .  

 */

public class Shape {
	
	protected void Area() {
		System.out.println("Area is 0");
	}
	protected void Perimeter() {
		System.out.println("Perimeter is 0");
	}
	protected void Capacity() {
		System.out.println("Capacity is 0");
	}
	
	public static void main(String[] args) {
		
	
	Rectangle rectangle=new Rectangle(20,10);
	  rectangle.Area();  //200
	  
	  rectangle.Perimeter();  //60
	  rectangle.Capacity();   //0
	  
    Square square=new Square(15);
        square.Area();  //225
        square.Perimeter(); //60
        square.Capacity();  //0
        
    Circle circle= new Circle(10);
      circle.Area();  //314.0
      circle.Perimeter();  //62.80
      circle.Capacity();  //0
      
    Cylinder cyl=new Cylinder(10,14);
    cyl.Area(); //1507.2
    cyl.Perimeter();  //0
    cyl.Capacity();  //4396.0
      
	
	}

}

