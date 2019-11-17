package day26_ForEach;

public class ContinueStatement {
  public static void main(String[] args) {
	
	  for(int i=0; i<5;i++) {
		  if(i==3) {
			  continue;
		  }
		  System.out.print(i+" ");
	  }
	  System.out.println();
	  
	  int[] nums= {11,23,34,46,57,68,79,80,9};
	  for(int i=0; i<nums.length;i++) {
		  if(nums[i]%2==0) {
			  continue;
		  }
		  System.out.print(nums[i]+" ");
	  }
	  
	  
}
}
