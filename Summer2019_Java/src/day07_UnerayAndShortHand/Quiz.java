package day07_UnerayAndShortHand;

public class Quiz {
	  public static void main(String[] args) {
//		question 1:
		  int a=30;
		  int b=(byte)a;
		  System.out.println(b); //30
		  
//		  question 3:
		  System.out.print("Result A"+0+1);
		  System.out.print(";Result B"+(1)+(2)); //ResultA01;ResultB12
//		  this is because adding a number to a string just concats it(links it to the end of the string).
		  System.out.println("Result B"+(1+2)); // answer: Result B3;
		  
//		  question 4:
		  System.out.println("5+2="+3+4);  //numbers after string are text, and not numbers with operators.
		  // "5+2=3"+4;
		  //"5+2=3+4";
		  System.out.println("5+2="+(3+4)); // numbers under parenthesis are executed first, then move on to concating with string text.
		  // "5+2="+(7);
		  // 5+2=7;
		  
//		  question 5:
		  float FloatNum=100.98765432f;
		  short ShortNum=(byte)FloatNum;
		  System.out.println(ShortNum);  //100, since it is being recognized as a byte value rather than a decimal.
		  
//		  question 6:
//		  byte a=200; can not compile, because 200 is out of range for byte.
		  int int2=2;
//		  question 7:
		  System.out.println((3+2)*2/3%2);
		  // 5*2/3%2; 10/3%2; 3%2=1
		  
//		  question 8:
		  // int num1=9, num2=0, num3=num1/num2;
		//  System.out.println(num3); //denominator can not be zero, which is why when compiling it had no problem,
		  // but computing it as a math problem gave us some error.
		  
//		  question 9:
		  long Lnum=3_000L;
		  double Dnum=(float)Lnum;  //narrowing:
		  int Inum=(int)Dnum;   //long, float and double can not be used in casting when declaring an int value because they are bigger than int.
		  System.out.println(Inum%1000); //3000%1000=0
		  
//		  question 10:
		  double dnum=10/3;
		  System.out.println(dnum); // dnum=3; since the data type is for decimals, then the answer is 3.0
		  
//		  question 11:
		  double dnum1=10.0/3;
		  System.out.println(dnum1); // since the declared value is a decimal, then answer gives in decimal value.
		  
//		  question 12:
		  String str= "10.5";   //string of text
//		  int num= (int)str;   since string is not a primitive data type, it can not be casted on to another primitive data type.
		  
//		  question 13:
		  int I1=10,I2=20,I3=30;
		  I1=I1%5;  //10%5=0
		  I2=I2%5;  //20%5=0
		  I3=I1*I2;  //0*0=0
		  System.out.println(I1+"\t"+I2+"\t"+I3);  //==>0   0   0
		  System.out.println("===================================");
	
		  
		  
		  
		  
		  
	}

}
