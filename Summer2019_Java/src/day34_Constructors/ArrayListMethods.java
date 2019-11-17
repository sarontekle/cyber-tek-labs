package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
/*
     Remaining methods: 
     indesOf(), lastIndexOf(),
     converting array to arraylist
     removeAll(), addAll();
      */
	
	public static void main(String[] args) {
	  
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1); //auto boxing
		list.add(Integer.valueOf("33") );  //none
		list.add(Integer.parseInt("100")); //auto boxing
		list.add(200);
		list.add(20);
		list.add(1);
		
		
	//IndexOf(object): returns the index  number of the given object from the arraylist.
		//if it returns a negative number, it means the given object does not exist 
		
		int a= list.indexOf(11);
		System.out.println(a);
		
		int a2= list.indexOf(200);
		System.out.println(a2);
		
	//lastIndexOf(object): returns you the last occurred object's index number.
		
		int a3=list.lastIndexOf(1);
		System.out.println(a3);
		
	//COnverting Array to ArrayList:	
	//Arrays.asList(object Array): used to convert an array to list interface.
		
		Integer[] arr= {1,2,3,4,5};
		
		ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));
		  list2.add(100);
		System.out.println( list2 );
		
		String[] arr2 = {"Java","Python","C#","C++"};
		ArrayList<String> list3 = new ArrayList<>( Arrays.asList(arr2) );
		
	  //isEmpty(): checks if the ArrayList is empty and returns us a boolean expression.
		
		System.out.println( list3.isEmpty() );
		list3.add("F");
		System.out.println(list3);
		
		//addAll(interface):
		
		String[] allNames= {"Rahwa","Meri","Emanuel","Tim"};
		
		ArrayList<String> names= new ArrayList<>();
		  names.addAll(Arrays.asList("Almaz", "Ibrohim","Tabriz"));
		  names.addAll( Arrays.asList(allNames) );
		System.out.println(names);
		
		
	  //RemoveAll(Interface):
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,4,4));
            numbers.removeAll( Arrays.asList(1,2) ); 
            
        System.out.println(numbers);

		//remove() method is not designed to be used in any loop.
		
		//ArrayList sorting:
		
		Integer[] array= {1000,900,80,765,123,542};
		
		ArrayList<Integer> price= new ArrayList<>();
		price.addAll(Arrays.asList(array) );
		
		System.out.println(price);
		
		Collections.sort(price); //sorts the ArrayList in ascending order.
		System.out.println(price);
		
	}
}
