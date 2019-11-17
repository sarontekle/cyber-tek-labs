package day48_Method_OverRiding;

public class Bank {
	/*
	 OverRiding rules:
	 =>Methods MUST be overridden in sub class only
	 => only instance methods can be overridden
	 => constructors and static methods can NOTbe overridden
	 =>methods with private access modifiers can not be overridden.
	 => override methods need to be have the same or more visible access 
	 modifiers than the original method.
	 BENEFITS:
	 - readable
	 - reusable
	 - flexible
	 */

	public void InterestRate() {
		System.out.println("9 percent");
	}
	public static void main(String[] args) {
		
		BankOfAmerica BOA= new BankOfAmerica();
		BOA.InterestRate();
		
		PNC objPNC= new PNC();
		objPNC.InterestRate();
		
		CapitalOne objOne= new CapitalOne();
		objOne.InterestRate();
		
		
		
		
		
		
	}

}
class BankOfAmerica extends Bank{
	@Override //this annotation lets you make sure that the method has been overridden 
	public void InterestRate() {
		System.out.println("6 percent");
	}
}

class PNC extends Bank{
	@Override
	public void InterestRate() {
		System.out.println("5 percent");
	}
}

class CapitalOne extends Bank{
	@Override
	public void InterestRate() {
		System.out.println("7 percent");
	}
}

