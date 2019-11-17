package day29_ReturnMethods;

public class Warmup2 {
   public static void main(String[] args) {
	
	   String str="AABBCCDD";  //expected result="A2B2C2D2";
	   
	   String expectedResult="";
	   for(int j=0;j<str.length();j++) {
	 
	   int count=0;
	   for(int i=0; i<str.length();i++) {
		   if(str.charAt(i)==str.charAt(j)) {
			   count++;
		   }
	   }
	   expectedResult+=""+str.charAt(j)+count;    // after one character is added, making sure to not add it again in the next loop, we use replace method.
	   str=str.replaceFirst(""+str.charAt(j), "");
	   }
	   System.out.println(expectedResult);
}
}
