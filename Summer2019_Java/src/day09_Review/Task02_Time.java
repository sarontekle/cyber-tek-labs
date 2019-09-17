package day09_Review;

public class Task02_Time {
	/*
	 Like this: 12:24:33 PM 

   1. Declare variables: hour, minute, second that can hold int values.

   2.  Declare amOrPm variable that can hold a String ("AM" or "PM")

   3. Using the variables and concatenation, print values in the format mentioned above.
	 */
	public static void main(String[] args) {
		int hour=12;
		int minute=24;
		int second=33;
		String amOrpm= "PM";
		System.out.println(hour+":"+minute+":"+second+amOrpm);
	}

}
