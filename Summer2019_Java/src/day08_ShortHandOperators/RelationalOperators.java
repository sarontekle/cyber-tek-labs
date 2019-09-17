package day08_ShortHandOperators;

public class RelationalOperators {
	/*
	 Relational OPeratorts:return boolean expressions.
	 >: greater than
	 >=: greater or equal to
	 <: less than
	 <=: less than or equal to
	 ==: equal
	 !=: not equal
	 =:assigning something to a variable.
	 !: exclamation mark means the logical opposite.
	 */
	public static void main(String[] args) {
		System.out.println(10>9); // true 
		boolean resultA=10>9;
		System.out.println(resultA);
		System.out.println(10>=9); //greater or equal
		boolean resultB=10>=9;
		System.out.println(resultB);
		
		boolean resultC=10<=9; //less than or equal to
		System.out.println(resultC); //false
		boolean resultD=1100<1200; //less than 
		System.out.println(resultD); // true
		
		boolean resultE=1000<1000;
		System.out.println(resultE);  //false
		 
		boolean resultF= 19==19; //equal
		System.out.println(resultF); //true
		
		boolean resultG= 20!=20;
		System.out.println(resultG);  //false
		
		boolean A=true==!false;
		System.out.println(A); //true
		
	}

}
