package day29_ReturnMethods;

public class WarmUp {
/*
 Warm up:
1. write a method that can find the frequency of characters in String.
    Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4 
 */
	public static void main(String[] args) {
		String str="aabbaaabbbcccccDD";
		//expected result:a5b5c5D2
		
		String RemoveDup=""; //to place the non duplicate values in str
		for(int j=0;j<str.length();j++) {
			if(!RemoveDup.contains(str.substring(j,j+1))) {
				RemoveDup+=str.substring(j,j+1);
			}
		}
		System.out.println(RemoveDup);
		
		String result="";  // to store the expected result

		  // to count times of occurrence.
	for(int j=0;j<RemoveDup.length();j++) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.substring(i,i+1).equals(RemoveDup.substring(j,j+1))) {
				count++;
			}
		}
		result+=RemoveDup.substring(j,j+1)+count;
	}
	
		System.out.println(result);
		
		System.out.println("=====================");
//		using charAt method
		
//		input="XXXYYYZZZZ";   expected result=X3Y3Z4
		String input="XXXYYYZZZZ";
		String nonDup="";
		for(int i=0;i<input.length();i++) {
			if(!nonDup.contains(""+input.charAt(i)) ) {
				nonDup+=input.charAt(i);
			}
		}
		System.out.println(nonDup);
		
		String expectedResult="";
		for(int j=0;j<nonDup.length();j++) {
		int times=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==nonDup.charAt(j)) {
				times++;
			}
		}
		expectedResult+=""+nonDup.charAt(j)+times;
		}
		System.out.println(expectedResult);
	}
	
}
