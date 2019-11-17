package replIt;
import java.util.Scanner;
public class RepeatSeparator_089 {
	
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String newWord="";
	    for(int i=0;i<count;i++) {
	      if(count==1){
	        newWord=word;
	      }else if(i<count-1){
	    	  newWord+=word+separator;
	      }
	    }
	    System.out.println(newWord);
  }
}
