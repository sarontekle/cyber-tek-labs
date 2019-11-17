package day49_Abstraction;

public class Cylinder extends Shape{
 double radius;
 double height;
 
 public Cylinder(double radius, double height) {
	 this.radius=radius;
	 this.height=height;
 }
 
   public void Area() {
	   double Area=(2 * 3.14 * radius * radius) + height*(2*3.14*radius);
	   System.out.println("Area is "+ Area);
   }
   public void Capacity() {
	   double volume=3.14 * radius * radius * height ;
	   System.out.println("Capacity is "+volume);
   }
}
