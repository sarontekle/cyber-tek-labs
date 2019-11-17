package tasks;
import java.util.Scanner;

public class ShoppingList {
public static void main(String[] args) {
	 boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if(word.substring(0,4).equals("java") || 
	    word.substring(1,5).equals("java")){
	      System.out.println("true");
	    }else{
	      System.out.println(exists);
	    }
}
}
