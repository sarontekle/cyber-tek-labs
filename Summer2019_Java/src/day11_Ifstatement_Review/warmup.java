package day11_Ifstatement_Review;

public class warmup {
	/*
	 warm up:
	 1. declare an int variable "Year"
	-  write a java program than can check if the year is a leap
	   if year can be divided by 4==>leap
	      Do not use a single if statement
	 2. grade calculator
	   A==>90~100
       B==>80~89
       C==>70~79
       D==>60~69
       F==>0~59
	 */
   public static void main(String[] args) {
	int Year=2000;  //leap
	boolean LeapYear=Year%4==0;
	if (LeapYear) {
		System.out.println("Year "+Year+" is a leap year");
	}
	else {
		System.out.println("Year "+Year+" is Not a leap year");
	}
	
	/*
	 1. Write a java program to find the number of days in each month.
	 (assume that February has 28 days)
	 int month=0~12;
	  1,  2,   3,    4,   5,   6,   7,   8,   9,  10,  11,  12 
	 Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
	 31   28   31   30   31   30   31   31   30   31   30   31
	 Must be nested if:
	   28 days:2
	   30 days:4,6,9,11
	   31 days: 1,3,5,7,8,10,12
	 */
	int month=5;
	if(month>0 && month <13) {
		if(month==1) {
			System.out.println("31");
		}
		else if(month==2) {
			System.out.println("28");
		}
		else if(month==3) {
			System.out.println("31");
		}
		else if (month==4) {
			System.out.println("30");
		}
		else if (month==5) {
			System.out.println("31");
		}
		else if(month==6) {
			System.out.println("30");
		}
		else if(month==7) {
			System.out.println("31");
		}
		else if (month>=8 && month%2==0) {
			System.out.println("31");
		}
		else {  //odd months have 30 days
			System.out.println("30");
		}
	}
	
	int month2=13;
	if(month2>0 && month2<13) {
	if(month2==2) {
		System.out.println("28 days");
	}
	else if(month2==4 || month2==6) {
		System.out.println("30 days");
	}
	else if(month2==9 || month2==11) {
		System.out.println("30 days");
	}
	else {
		System.out.println("31 days");
	}
	}
	else {
		System.out.println("Invalid Entry");
	}
	
}
}
