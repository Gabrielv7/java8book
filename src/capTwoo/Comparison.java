package capTwoo;

import java.util.Scanner;

//Compara inteiros ultilizando instruções if, operadores relacionais e operadores de igualdade.
public class Comparison {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.printf("Enter second integer: ");
		int number2 = input.nextInt();
		
		if(number1 == number2) {
			
			System.out.printf("%d == %d%n", number1, number2);
			
		}
		
		if(number1 != number2) {
			
			System.out.printf("%d != %d%n", number1, number2);
			
		}
		
		if(number1 < number2) {
			
			System.out.printf("%d < %d%n", number1, number2);
			
		}
		
		if(number1 > number2) {
			
			System.out.printf("%d > %d%n", number1, number2);
			
		}
		
		if(number1 <= number2) {
			
			System.out.printf("%d <= %d%n", number1, number2);
			
		}
		
		if(number1 >= number2) {
			
			System.out.printf("%d >= %d%n", number1, number2);
			
		}
	
	}

}
