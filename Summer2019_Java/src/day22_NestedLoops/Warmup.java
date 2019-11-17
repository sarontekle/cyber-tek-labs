package day22_NestedLoops;

public class Warmup {
	
	public static void main(String[] args) {
		/*
		 write a java program that prints out numbers from 1 to 30
		 numbers divisible by 3==> print out "FIN"
		 numbers divisible by 5==>print "RA"
		 numbers divisible by both==> print "FINRA"
		 
		String str="";
		int i=1;
		while(i<=30) {
		if(i%5==0 && i%3==0) {
		str+="FINRA ";
		}
		else if(i%3==0) {
			 str+= "FIN ";
			}
		else if (i%5==0) {
				str+="RA ";
			}
		else {
		
				str+=i+" ";
		}
			
			i++;
		}*/
		
		//Write a java program that will check if the given word is a palindrome.
		String original="abcdefg";
		     // index:   0123456
		 // rev index:   6543210
		String Reverse="";
		for (int i=original.length()-1; i>=0; i--) {
			Reverse += original.substring(i,i+1);
		}
		
		
		System.out.println(Reverse);
		
	}

}
