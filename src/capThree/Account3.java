package capThree;

import java.io.PrintStream;

public class Account3 {
	
	private String name;
	
	private double balance;
	
	public Account3 (String name, double initialBalance) {
		
		this.name = name;
		
		if(initialBalance > 0.0) {
			
			this.balance = initialBalance;
		}	
	}
	
	public void deposit(double depositAmount) {
		
		if(depositAmount > 0.0) {
			
			this.balance += depositAmount;
			
		}	
	}
	
	public Double getBalance() {
		
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void displayAccount(Account3 account) {
		
		 System.out.printf("%s balance: R$%.2f %n", account.getName(), account.getBalance());
		
	}
	

}
