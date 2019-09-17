package day03_Variable;

public class PrimitiveDataTypes {
/*
 byte: used to assign whole number value( no decimals) ranging from -128 to 127.
 short: used to also assign whole numbers ranging from -32768 to 32767.
 int: used to assign whole numbers with in the range of about -2.2 billion to 2.2 billion.
 long: used to assign very big whole number values, bigger than int. at the end of value, giving l or L assigns it to long data type.
         byte <short <int <long
         small one can always be assigned to a larger data type.
  float: used to assign decimal numbers followed by an f or F special character.
  double: used to assign decimals(used more often because it does not require specific special character after the value)
 */
	public static void main(String[] args) {
		byte length =3;
		System.out.println(length);
		byte width  =4;
		System.out.println(width);
//		bye num=100; variable name must start with a~z, or A~Z with no special characters other than _ and $
		short num3= 10000;
		System.out.println(num3);
		int num4= 10_000_000;  // easier to read,only _ is readable with the signed values.
		
		long longNumber=10;
		//int intNumber= 10l; // this l represents the int number being assigned to long data type.
		
		byte byteNumber=10;
		short shortNumber= byteNumber;
		
		float Example2= 10.5f; // when declaring a float value, f or F follows it to assign it to float.
		
		double dblNumber= 42.8;
		System.out.println("============================");
		byte bNum=10;
		short sNum=20;
		int iNum= 30;
		long lNum=40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println("=================================");
		float fNum1= bNum;
		float fNum2= sNum;
		float fNum3= iNum;
		float fNum4= lNum;
		System.out.println(fNum1);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		System.out.println("=======================================");
		
		
		
		
		
		
	}
}
