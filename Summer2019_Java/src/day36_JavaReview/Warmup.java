package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup {
	/*
	 WarmUp:
    1. write a return method that can remove the duplicated objects from an Integer arraylist
    2. write a return method that can remove the duplicated objects from a String arraylist
    3. write a return method that can remove the duplicated objects from a Character arraylist
    4. write a return method that can remove the duplicated objects from a Double arraylist
	 */
	
	public static void main(String[] args) {
		//task01:
		
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,5,5,6));
		System.out.println(RemDup(list));
		
		//task02:
		String[] names= {"Sherinay"," Denis"," Muhtar","Madina","Sherinay","Madina"};
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(names));
		System.out.println(RemDup2(list3));
		
		//task03:
		Character[] charzzz= {'A','b','b','X','c','X','F','A'};
		ArrayList<Character> words= new ArrayList<>(Arrays.asList(charzzz));
		System.out.println(RemDup3(words));
		
	}
	//Task01:
	public static ArrayList<Integer> RemDup(ArrayList<Integer> list) {
		ArrayList<Integer> result=new ArrayList<>();
		for(Integer each: list) {     //or another for loop   for(int i=0; i<list.size(); i++){ if( !result.contains( list.get(i) ) )}
			if( !result.contains(each) ) {
				result.add(each);
			}
		}
		return result;
	}
//	public static String RemoveDup(ArrayList<Integer> list2) {
//		String result="";
//		for(Integer each: list2) {
//			if( !result.contains(""+each) ) {
//				result+=each+", ";
//			}
//		}
//		String[] arr= result.split(",");
//		ArrayList<String> RemoveDuplicates= new ArrayList<String>(Arrays.asList(arr));
//		return RemoveDuplicates;
	
	//Task02:
	public static ArrayList<String> RemDup2(ArrayList<String> list2) {
		ArrayList<String> result=new ArrayList<>();
		for(String each: list2) {
			if( !result.contains(each) ) {
				result.add(each);
			}
		}
		return result;
	}
	
	//Task03:
	
	public static ArrayList<Character> RemDup3(ArrayList<Character> list2) {
		ArrayList<Character> result=new ArrayList<>();
		for(Character each: list2) {
			if( !result.contains(each) ) {
				result.add(each);
			}
		}
		return result;
	}
	
	}


