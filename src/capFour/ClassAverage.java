package capFour;

import java.util.Scanner;

// Resolvendo o problema da m�dia da classe usando a repeti��o controlada por contador.
public class ClassAverage {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int  gradeCounter = 1;
		
		while(gradeCounter <= 10) {
			
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total += grade;
			gradeCounter++;
			
		}
			
		int average = total / 10;
		
		System.out.printf("%nTotal of all 10 grade is %d%n", total);
		System.out.printf("Class average is %d%n", average);
		
		
	}

}
