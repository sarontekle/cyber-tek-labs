package day08_ShortHandOperators;

public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 &&: And logic      true && true==>true, if both conditions are true
		 ||: or logic      true || true==> true
		                   true || false==> true
		                   false ||false==>false
		 */
		boolean resultA= 9==0 && "Muhtar"=="good";
		  //            false      false ==> false
		System.out.println(resultA);
		
		boolean resultB=8>5 && 7==(8-2+1);
		//             true && true ==> true
		System.out.println(resultB);
		 boolean ResultC= !false!=true && !false==!(!true);
		 //                true !=true  && true==!false
		 System.out.println(ResultC);
//		 ||: 
		 boolean A= "Monday"=="Fun-day" || 6==6;
		 //                false    ||  true
		 System.out.println(A);  //true
		 
		 boolean B= true || false;   //true
		 System.out.println(B);  //true
		 
		 boolean C= true && true || false;
		 //             true  || false
		 System.out.println(C);  // true
		 
		 boolean D= !(7>5 && 6!=5) &&(9>5 || 10>4);
		 //          !true        &&  true
		 //          false     && true
		 System.out.println(D); //false 
	}

}
