package br.com.entra21.exercicio.grau.fahrenheit.em.celsius;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	/* Write a program that converts degrees Fahrenheit to Celsius.
	 * The formula for converting is subtract temperature by 32 and divide by 1.8*/

		double fahrenheitDegrees, degressToCelsius;

		Scanner enter = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit:");
		fahrenheitDegrees = enter.nextFloat();

		degressToCelsius = 32 - (fahrenheitDegrees / 1.8);

		System.out.println("The temperature converted to Celsius is " + degressToCelsius + "°");

	}

}
