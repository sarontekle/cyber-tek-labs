package tasks;
import java.util.Scanner;

public class Repit {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a word: ");
	String word=scan.nextLine();
	for(int i=word.length()-1;i>=0;i--) {
	if(word.length()>5) {
		System.out.println("Too long!");
	}else if(word.length()<5) {
		System.out.println("too short!");
	} else if(word.length()==5) {
		
			word=""+word.charAt(i);
			System.out.print(word);
		}
	}
}
}
