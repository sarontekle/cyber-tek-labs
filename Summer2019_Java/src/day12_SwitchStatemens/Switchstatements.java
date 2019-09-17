package day12_SwitchStatemens;

public class Switchstatements {
	/*
	 Switch statements: tests expressions based only on a single integer, enumerated value, or String object.
	  it does not compile when there are 4 data types being declared with switch.
	 double D=10; 10L; 10f   // this is because it contains a letter which switch statement is not going to recognize as a single value.
	 float F=10F; 10f; 10L
	 long L= 10L; 10l   
	 boolean Result= true || false;
	 * the same thing goes for float long, and boolean values 
	 
	     syntax:
	        -->declare a byte, short, or int variable= value; and/or
	        --> declare a string value
	        --> switch(expression){
	           case CaseValue:
	               statement 1;
	               statement 2;
	               break;
	           default:
	             statement;
	             break;
	             }
	          
	 */
	public static void main(String[] args) {
		int score=3;
		switch(score) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("invalid input");
		}
		// examples:
		int month=8;
		String monthstring;
		switch(month) {
		case 1: monthstring="January";
		 break;
		case 2: monthstring="February";
		 break;
		case 3: monthstring="March";
		 break;
		case 4: monthstring="April";
		 break;
		case 5: monthstring="May";
		 break;
		case 6: monthstring="June";
		 break;
		case 7: monthstring="July";
		 break;
		case 8: monthstring="August";
		 break;
		case 9: monthstring="September";
		 break;
		case 10: monthstring="October";
		 break;
		case 11: monthstring="November";
		 break;
		case 12: monthstring="December";
		 break;
		default: monthstring=" Invalid Month";
		 break;
		
		}
		System.out.println(monthstring);
//		example #2:
		String str="Java";
		switch(str) {
		default: 
			System.out.println("invalid");
			break;
		case "C#":
			System.out.println("C# programming language");
			break;
		case "Python":
			System.out.println("Python programming language");
			break;
		}
//		example #3:  without a break statement.
		char grade='A';
		switch(grade) {
		default:
			System.out.println("Failed");
		case 'B':
			System.out.println("Passed with a B");
		case 'C':
			System.out.println("Passed with an A");
		}  //all statements execute because there is no break statement 
		
		
		
		int num=10;
		boolean num1= --num>10;
		if(num1) {//line1
			System.out.println("Hello World"+num);
		}
		
		
//		Example 08/30/2019:
//		months:1,3,5,7,8,10,12==>31 days  and  4,6,9,11==>30days   and  2==> 28 or 29 days depending on leap year
		int Month=2;
		int year=2007;
		int numdays=0;
		switch(Month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numdays=31;
			break;
		case 4: case 6: case 9: case 11:
			numdays=30;
			break;
		case 2:
			if(((year%4==0) && !(year%100==0)) || (year%400==0))
				numdays=29;
			else
				numdays=28;
			break;
		default:
			System.out.println("Invalid month");
			break;
			}
		System.out.println("Number of days is "+numdays);
	}
}
