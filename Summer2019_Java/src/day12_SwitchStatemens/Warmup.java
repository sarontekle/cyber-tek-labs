package day12_SwitchStatemens;

public class Warmup {
	/*
	 Warm up:
	 declare 3 numbers
	 if n1 and n2 are equal
	  ==>n1 and n2 are equal
	  if n2 and n3 are equal
	    ==>n2 and n3 are equal
	  if n1 and n3 are equal
	    ==>n1 and n3 are equal
	  if all are equal==. all equal
	  if none of them are equal==> none of them are equal
	  Do not use single if statements	  
	 */
	public static void main(String[] args) {
		int n1=12, n2=12, n3=12;
		if(n1==n2 && n1!=n3) {   //multi-branch
			System.out.println(" n1 and n2 are equal");
		}
		else if(n2==n3 && n2!=n1) {
			System.out.println("n2 and n3 are equal");
		}
		else if(n1==n3 && n1!=n2) {
			System.out.println("n1 and n3 are equal");
		}
		else if(n1==n2 && n2==n3 && n1==n3) {
			System.out.println("all the numbers are equal");
		}
		else {
			System.out.println("None of the numbers are equal");
		}
		int N1=12, N2=23, N3=23;
		if(N1>=0 && N2>=0 && N3>=0) {
			if(N1==N2) {
				System.out.println("N1 and N2 are equal");
			}
			else if(N2==N3) {
				System.out.println("N2 and N3 are equal");
			}
			else if(N1==N3) {
				System.out.println("N1 and N3 are equal");
			}
		}
		else {
			System.out.println("All of them are equal");
		}
	}

}
