package br.com.entra21.exercicio.comparando.dois.numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Write a program to compare 2 numbers and inform if the 1st is equal to the
		 * 2nd number
		 */

		float number1, number2;
		boolean result;

		Scanner enter = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1 = enter.nextFloat();

		System.out.println("Enter the second number:");
		number2 = enter.nextFloat();

		result = number1 == number2;
		System.out.println("The number " + number1 + " is equal to the number " + number2 + " ? " + result);

		/*
		 * Write a program to compare 2 numbers and inform if the 1st is different from
		 * // the 2nd number
		 */
		result = number1 != number2;
		System.out.println("The number " + number1 + " is different from the number " + number2 + " ? "
		+ result);
	}
}
