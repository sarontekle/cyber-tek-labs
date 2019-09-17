package day07_UnerayAndShortHand;

public class UnaryOperators {
	public static void main(String[] args) {
		/*
		 +:positive
		 -:negative
		 ++:increment
		 --:decrement	
		 
		 	 +- ==>-
		 	 -- ==>+
		 	 ++ ==>+
		 */
		int a=10;
		int b=-10;
		System.out.println(b);  // -10
		int c=+b;
		System.out.println(c); // +(-10)==>-10
		
		// increment: increase the vale by 1.
		// pre increment: operator is placed before the variable; increases the value of number immediately.
		// post increment:operator placed after the variable; increases the value immediately following the current value or number.
		int num= 100;
		++num;
		System.out.println(num); //==> 101.
		int num2= 100;
		System.out.println(num2++);  //==>100, but next stage is 101.
		System.out.println(num2);  // ==>101
		int num3= num2++;
		System.out.println(num3);  //==>101
		System.out.println(num2);  //==>102
		
		// Decrement: decreases the value by 1.
		// pre decrement:operator placed before the variable; decreases the value immediately.
		// post decrement: operator placed after the variable; decreases the value immediately following the current value or number.
		
		int Z=100;
		--Z;
		System.out.println(Z); //==>99
		System.out.println(--Z); //==>98
		int Z1=100;
		System.out.println(Z1--); //==>100
		System.out.println(Z1);  //==>99
		int T=25;
		System.out.println(++T); //==>26
		System.out.println(--T); //==>25
		
		int P=50; //49
	  P=--P + P++ + P-- + P++;
		// 49 + 49 + 50 + 49 
		System.out.println(P); //==>197
		 
		
		int W=1; //0
		W= -W-- + W++ / -W-- * --W;
	//      post  post  post  pre
		// -1  + 0  / -1  * -1
		// W= -1+0*-1=-1
		System.out.println(W);
		
		
      // Decrement: decrease the value by 1.
		
		
	}

}
