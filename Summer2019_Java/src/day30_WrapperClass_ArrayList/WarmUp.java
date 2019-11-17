package day30_WrapperClass_ArrayList;

public class WarmUp {
	/*
	   1. write a return method that accepts a String and removes duplicate values from the String
    Ex:
        RemoveDuplicate("aaabbbccc") ==> "abc"
    2. write a return method that accepts String and returns the unique values from the String
    Ex: 
            Unique("AABBCDEEE")  ==> "CD"
	 */
	public static void main(String[] args) {
		String answer= RemDup("aaabbbdddfff");
		System.out.println(answer);
		System.out.println();
		
		String unqval= UniqueValue("abfbbbdbdbsdff");
		System.out.println(unqval);
	}
// warmup01
	public static String RemDup(String str) {
	    String result="";
	    for(int i=0;i<str.length();i++) {
	    	if(!result.contains(str.substring(i,i+1)) ) {
	    		result+=str.substring(i,i+1);
	    	}
	    }
	    return result;
	}
	
//	warmup02
	public static String UniqueValue(String str) {
		String result="";
		
		for(int j=0;j<str.length();j++) {
		int count=0;
		for(int i=0;i<str.length();i++) {  //this counts the number of occurrence of a character
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		if(count==1) {
		result+="" + str.charAt(j);
	}
		}
		return result;
	}
	
}
