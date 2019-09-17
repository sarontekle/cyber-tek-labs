package day09_Review;

public class quiz {
	public static void main(String[] args) {
//		question 01:
		boolean result= !!!!! false;
		System.out.println(result);  //true
//		question 02:
		boolean result1=!false!=("Batch12"!="Best Batch Ever");
		       //        true !=  true
		       //        False
		System.out.println(result1);
		
//		question 03:
		int x=100;
		double y=x+=100/20;
		//   y=x+=5;   y=100+5==>105
		System.out.println(y); //105.0
//		question 05:
		boolean A=128>'9' || 128==127;
		      //   true   || false==> true
		System.out.println(A);
//		question 09:
		int Z=100;
		// System.out.println("Z>100 is :"+H); compile error because in main method, code is executed from top to bottom.
		boolean H=Z>100;  //false
//		question 10:
		System.out.println(5+7+"8"); 
//		question 12:
		int num=100;
		num+=300;
		System.out.println(num++ +" "+num); //400 401

		
		
	}

}
