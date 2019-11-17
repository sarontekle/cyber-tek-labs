package replIt;
import java.util.Scanner;
public class PrintfirstLastChar {
   public static void main(String[] args) {
	
	   Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    for(int i=0;i<words.length;i++){
	      System.out.println( "" + words[i].charAt(0)+ (words[i].charAt(words[i].length()-1)) );
	    }
	    String str="hi there where are you";
	String[] arr=str.split(" ");
	
	
}
}
