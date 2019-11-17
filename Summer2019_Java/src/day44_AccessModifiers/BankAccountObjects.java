package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountObjects {
	public static void main(String[] args) {
		BankAccount person1= new BankAccount();
		
		person1.setInfo("Rahwa", 1234567891234567L);
		System.out.println("Account holder: "+person1.getAccountHolder());
		System.out.println("Account number: ************"+person1.getAccountNumber());
		System.out.println("Available balance: "+person1.getAvailableBalance());

		person1.deposit(2000);
		person1.checkBalance();//2000
		
		person1.withdraw(2500);
		person1.checkBalance();
		person1.deposit(15000);
		person1.checkBalance();
		System.out.println("================================================================");
		BankAccount person2= new BankAccount();
		 person2.setInfo("Serkan", 9876543219876543L);
		 System.out.println("Account holder: "+person2.getAccountHolder());
		 System.out.println("Account number: ************"+person2.getAccountNumber());
		 System.out.println("Available balance:"+person2.getAvailableBalance());
		 
		 person2.deposit(3000);
		 person2.checkBalance();
		 person2.withdraw(560);
		 person2.checkBalance();
		 
		 BankAccount[] accounts= {person1, person2};
		 ArrayList<BankAccount> Accnts= new ArrayList<>();
		 Accnts.addAll(Arrays.asList(accounts));
		
		
		
		
		
	}

}
