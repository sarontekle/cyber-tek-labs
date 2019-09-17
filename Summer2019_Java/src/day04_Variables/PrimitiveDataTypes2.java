package day04_Variables;

public class PrimitiveDataTypes2 {
	/*
	 Primitives: byte, short, int, long, float, double, boolean, and char.
	 boolean: used to assign a true or false expression.
	 char: used to declare a single character. it is declared in sing quotation marks.
	 */
public static void main(String[] args) {
	boolean result=true;
	boolean result2= false; // boolean= Earth is flat; expressions like this, even though they are true or false, java does not recognize it.
	boolean result3= 9>3;
	System.out.println(result);
	System.out.println(result2);
	System.out.println(result3);
//	char:
	char char1='a';
	System.out.println(char1);

	char char2='9';
	char char3= '#';
	System.out.println("\n\n\n");
//	char with number
	char char4= 67; // only time we use single quotes for char is to declare a single number or a single character.
	System.out.println(char4);
	char char5= 123; 
	System.out.println(char5);
//	initializing char to other primitives; byte, short, int, long, float, and double
	char Mychar1='b';
	int MyInt= Mychar1;
	System.out.println(MyInt); //98
	byte MyByte= 'b'; //this corresponds to #98
//	byte MyByte2= Mychar1; this wont compile because the byte is 1 byte where as char is 2 bytes, and if it in the form above, byte is able to recognix=ze the number.
	System.out.println(MyByte);
//	short ShortNum=Mychar1; char's memory could be bigger than short, range is greater.
	short ShortNum2='b'; // this corresponds to #98 from ASCII table.
	System.out.println(ShortNum2);
	
	long LongNum=Mychar1; // long's memory is bigger than char's so we are able to initialize char using long.
	long LongNum2='b';
	
//	char can be assigned to float because the memorey of float is bigger than char.
	float Fnum= Mychar1;
	float Fnum2= 'b';
	System.out.println(Fnum2); // float is designed for decimals, so it is going to print out in decimal format of the number.
	
	double Dnum= Mychar1;
	double Dnum2='b'; // double is also the same as float, which means char a=can be initialized using double.
	System.out.println(Dnum);
	System.out.println("================================");
	
	char Char3= 200;
	System.out.println(Char3);
//	char Char4= ;
//	System.out.println(Char4);
	double Dnum1= 100L;
	System.out.println(Dnum1);
	float Fnum1= 100L;
	double Dnum3= 100F;
	
	
}
}
