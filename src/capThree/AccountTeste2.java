package capThree;

public class AccountTeste2 {
	
	public static void main(String[] args) {
		
		// cria dois objetos Account
		Account2 account1 = new Account2("Jane Green");
		Account2 account2 = new Account2("John Blue");
		
		// exibe o valor inicial de nome para cada Account
		System.out.printf("account1 name is: %s%n", account1.getName());
		
		System.out.printf("account2 name is: %s%n", account2.getName());
			
		
	}

}
