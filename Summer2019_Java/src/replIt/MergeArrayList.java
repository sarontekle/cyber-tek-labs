package replIt;
import java.util.ArrayList;
import java.util.Arrays;
public class MergeArrayList {
	

	public static void main(String[] args){
	    String[] arr={"1","g","aabb","7","7","2","aa","7"};
	    System.out.println( getDup(arr) );
	  }
	  
	  public static int getDup(String[] r) 
	  {
	     int count=0;
	    for(int j=0; j<r.length-1; j++){
	    
	    for(int i=j+1; i<r.length; i++){
	      if(r[i].equals(r[j]) ){
	        
	        count++;
	        
	      }
	    }
	   
	    }
	     return count;
	    
	    
	   
	  }
}

		
	  