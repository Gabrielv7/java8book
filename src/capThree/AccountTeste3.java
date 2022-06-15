package capThree;

import java.util.Locale;
import java.util.Scanner;

public class AccountTeste3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
				
		Account3 account1 = new Account3("Jane Green", 50.00);
		Account3 account2 = new Account3("John Blue", -7.53);
		
		Account3.displayAccount(account1);
		Account3.displayAccount(account2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		Account3.displayAccount(account1);
		Account3.displayAccount(account2);
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		Account3.displayAccount(account1);
		Account3.displayAccount(account2);
		
	}
	
}
