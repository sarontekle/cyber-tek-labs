package tasks;
import java.util.Scanner;

public class ScannerPractice {
public static void main(String[] args) {
//	int hours, minutes, seconds;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter seconds: ");
//	int inputSeconds=sc.nextInt();
//	System.out.println("User input is: "+ inputSeconds);
//	
//	hours=(inputSeconds/3600);
//	minutes=((inputSeconds%3600)/60);
//	seconds=((inputSeconds%3600)%60);
//	System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
//	
	
	
	/*
	 Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
User should be able to enter unit price and quantity.
Then the program will perform calculations and display amounts.
The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
If the quantity purchased is less than 100 units, the discount rate is 0%.
See the example output as shown below:
Input:
Enter unit price: 25
Enter quantity: 110
Output:
Grand Total: $ 2750.0
Discount: 10%
Discount applied: $ 275.0
Total: $ 2475.0

	 */
	Scanner sc=new Scanner(System.in);
	double discount=0;
	System.out.println("Enter unit price: ");
	double unitPrice=sc.nextDouble();
	System.out.println("Enter quantity: ");
	double quantity=sc.nextDouble();
	double grandTotal=(unitPrice*quantity);
	if(quantity>=100 && quantity<=120) {
		discount=10;
	}
	else if(quantity>120) {
		discount= 15;
	}
	System.out.println("Grand Total: $ "+grandTotal);
	System.out.println("Discount: "+ discount+"%");
System.out.println("Discount applied: $ "+(grandTotal*discount/100));
System.out.println("Total: $"+(grandTotal*discount/100+grandTotal));
}
}
