package capTwoo;

import java.util.Scanner;
//Programa de adição que insere dois números, então exibe a soma deles.

public class Addition {
	
	public static void main(String [] args) {
	
	// cria um Scanner para obter a entrada a partir da janela de comando
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: "); //prompt
	int number1 = input.nextInt(); // primeiro numero a somar
	
	System.out.print("Enter second integer: "); //prompt
	int number2 = input.nextInt(); // segundo numero a somar
	
	System.out.printf("sum is: %d", (number1 + number2));// realiza o calculo e exibe a soma
		
	}
	
}
