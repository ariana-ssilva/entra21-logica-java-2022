package br.com.entra21.exercicio.comparando.dois.numeros.relacional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write a program that informs if the 1st number is bigger than the 2nd number

		float number1, number2;
		boolean result;

		Scanner enter = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1 = enter.nextFloat();

		System.out.println("Enter the second number:");
		number2 = enter.nextFloat();

		result = number1 > number2;
		System.out.println("The number " + number1 + " is bigger than the number " + number2 + "? "
				+ result);

		 /* 2 - Write a program that informs if the 1st number is greater than or equal
		 * to the 2nd number
		 */

		result = number1 >= number2;
		System.out.println("The number " + number1 + " is bigger/equal to the number " + number2 + "? "
				+ result);

		/* 3 - Write a program that informs if the 1st number is smaller than the 2nd
		 * number
		 */
		result = number1 < number2;
		System.out.println("The number " + number1 + " is smaller than the number " + number2 + "? " 
				+ result);

		/* 4 - Write a program that informs if the 1st number is smaller than or equal  to the 2nd
		 number*/
		result = number1 <= number2;
		System.out.println("The number " + number1 + " is smaller/equal to the number  " + number2 + "? " 		
				+ result);
	}
}
