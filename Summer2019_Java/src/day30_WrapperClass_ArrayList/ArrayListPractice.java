package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	
	  public static void main(String[] args) {
		
		  ArrayList<String> nameList= new ArrayList<>();
		  //add method:
		   nameList.add("Homayra");
		   nameList.add("Apple");
		   
		 System.out.println(nameList);
		 
		 /*
		  Create an ArrayList called studentNames
		  create a scanner object called scan.
		  */
    Scanner scan= new Scanner(System.in);
	ArrayList<String> studentNames= new ArrayList<>();
	
	   System.out.println("Enter a name");
	   String name=scan.nextLine();
	    studentNames.add(name);
		   
	}
}
