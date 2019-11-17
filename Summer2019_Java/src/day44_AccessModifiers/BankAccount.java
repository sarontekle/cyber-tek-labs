package day44_AccessModifiers;

public class BankAccount {
	/*
	 WarmUp: creata a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountName, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requirement:
            1. apply encapsulations
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
	 
	 */
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	public String getAccountHolder() {
		return AccountHolder;
	}
	public String getAccountNumber() {
		
		String AccntNum=Long.toString(AccountNumber).substring(12);
		return AccntNum;
	}
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	
	public void setInfo(String AccountHolder, long AccountNumber) {
		this.AccountHolder=AccountHolder;
		this.AccountNumber=AccountNumber;
		
	}
	
	//Actions:
	  //deposit:
	public void deposit(double amount) {
		AvailableBalance+=amount;
	}
	   //withdraw:
	public void withdraw(double amount) {
		if(amount>AvailableBalance) {
			AvailableBalance-=(amount+35);
		}else if(AvailableBalance<=0) {
			System.out.println("NOT ENOUGH IN ACCOUNT TO WITHDRAW");
		
		}else {
			AvailableBalance-=amount;
		}
		
	}
	  //checking balance:
	public void checkBalance() {
		System.out.println("Available Balance: "+AvailableBalance);
	}
	
	

}
