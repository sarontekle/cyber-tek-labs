package day13_Review;

public class qiuz {
	public static void main(String[] args) {
//		Q 2:
		boolean resultA=9>=9 || 10<=10,
		resultB='A'>=128 &&'B'<128;
		if(resultA) {
			if(resultB) {
				System.out.println(resultA);
			}
			else {
				System.out.println(resultB);
			}
		}
		
//		question:
		boolean Result=true;
		int N=100;
		if(Result) {  //true
			N/=10;  //N=100/10=10
			Result= !Result;  //false
		}
		if( Result) {//false
			N*=2;   //N=20
		}
		else {
			N-=5;   //N=5
		}
		System.out.println(N);
		
	}

}
