
package day08_ShortHandOperators;

public class warmup {
	public static void main(String[] args) {
		/*
		 Task 1: result of the following code segments:
		 1. x=2;
		 y=x++; print y
		 2. x=2;
		 pring x++
		 3. x=2;
		 pring --x
		 4. x=8;
		 y=x--;
		 print y
		 
		 
		 Taks 2: write a java program that converts gallons to liters.
		 1 gallon=3.785 liters
		 Task 3: write a java program that converts liters to gallons.
		 
		 */
		int gallon=100;
		double liters=gallon*3.785;
		System.out.println(gallon+" gallons equals to "+liters+" liters");
		
		double L=1;
		double G=L/3.785;
		System.out.println(L+" liter equals to "+ G+" gallons");
		System.out.println("===========================");
		
		int x=2;
		int y=x++;
		System.out.println(y);
		
		int x1=2;
		System.out.println(x1++);
		
		int x2=2;
		System.out.println(--x2);
		
		int x3=8;
		int y3=x3--;
		System.out.println(y3);
		
		
		
	}

}
