package br.com.entra21.graus.celsius.em.fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// Faça um programa que converta graus Celsius em Fahrenheit. 
	//A formula para converter é multiplicar a temperatura celsius por 1.8 e somar 32 ao resultado */

	    double grausCelsius, grausConvertidosEmFahrenheit;

	    Scanner entrada = new Scanner (System.in);

	    System.out.println("Digite a temperatura a ser convertida em graus Fahrenheit:");
	    grausCelsius = entrada.nextFloat();

	    grausConvertidosEmFahrenheit = (grausCelsius * 1.8) + 32;

	    System.out.println("A temperatura é de " + grausConvertidosEmFahrenheit + "°");

	}

}
