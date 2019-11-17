package day25_ArraysContinued;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		/*
		split(str): splits the value of String by the given value, and returns it as a string array.
		
		
		 */
		
		String sentence="Today is a great day good day to learn java";
		String[] arr= sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String email="FirstName_LastName";
		String[] arr2=email.split("_");
		
		String str=Arrays.deepToString(arr2);
		System.out.println(str.replace("[","").replace("]", ""));
		
		String java="I love java, java is fun, and java is life";
		String[] array2=java.split("java");
		System.out.println(Arrays.deepToString(array2));
		System.out.println(array2.length-1);  //this will give me the amount of times it was split which is equal to
		// the number of occurrences of the value it is being split with.
		
		
		String emailAddress="Cybertek.school.batch12@gmail.com";
		String fullName=emailAddress.substring(0,emailAddress.indexOf("@"));
		
		String[] array=fullName.split("\\.");
		System.out.println(Arrays.deepToString(array));
		
		/*
		 toCharArray():returns a char array from the string.
		 */
		String Str="Java";
		char[] ch=Str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
	}

}
