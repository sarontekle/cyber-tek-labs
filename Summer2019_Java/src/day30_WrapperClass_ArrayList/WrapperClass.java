package day30_WrapperClass_ArrayList;

public class WrapperClass {
	/*
	 Wrapper Class: every primitive in java has a class that is designed for it.
	   primitives: byte, short, int, long, float, double, boolean, char
  Wrapper classes: Byte, Short, Integer, Long, Float, Double,Boolean, Character
  All wrapper classes are present in the java.lang package, as well as String class
  - all the default values of wrapper classes are null.
  
  *autoboxing:converting primitive values to wrapper class.
	 */
  public static void main(String[] args) {
	
	  int numInt=10;
	  Integer numInteger=10;
	  
	  double numdouble=5.5;
	  Double numDouble=5.5;
	  
	  long longnum=20l;
	  Long Longnum=longnum;  //auto-boxing
	  
	  System.out.println(longnum);
	  System.out.println(Longnum);
	  
	  Boolean Booleanresult=false;
	  boolean boolresult=Booleanresult;  //unboxing
	  
//	  Methods for wrapper classes:
    //max_value: returns the max value of the primitive
	  char maximumChar=Character.MAX_VALUE;
	  System.out.println(maximumChar);
	  
	//min_value: returns the minimum value of primitive.
	  
	  int minimum=Integer.MIN_VALUE;
	  System.out.println(minimum);
	  
	  byte miniByte=Byte.MIN_VALUE;
	  System.out.println(miniByte);
	  
	//parse methods: converts String values to primitives, nad returns values as primitives.
	  
	    //parseInt("strValue"):takes the String and converts it to int.
	  
	  Integer num1=Integer.parseInt("123");  //auto-boxing
	  System.out.println(num1+1); //124
	  
	  //parseByte("strValue"):takes a string value and converts it to primitive returning a byte value.
	  
	  int num3=Byte.parseByte("19");
	  System.out.println(num3+1); //20
	  
	  //parseShort("strValue"):takes a string value and converts it to primitive returning a short value.
	  
	  short num4=Short.parseShort("123");
	  System.out.println(num4+5); //128
	  
	  //parseBoolean("strValue"): takes string value and converts it to boolean primitive.
	  boolean A=Boolean.parseBoolean("CybertekBatch12");  //any string value other than true, it will return false
	  System.out.println(A); //false
	  
	  boolean B=Boolean.parseBoolean("TrUe");
	  System.out.println(B); //parseBoolean method ignores the case sensitivity in this case.
	  
	  
//	  ValueOf methods: converts String value to Wrapper class value.
	  
	     int z=Integer.valueOf("1234");
	     System.out.println(z);
	     
	     boolean result1=Boolean.valueOf("TRUE");   //this method also ignores the case sensitivity and 
	                                                //since the result is primitive, it prints out the exact one as the string
	     System.out.println(result1);
	  
	     
	     int totalNum=100;
	     
}
}
