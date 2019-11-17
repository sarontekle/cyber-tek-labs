package day34_Constructors;

import java.util.ArrayList;

public class WarmUp {
/*
    Warm up:
    1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
    2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
    3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
    4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
    5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)

 */
	public static void main(String[] args) {
		//Task01:
		String str="aabbccffggg";
		System.out.println(RemDup(str));
		//Task02:
		int count= Occurence("abaaafffbddd", "c");
		System.out.println(count);
		//Task03:
		System.out.println(Frequency("aabbbdddfffhhh"));
		//Task04:
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(0);
		list.add(30);
		
		int num= maximum(list);
		System.out.println(num);
		//Task05:
		int num2=minimum(list);
		System.out.println(num2);
	}
	//Task01:
	public static String RemDup(String str) {
		String result="";
		for(int i=0; i<str.length();i++) {
			if(!result.contains(str.substring(i,i+1) ) ) {
				result+=str.substring(i,i+1);
			}
		}
		return result;
	}

    //Task02:
	public static int Occurence(String a, String b) {
		int count=0;
		
		while(a.contains(b)) {
			count++;
			a=a.replaceFirst(b,"");
			
		}
		return count;
	}
    //Task03:
    public static String Frequency(String str) {
    	String nonDup=RemDup(str);
    	String result="";
    	for(int i=0; i<nonDup.length();i++) {
    	int count=Occurence(str, nonDup.substring(i,i+1));
    	result+=""+nonDup.substring(i,i+1)+count;
    	}
    	return result;
    }
    //Task04:
    public static int maximum(ArrayList<Integer> list) {
    	int max=Integer.MIN_VALUE;
    	
    	for(int each: list) {
    		if(each>max) {
    			max=each;
    		}
    	}
    	return max;
    }
    //Task05:
    public static int minimum(ArrayList<Integer> list) {
    	int min=Integer.MAX_VALUE;
    	for(int each: list) {
    		if(each < min) {
    			min=each;
    		}
    	}
    	return min;
    }
}
