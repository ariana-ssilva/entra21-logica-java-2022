package br.com.entra21.exercicio.comparando.dois.numeros.relacional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 - Faça um programa que informe se o 1º numero é maior que o 2º numero
		
		float numero1, numero2;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		numero2 = entrada.nextFloat();
		
		resultado = numero1 > numero2;
		System.out.println("O numero "+ numero1 + " é maior que o numero "+ numero2 + "? " + resultado);
		
		// 2 - Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero
		resultado = numero1 >= numero2;
		System.out.println("O numero "+ numero1 + " é maior/igual ao numero "+ numero2 + "? " + resultado);
		
		// 3 - Faça um programa que informe se o 1º numero é menor que o 2º numero
		resultado = numero1 < numero2;
		System.out.println("O numero "+ numero1 + " é menor que o numero "+ numero2 + "? " + resultado);
		
		//4 - Faça um programa que informe se o 1º numero é menor ou igual que o 2º numero
		resultado = numero1 <= numero2;
		System.out.println("O numero "+ numero1 + " é menor/igual que o numero "+ numero2 + "? " + resultado);
	}
}
