package day18_StringClass_Continue;

public class StringMethods {
	public static void main(String[] args) {
		/*
		 indexOf(str): takes a string value and returns the index number of 
		 the first occurred character in the given String as an int value. 
		 String str="Cybertek"; str.indexOf("ert"), it only identifies the first occurring letter.
		 */
		String A1="Batch 12 is a great batch";
		// 
		int num=A1.indexOf("g");
		System.out.println(num); //14 including the space
		
		int num2=A1.indexOf("at ");
		System.out.println(num2); // the letter 'a' is going to be 17 because it counts spaces as well 
		
		String Address="7925 Jones Branch Dr, McLean, VA 22003";
		int begin=Address.indexOf(",")+1+1;
		int end=Address.indexOf(", VA");
		String cityName=Address.substring(begin, end);
		System.out.println(cityName);// McLean
		
		/*
		 lastindexOf(): returns the last occurred character's index number as an int value.
		 */
		String str= "ABCDABCD";
		int n2=str.indexOf("B"); //1
		int n3=str.lastIndexOf("B"); //5
		System.out.println(n2);
		System.out.println(n3);
		String myEmail="Myemail.school@gmail.com";
		int Begin=myEmail.indexOf("@")+1;  //+1 excludes the @ sign from being displays and continues to display the next character.
		int End=myEmail.lastIndexOf(".");
		String myEmailType=myEmail.substring(Begin, End);
		System.out.println(myEmailType); //gmail
		
	}

}
