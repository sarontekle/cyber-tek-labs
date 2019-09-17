package day21_whileLoops;

public class Warmup {
	public static void main(String[] args) {
		
		// count of occurrence of a word in a sentence.
		String sentence="I like books, I have books,I need books";
		//         index:       z,  z+3+1==>book
		int count=0;
		for(int i=0; i<sentence.length()-3; i++) {
			//i can only be sentence.length()-1 since it is an index number
			// in the substring from i to i+4, to make it to 1 minus length it needs to have the operation-3 after it
			if(sentence.substring(i,i+4).equals("book")) {
				// substring(0,4)
				count++;
			}
			
		}
		System.out.println(count);
		
		
		String words="Cybertek is school, Cybertek is great, I love Cybertek";
		int nTimes=0;
		for(int i=0; i<words.length()-7; i++) {
			if (words.substring(i, i+8).equals("Cybertek")) {
				nTimes++;
			}
			
			
		}
		System.out.println(nTimes);
		
		/*
		 write a java program that can remove duplicated values from String.
		 input: aabbcc
		 output:abc
		 */
		
		String s1="aabbcc";
		String result=""; //abc
		for(int i=0; i<s1.length(); i++) {
			if(!result.contains(s1.substring(i,i+1))) {
				result+=s1.substring(i,i+1);
			}
		}
		System.out.println(result);
	}

}
