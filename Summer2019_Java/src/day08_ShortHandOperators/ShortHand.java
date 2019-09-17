package day08_ShortHandOperators;

public class ShortHand {
	/*
	 +=: addition assignment. x+=y; x=x+y.
	 -=: subtraction assignment. x-=y; x=x-y.
	 *=: multiplication assignment. x*=y; x=x*y.
	 /=: division assignment. x/=y; x=x/y.
	 %=: remainder assignment.   x%=y; x=x%y.
	 
	 */
	public static void main(String[] args) {
		// +=:
		int a=9;
		//a=a+3; 12
		a+=3;//a=a+3
		System.out.println(a);
		
		int b=a+=5;   //12+=5==>12+5 ==>17.
		System.out.println(b);
		 
		int c=a+=b;
		// 17+=17=34;
		System.out.println(c);
		int d=a+=c; //a=68,d=68, c=34, b=17
		//34+34
		System.out.println(d);
		
		int e=(d+=b)*2;
		// d+b=d; 68+17=85*2=170
		System.out.println(e); //d=85, b=17, e=170
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		
		int f= b+=d*2;
		//b+=170
		// 17+=170==>187
		System.out.println(f);
		
		int g=101;
		int h=g-=1;
		//101-1=100
		System.out.println(h); //100
		
		int i=g+=h+5;  //100+=100+5==>205
		System.out.println(i); //g=205,i=205,h=100;
		
		int j=h+=g%i;
		// 100+=205%205
		// 100+=0
		System.out.println(j); //h=100, j=100
		
		int k=j-=h*2%5;
		// j-=200%5
		//100-0
		System.out.println(k);  //j=100
		
//		*=:
		int A=100;
		A*=200;
		System.out.println(A);//==>20000;
		
		int B=100;
		B*=100/10;
		System.out.println(B); //==>1000
		
		B*=B-1000;
		// 1000-1000==>0
		System.out.println(B);
		
// /=:
		int C=1000;
		C/=5;
		System.out.println(C); //C=200
		int D=10;
		C/=D+10;  //C/=20==>10
		System.out.println(C);
		
// %=:
		int Z=10%3; //==>10/3=3. ...  remainder: 10-3*3=1
		int E=10;
		E%=2;  // E=10%2
		System.out.println(E); //0
		
		
	}

}
