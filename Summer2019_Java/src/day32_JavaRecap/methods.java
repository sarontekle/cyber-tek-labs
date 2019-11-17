package day32_JavaRecap;
import java.util.Arrays;
public class methods {
	

	public static void main (String[] args){
	    String str="Nurses Run";
	    System.out.println( isPalindrome(str) );
	  }
	  public static boolean isPalindrome(String check) {
	    String reverse="";
	    for(int i=check.length()-1; i>=0;i--){
	      reverse+= check.substring(i,i+1);
	    }
	    return (reverse.equalsIgnoreCase(check) )?true:false;
	     
	  }
	}


