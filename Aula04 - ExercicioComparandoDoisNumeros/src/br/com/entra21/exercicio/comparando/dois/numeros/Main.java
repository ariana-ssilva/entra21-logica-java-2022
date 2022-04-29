package br.com.entra21.exercicio.comparando.dois.numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que compare 2 números e informe se o 1º é igual ao 2º numero
		
		float numero1, numero2;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		numero2 = entrada.nextFloat();
		
		resultado = numero1 == numero2;
		System.out.println("O numero "+ numero1 + " é igual ao numero "+ numero2 + "? " + resultado);
		
		//Faça um programa que compare 2 números e informe se o 1º é diferente do 2º numero
		resultado = numero1 != numero2;
		System.out.println("O numero "+ numero1 + " é diferente ao numero "+ numero2 + "? " + resultado);
		

	}

}
