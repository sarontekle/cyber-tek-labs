package day06_ArithmaticOperators;

public class PrimitiveCasting {

	/*
	 Casting: converting larger primitives to smaller size.
	      datatype variabeleName=(dataype)value;
	      
	      Explicit casting, or implicit casting.
	 primitives: byte, short, int, long, float, and double are purely numerical data types.
	 */
	public static void main(String[] args) {
		int a=10;
//		byte b=a; cannot copile because int is bigger than byte, therefore using casting can be assigned to byte.
		byte b=(byte)a;  //explicit casting
		System.out.println(b);
		double decNum=10.5;
		float floNum=(float)decNum;
		float floNum2=(int) decNum;
		System.out.println(floNum);
		System.out.println(floNum2);
//		implicit casting: is when we are assigning smaller primitive data types to larger primitive data types. 
//		 casting data type is not needed since java compiler automatically recognizes it as casting.
		byte bnum=100;
		int inum=bnum;
		System.out.println(inum);
		
		System.out.println("==================================");
//		operators:
//		include subtraction, division, addition, multiplication, and remainders.
		
	}
}
