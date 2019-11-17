package tasks;
import java.util.Scanner;

public class ReplIt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    while(start==65 &&end <=90) {
	    	start++;
	      System.out.print(start);
	    }
	    while(start==97&& start<=end) {
	    	start++;
	    
	      System.out.print(start);
	    }
	    }
	}   

