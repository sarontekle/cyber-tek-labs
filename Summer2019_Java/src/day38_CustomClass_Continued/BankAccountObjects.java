package day38_CustomClass_Continued;

public class BankAccountObjects {

	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		
		account1.AccntHolder = "Nahom Negassi";
		account1.AccntNumber = 1234567891011121L;
		account1.Balance = 500;
		System.out.println("------------------------------------------");

		account1.ShowBalance();
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		account1.Deposit(2000);
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		account1.WithDraw(1000);
		System.out.println("------------------------------------------");
		
		System.out.println("=================================================");
		
		BankAccount account2= new BankAccount();
		account2.AccntHolder = "Muaz Gulen";

		

		
	}
	
}
