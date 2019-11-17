package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
         /*
          ArrayList Class: presented in java.util package
                       import java.util.ArrayList;
                 - ArraysList does not support primitives
                 - in ArrayList we store objects ONLY, all the values in ArrayList are objects(nonPrimitives)
                 
                 Declaration:   
                 ArrayList<ClassType> variableName = new ArrayList <>();
          */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList <>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		      
		System.out.println(list2);
		
		
//		Methods of ArrayList: 
		// add(value):used to add a value to the arraylist, if value is primitive, it will convert it to wrapper class
		
		list2.add(10);
	      list2.add(20);
	      System.out.println(list2);
	      
	   //get(indexnum): gets a specific value from an arraylist   
		System.out.println(list2.get(1));
		
	  // size(): finds the length of the arraylist.
		System.out.println(list2.size());
		
	  //clear(): it empties out the array list, and makes the size 0.
		list2.clear();
		System.out.println(list2);
	}
}
