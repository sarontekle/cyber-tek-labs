package day18_StringClass_Continue;

public class StringMethods_Boolean {
	public static void main(String[] args) {
		/*
		 isEmpty(): checks if the string value is empty 
		 and returns a boolean expression
		 empty==>true, !empty==>false
		 */
		String str="Cybertek";
		boolean R1= str.isEmpty();
		System.out.println(R1); //false
		
		String str2="";
		if(str2.isEmpty()) {
			//true
			System.out.println("it's empty String");
		}else {
			System.out.println("it's not empty");
		}
		/*
		 equals(str):checks if the two string's face values are equal or not.
		 true if values are equal, false if values are unequal.
		 */
		String A1="Cybertek";
		String A2=new String("Cybertek");
		System.out.println(A1==A2); //false // this also checks the memory and value at the same time giving us false.
		boolean R2=A1.equals(A2);
		System.out.println(R2); //true
		
		/*
		 equalIgnoreCase(str): looks at two String values, ignores the case sensitivity 
		 and gives a true or false expression based on value.
		 */
		String s1="JAVA";
		String s2=new String("java");
		System.out.println(s1==s2); //false
		boolean R3=s1.equals(s2);
		System.out.println(R3); //false, because of case sensitivity.
		boolean R4=s1.equalsIgnoreCase(s2);
		System.out.println(R4); //true because it ignores the case sensitivity.
		
		
				
	/*
	 contains(str): checks if str is contained in the string value, and returns a boolean expression.
	 true if it is contained, false if not.
	 */
		String name="Muhtar";
		boolean result=name.contains("ABC");
		System.out.println(result); //false
		
		String name2="Marufjon";
		System.out.println(name2.contains("m"));  // false because of case sensitivity
		
		/*
		 startsWith(str): checks if string value starts with str or not, then returns you a boolean expression.
		 startedwith==>true   !startedwith==>false
		 */
		String Today="Java";
		boolean result2=Today.startsWith("J");
		System.out.println(result2); //true
		
		/*
		endsWith(str): checks if the string ends with the given str, then gives a boolean expression.
		endswith==> true   !endswith==>false
		 */
		String B1="Muhtar";
		System.out.println(B1.endsWith("r"));//true
		System.out.println(B1.endsWith("M")); //false
		
	}

}
