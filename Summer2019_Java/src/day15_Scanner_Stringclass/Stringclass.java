package day15_Scanner_Stringclass;

public class Stringclass {
	/*
	 String is a a data type with 2 ways to create an object.
	 1. String literal: objects will be saved at string pool, which does not take duplicates. examples: lines 11,12 and 13
	 2. by using "new" keyword:
	 String str= new String("object");
	 
	 
	 */
public static void main(String[] args) {
	
	
	String A="Cybertek";
	String B= "Cybertek";   // only one object is saved in the string pool because they are the same.
	System.out.println(B==A);  //true because they are the same value and in the same String pool.
	
	String str1= new String("Cybertek");
	String str2= new String("Cybertek");
	System.out.println(str1==str2); //false because every time a "new" String class is declared, it checks the memory location, which are different.
// String methods:
// charAt(indexnum): it takes the index number and returns its character as a char value
    String str="Cybertek"; 
    char ch= str.charAt(4);
    System.out.println(ch);
    String str3="Mu htar";
    System.out.println(str3.charAt(2));// gives you the space character between Mu and htar.
    
//    length(): returns the total number of characters as an int value
//    ex: String str="Cybertek";  str.length()==>8
    String name="Donald Trump";
    int n=name.length();
    System.out.println(n); //12 including the space.
    
//    concat(): takes a string and concats it to the string variable, then returns a new String value.
    
    String s1="Cybertek";
    s1.concat("School");  //attempt to modify String s1
       System.out.println(s1);
       s1=s1.concat(" School");
       System.out.println(s1); //Cybertek School
       
//       toUpperCase():  changes the value of string to all upper case when the value is assigned to the method.
       String N="cybertek";
       N.toUpperCase();
       System.out.println(N); //cybertek
       
       N=N.toUpperCase();
       System.out.println(N); //CYBERTEK
       
//       toLowerCase(): changes the value of string to all lower case when the value is assigned to the method.
       String name1="ABDULRAHMAN";
       name1.toLowerCase();
       System.out.println(name1);  //ABDULRAHMAN
       name1=name1.toLowerCase();
       System.out.println(name1); //abudlrahman
       
//       
       
}
}
