package replIt;
import java.util.*;
public class FindFewValeus {
public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
String str = scan.nextLine();
    
    String[] words=str.split(",");
    
    int min=100;
    for(int i=0; i< words.length; i++){
      if(words[i].length() < min){
         min=words[i].length();
      }
    }
    int count=0;
    for(int i=0; i<words.length; i++){
      if(words[i].length() == min){
        count++;
      }
    }
    String[] newStr= new String[count];
    int j=0;
    for(int i=0; i<words.length; i++){
      
      if(words[i].length()==min){
         newStr[j]=words[i];
        j++;
      }
    }
    Arrays.sort(newStr);
    System.out.println(Arrays.toString(newStr));
    
}
}


  