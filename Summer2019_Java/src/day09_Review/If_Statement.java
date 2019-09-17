package day09_Review;

public class If_Statement {
	/*
	 if statement :
	     single if statement:
	     if(boolean expression){
	     some codes to run
	     }
	     code only gets executed if the condition is true
	 */
	public static void main(String[] args) {
		// if(9>10) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tommorow is day off");
		}
		int a=1000;{
		if(a++==1001) {   //this will not be executed because the condition gives out a false statement, giving the value 1001 after the post increment.
	// if condition is true, then value of a in the new value after executing the code which is 2000.
			a=2000;
			System.out.println("a is increased");
		}
		System.out.println(a+"\n\n\n");
		
		int X=987654320;
		if (X%2==0) {
			System.out.println(X);
			System.out.println("it is an even number");
		}
		if (X%2!=0) {
			System.out.println(X);
			System.out.println("it is an odd number");
		}
		int Y=2345678;
		if(Y%5==0) {
			// if true, will be executed in the console.
			System.out.println(Y+" can be devided by 5");
		}
		if (Y%5!=0) {
			// if true, will be executed in the console.
			System.out.println(Y+" can't be devided by 5");    // remainder of a number to 2 or 5 is to know if number is even/odd. 
			                                                   //even numbers will give 0 remainder
		}
		 
	String CEO="Main Boss";
	String Kuzzat= "Main Boss";
	if (Kuzzat==CEO) {
		System.out.println("Great person in the World");
		System.out.println("First if block");
	}
	if (Kuzzat!=CEO) {
		System.out.println("Great person in the World");
		System.out.println("Second if block");
	}
	  
	int Totalnumber=100;
	boolean Cybertek=true;
	boolean BestSchool= true;
	if (Cybertek== BestSchool) {
		//  true
		Totalnumber+=500;  // Totalnumber=600
	}
	if (Cybertek!=BestSchool) {
		//false 
		Totalnumber-=50;  // didn't execute
	}
	System.out.println(Totalnumber);
	/*
	 1.declare a variable, and initialize user age,
	 2. write a program if the user is eligible to vote for Donald Trump.
	 vote age:18
	 */
	byte PersonAge=78;
	byte voteage=18;
	if(PersonAge>=voteage) {
		System.out.println("Yes you are eligible to vote");
		System.out.println("Have fun building the wall");
	   System.out.println("MAGA");
	}
	if (PersonAge<voteage) {
		System.out.println("You are not eligible to vote, please grow up");
	}
	}

}
