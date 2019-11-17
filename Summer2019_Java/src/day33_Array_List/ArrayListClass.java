package day33_Array_List;
import java.util.ArrayList;

public class ArrayListClass {
	/*
	 ArrayList<nonPrimitive> variableName= new ArrayList<nonPrimitive>();
	 ArrayLsit<nonPrimitive> variableName= new ArrayList<>();  preferred one.
	 => ArrayList does not accept primitives.
	 =>
	 */

   public static void main(String[] args) {
	//Declaration of ArrayList:
	   ArrayList<String> list= new ArrayList<String>();
	   ArrayList<String> list2= new ArrayList<>();
   
	   
  // add(object): adds object to the arraylist
	   ArrayList<String> shoppingList= new ArrayList<>();
	   shoppingList.add("apple");
	   shoppingList.add("orange");
	   shoppingList.add("grape");
	   System.out.println(shoppingList);
	   
  //add(index,object): adds the object at the specified index number.
	   shoppingList.add("strawberry");  //adds the object at the last index
	   shoppingList.add(1,"strawberry"); //adds this object at the given index number.
	   System.out.println(shoppingList);
	    // shoppingList.add(5, "blueberries"); this will give out of bound error, because in ArrayList  it does not allow you to skip indexes.
	   
	ArrayList<Integer> numbers= new ArrayList<>();
	numbers.add(0, 5);
	numbers.add(1, 10);
	numbers.add(2, 15);
	
	numbers.add(1, 1); //[5,1,10,15]  in this case, when assigning a new value to an existing index, 
	                                 //it will shift the previous one to the next index.
	System.out.println(numbers);

	
   //get(index number): returns the object.
	ArrayList<String> names= new ArrayList<>();
	names.add("Homayra");
	names.add("Meri");
	names.add(1, "Mikrigul");
	names.add(1, "Tabriz");
	names.add(0, "Asiya");
	
	String str1=names.get(1);
	System.out.println(str1);
	
 // size(): gives you the length of the arrayList as an int value.
	int length= names.size();
	System.out.println(length); //5
	
  //clear(): removes everything from arraylist.
	names.clear();
	System.out.println(names); //empties the arraylist
	
  //set(index number, object): the given object will replace the object at the given index number.
	ArrayList<String> Javangers= new ArrayList<>();
	Javangers.add("ferhat");
	Javangers.add("Lexi");
	Javangers.add("Asiya");
	Javangers.add("Ozgen");
	Javangers.add("Alex");
	Javangers.add("Safwan");
	System.out.println(Javangers);
	Javangers.set(2, "Shawkrat");
	System.out.println(Javangers);
	
  //contains(object):this method checks if the object is contained in the arraylist and returns a boolean value.
	ArrayList<String> goodGuys = new ArrayList<>();
    goodGuys.add("Hakan");
    goodGuys.add("Ihsan");
    goodGuys.add("Tim");
    goodGuys.add("Ibrohim");
    goodGuys.add("Dilyar");
    
    boolean result = goodGuys.contains("Tim");
    System.out.println(result);
    
 //equals(ArraysList): checks if two arraylists are equal or not and returns a boolean value.
    ArrayList<String> badGuys = new ArrayList<>();
    badGuys.add("Hakan");
    badGuys.add("Ihsan");
    badGuys.add("Tim");
    badGuys.add("Ibrohim");
    badGuys.add("Dilyar");

    boolean result2 = badGuys.equals(goodGuys);  // false
        System.out.println(result2);
        

     if( goodGuys.contains("Ibrohim") && badGuys.contains("Ibrohim")) {
        System.out.println("Ibrohim is good guy");
}
     
 //remove(int): removes the index number.
     ArrayList<Integer> lists= new ArrayList<>();
     lists.add(1);
     lists.add(2);
     lists.add(3);
     lists.add(4);
     lists.add(5);
     
     lists.remove(1);
     lists.remove(2);
     lists.remove(1);
     System.out.println(lists);   //remove method removes an object at the given index number from array list and adjusts the size accordingly.
     System.out.println(lists.size());
     
 // remove(Integer): removes the first matching object, at the same time returning you a boolean value.
    
     ArrayList<Integer>    lists2 = new ArrayList<>();
     lists2.add( 1 ); // auto-boxing   index: 0
     lists2.add( 2 ); // auto-boxing   index: 1
     lists2.add( 3 ); // auto-boxing   index: 2
     lists2.add( 4 ); // auto-boxing   index: 3
     lists2.add( 5 ); // auto-boxing   index: 4
     
     Integer a=8;
     boolean result1= lists2.remove(a);
     System.out.println(lists2);
     System.out.println(result1);  //false
     
     ArrayList<String> city = new ArrayList<>(); 
     city.add("Miami");
     city.add("Miami");
     city.add("Gotham");
     city.add("Azarbaijan");
     city.add("Istanbul");
     city.add("Urumqi");   // [Miami, Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
    
     city.remove("Miami"); // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
    
     if(city.remove("Miami")) {
    	 city.remove(2);
     }
     city.add(3, "Azarbaijan");
     System.out.println(city);



	
	   
	   
	   
	  }
	
}
