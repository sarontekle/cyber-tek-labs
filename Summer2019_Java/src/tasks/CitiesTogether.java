package tasks;

public class CitiesTogether {
public static void main(String[] args) {
	String city1="Tashkent";
	String city2="Kyiv";
	String city3="Moscow";
	/*
	    From Tashkent to Kyiv is $500
        From Moscow to Tashkent is $550
        I have been to Tashkent, Moscow, Kyiv.
	 */
	System.out.println("From "+city1+" to "+city2+" is $500");
	System.out.println("From "+city3+" to "+city1+" is $550");
	System.out.println("I have been to "+city1 +", "+city3+", "+city2);
	
}
}
