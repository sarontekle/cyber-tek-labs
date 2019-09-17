package day21_whileLoops;
import java.util.Scanner;

public class While_Loop {
	/*
	 While loops: 
	 while(condition){
	   Statement;
	   }  loop gets executed as long as condition is true
	   - a repeating if statement.
	 */
	public static void main(String[] args) {
		int a=9;
		while(a>8) {
			a--;
			System.out.println("Hello "+ a);

		}
		
		String sentence="I like books, I read books";
		int count=0;
		while(sentence.contains("book")) {
			count++;
			sentence=sentence.replaceFirst("book", "");
		}
		System.out.println(count);
		
		while (true) {
			System.out.println("hello");
			break;// forcefully exits the while loop 
		}
		int i=0;
		while (true) {
			i++;
			System.out.println("Hello "+i);
			if(i==5) {
				break;
			}
		}
		for (int z=1; z<=100; z++) {
			if(z%2==0) {
				System.out.print(z+" ");
			}
		}
		/*
		 Converting for loops to while loops:
		 initialization;
		 while(condition){
		 statement;
		 iterator;
		 }
		 */
		int x=1;
		while(x<=100) {
			if(x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		}
		System.out.println("================");
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Starting number");
		int start= scan.nextInt(); //10
		System.out.println("Ending number");
		int end=scan.nextInt();
		/*
		 for(int j=start; j<=end; j++) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
		}
		 */
		int j=1;
		while(j<=end) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
			j++;
		}
		
	}

}
