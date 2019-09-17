package day06_ArithmaticOperators;

public class tasks_2 {
	public static void main(String[] args) {

	/*
	 Write a Java program that will print a sum of two numbers
	 Please use variables to store num1,num2,and sumSample 
	 output:46 + 90 = 136
	 */
//		answer:
		int num1=46;
		int num2= 90;
		int sumSample= num1+num2;
		System.out.println(num1+"+"+ num2 +"="+sumSample );
		
		/*
		 Write a Java program to convert Fahrenheit to Celcius
		 F=9*C/5+32
		 */
		char Celcius='C';
		char Fahrenhiet= 'F';
		System.out.println(Fahrenhiet+ "="+"9*"+Celcius+"/5+32");
		
		/*
		  Write a Java program that converts mile to km
		  1 mile = 1.609344 km
		 */
		String mile="1.609344 km";
		System.out.println("1 mile="+mile);
		
		/*
		 Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas:
		 perimeter = 2 * radius * PI
		 area = radius * radius * PI
		 */
		double radius=5.5;
		double Perimeter=2*radius*Math.PI;
		double Area= radius*radius*Math.PI;
		System.out.println("Perimeter="+Perimeter);
		System.out.println("Area="+ Area);
		/*
		  Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
		  area = width * height
		 */
		double width=4.5;
		double length=7.9;
		double area= width*length;
		System.out.println("Area="+ area);
		

//	  Write a Java program that calculates the average of 3 numbers.
		int x=3;
		int y=5;
		int z=7;
		int Ave=(x+y+z)/3;
		System.out.println("The average of "+x+","+y+",and "+z+" is "+Ave);	
}
}
