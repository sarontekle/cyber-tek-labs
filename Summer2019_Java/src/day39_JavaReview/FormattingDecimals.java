package day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	public static void main(String[] args) {
		
		DecimalFormat format= new DecimalFormat("0.00");
		
		double b=23.12345233231213;
		
		//format(double): formats the decimal and returns a String value.
		
		String num1= format.format(b);
		System.out.println(num1);
		
		double c=45.56789;
		System.out.println(format.format(c));

		c=Double.parseDouble(format.format(c) );
		
		
	}
	
	

}
