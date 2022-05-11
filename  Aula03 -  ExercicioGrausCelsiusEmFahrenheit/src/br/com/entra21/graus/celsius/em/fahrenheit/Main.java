package br.com.entra21.graus.celsius.em.fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/* Write a program that converts degrees Celsius to Fahrenheit.
	* The formula to convert is: to multiply the temperature celsius by 1.8 and add 32 to the result */
	    double celsiusDregees, degressToFahrenheit;

	    Scanner input = new Scanner (System.in);

	    System.out.println("Enter the temperature in Celsius:");
	    celsiusDregees = input.nextFloat();

	    degressToFahrenheit = (celsiusDregees * 1.8) + 32;

	    System.out.println("The temperature converted to Fahrenheit is  " + degressToFahrenheit + "�");

	}

}
