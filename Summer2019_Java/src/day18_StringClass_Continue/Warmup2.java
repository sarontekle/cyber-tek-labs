package day18_StringClass_Continue;
import java.util.Scanner;

public class Warmup2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName=sc.nextLine();  //mUhtAr
		firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
		System.out.println(firstName);
		
		System.out.println("Enter your last name");
		String lastName=sc.nextLine(); //cYBerTeK
		lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
		System.out.println(lastName);
		System.out.println(firstName+" "+lastName);
		
	}

}
