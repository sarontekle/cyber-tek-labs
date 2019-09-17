package day17_StringClass;

public class StringMethods {
	public static void main(String[] args) {
		/*
		String Methods:
		1. String literal: String name=" ";  // stored in string pool, if duplicated, only recognized as one.
		2. Using new word: String str=new String(" ");
		
		 */
		String str1="Hello Javangers";
		String str2="Hello Javangers";
		boolean R1=str1==str2;
		System.out.println(R1); //true, because it is on the same string pool and it does not duplicate on there.
		
		String str3= new String("public pool");
		String str4=new String("public pool");
		boolean R2=str3==str4;
		System.out.println(R2);//every time new keyword is used, it is stored in different locations on the Java Heap, which is why it gives us a false.
		
//		concat();
		String a="Cybertek";
		a=a.concat(" School");  
		System.out.println(a);//Cybertek School.
		
//		length(); it returns the total number of characters as an int value.
		String LongName="ABCDEFGHIJKLMN";
		int num=LongName.length();
		System.out.println(num); //14 characters 
	
//		charAt(indexNum); with each character in the string value having an index number starting from 0, 
//		this method gives you the character that matches the index number given.
		String ch=new String("chaoihfjkrnihgi");
		ch.charAt(5);
		System.out.println(ch.charAt(5)); //h
		
//		toUpperCae():converts the String value to upper case, and returns a NEW String value
//		toLowerCase(): converts the String value to lower case, and returns a new String value.
	
//		trim(): it is used to remove unused spaces.
		String s1="          Hello";
		s1.trim();
		System.out.println(s1); // prints hello with all the spaces
		s1=s1.trim();
		System.out.println(s1); //without all the space.
		
//		substring(beginning index): it creates the sub value of the String from the beginning index until the last index
//		and returns it as a NEW string value.
		
		String Str="Cybertek School";
		//          0123456789
		Str=Str.substring(9);
		System.out.println(Str); //School
		/*
		 substring(beginning index, ending index): it creates the sub value string from the beginning index till the ending index
		 and returns a new string value(ending index is excluded from the new value).
		 */
		String fullName="CybertekSchool Batch12";
		//               0123456789
		fullName= fullName.substring(9,14);
		System.out.println(fullName);// gives you Schoo which are designated by index numbers 9 to 14
		
		/*
		 replace(old char,new char): replaces the old char value with the new given char value in the String 
		 and returns it as NEW String value.
		 */
		
		String Str1="Java is a fun Programming language";
		Str1=Str1.replace('a','1');
		System.out.println(Str1);// replaces all "a" characters with number 1.
		
		/*
		 replace(old str, new str): replaces the old string value with a new string value
		 and returns us a NEw String value.
		 */
		String Lang="Java is a fun language";
		Lang=Lang.replace("Java","Jovo");
		System.out.println(Lang);  //Jovo is a fun language
		
		/*
		 replaceFirst(old str, new str): replaces the first occurring string with the new one if the word is duplicated in the string value
		 and returns a new string value with the first occurring word changed.
		 */
		String s3="Java is fun and great, Java is good";
		s3=s3.replaceFirst("Java", "Python");
		System.out.println(s3); // Python is fun and great, Java is good.
		
		
		
	}

}
