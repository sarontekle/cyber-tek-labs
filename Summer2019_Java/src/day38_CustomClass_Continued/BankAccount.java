package day38_CustomClass_Continued;

public class BankAccount {
	/*
	 WarmUp:
    create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        requiremnts: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
	 */
	
	String AccntHolder;
	long AccntNumber;
	double Balance;
	
	public void ShowBalance() {
		String AccNum=""+AccntNumber;
		String xx="************" + AccNum.substring(12);
		System.out.println("Account Holder: " + AccntHolder);
		System.out.println("Account Number: "+ xx);
		System.out.println("Available Balance: $"+ Balance);
	}

	public void Deposit(double amount) {
		String AccNum=""+AccntNumber;
		String xx="************" + AccNum.substring(12);
		System.out.println("Depositing "+ amount+" to the account "+xx);
		Balance+=amount;
		System.out.println("New balance: $"+ Balance);
	}
	
	public void WithDraw(double amount) {
		if(Balance<=0) {
			System.out.println("No available balance account");
			return; //this exits the method WithDraw
		}
		String AccNum=""+AccntNumber;
		String xx="************" + AccNum.substring(12);
		System.out.println("Withdrawing "+amount+" from the account "+xx);
		Balance-=amount;
		if(Balance <0) {
			Balance-=35;
		}
		System.out.println("New balance: $"+Balance);
		
		
	}

	
	
	
	
	

}
