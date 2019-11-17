package day24_Java_Review;
import java.util.Scanner;

public class Timer {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the minutes");
	int minutes=scan.nextInt();
	for(int i=minutes; i>0;--i) {
		if(i<0) {
			break;
		}
	
	for(int z=59;z>0;--z) {
		System.out.println((i-1)+" minutes and "+z+" seconds left");
	}
	}
}
}
