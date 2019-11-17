package day41_InitializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {
	
	public static String name;// if there is no print statement for each time it is reinitialized, the last initialization will execute.
	public static int[] arr1;
	public static ArrayList<String> list= new ArrayList<>();
	public static ArrayList<String> students= new ArrayList<>();
	public static String[] online= {"Arzigul","Me","Spike","Savas","Bahadir"};
	public static String[] inClass= {"Daryna","Nadire","Olga","Mizgin"};
	
	
	static {
		name="Suna";
		arr1=new int[5];
		arr1[0]=1;
		arr1[2]=3;
		list.add("Break");
		students.addAll(Arrays.asList(online));
		
	}
	
	static {
		name="Erhan";
		arr1= new int[3];
		arr1[1]=2;
		list.add("Coffee");
		list.add("Tea");
		students.addAll(Arrays.asList(inClass));
	}
	public staticBlockPractice() {
		name=" Mehmet";
	}
	
	
	
	public static void main(String[] args) {
		staticBlockPractice obj= new staticBlockPractice();
	
		System.out.println(name); //null
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(list);
		
		System.out.println(students);
		
		
		
	}
	

}
