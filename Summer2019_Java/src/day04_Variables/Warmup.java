package day04_Variables;

public class Warmup {
	public static void main(String[] args) {
/*
  The unit price of each vegetable is provided in the above picture
  Store each price is one of the primitive data types you learned and print below message.
Expected Result ;
cucmber =2.5
tomatoe= 3
onion=1.5
pepper=2
carrots=4

expected result:
1 Cucumber is 2.5 dollars
4 Tomatoes are 12 dollars
2 Onion is 3 dollars
1 Pepper is 2 dollars
6 Carrot is 24 dollars
 */
	
		double Cucum= 2.5;
		int tomato= 3;
		float onion=1.5f;
		short pepper= 2;
		short carrots=4;
		
		long tomato2= tomato*4;
		double onion2=onion*2;
		long carrots2=carrots*6;
		System.out.println("1. 1 Cucumber is "+ Cucum + " dollars.");
		System.out.println("2. 4 Tomatoes are "+ tomato2+" dollars.");
		System.out.println("3. 2 Onion are "+ onion2 +" dollars." );
		System.out.println("4. 1 Pepper is "+ pepper+ " dollars.");
		System.out.println("5. 6 Carrots are "+ carrots2+ " dollars.");
		
	
	}

}
