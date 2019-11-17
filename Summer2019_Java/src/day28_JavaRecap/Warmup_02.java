package day28_JavaRecap;

public class Warmup_02 {
    /*
    3. write a method that accepts 3 parameters: 2 numbers and one operator, and prints out the calculation 
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10,2, "*") ==> 20;
    4. write a method that can calculate grade
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score

     */
	
	public static void main(String[] args) {
		
		Calculate(10,3,"/");
		CalculateGrades(85);
		
	}
	
	public static void Calculate(int a, int b, String operator) {
		String result="";
		if(operator.equals("-")) {
			result+=(a-b);
		} else if(operator.equals("+")) {
			result+=(a+b);
		}else if(operator.contentEquals("*")) {
			result+=(a*b);
		}else if(operator.contentEquals("/")) {
			result+=(a/b);
		}else if(operator.contentEquals("%")) {
			result+=(a%b);
		}else {
			result="Invalid";
		}
		System.out.println(result);
		
		String result2="";
		result2+=(operator.equals("-"))?(a-b):
			(operator.equals("+"))?(a+b):
				(operator.contentEquals("*"))?(a*b):
					(operator.contentEquals("/"))?(a/b):
						(operator.contentEquals("%"))?(a%b):
							"Invalid";
	}
	
	public static void CalculateGrades(int score) {
		
		char Grade=(score>=90 && score<=100)? 'A':
			         (score>=80 && score<=89)? 'B':
		               (score>=70 && score<=79)? 'C':
		            	   (score>=60 && score<=69)? 'D':
		            		   (score>=0 && score<=59)? 'F':
		            			   'I';
		if(Grade=='I') {
			System.out.println("Invalid Score");
		}else {
			System.out.println(Grade);
		}
		
	}
	
}
