package br.com.entra21.exercicio.grau.fahrenheit.em.celsius;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Faça um programa que converta graus Celsius em Fahrenheit. A formula para
		// converter é multiplicar a temperatura celsius por 1.8 e somar 32 ao resultado
		// */

		double grausFahrenheit, grausConvertidosEmCelsius;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a temperatura a ser convertida em graus Celsius:");
		grausFahrenheit = entrada.nextFloat();

		grausConvertidosEmCelsius = 32 - (grausFahrenheit / 1.8);

		System.out.println("A temperatura é de " + grausConvertidosEmCelsius + "°");

	}

}
