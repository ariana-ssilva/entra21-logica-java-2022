package br.com.entra21.exercicio.comparando.dois.numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fa�a um programa que compare 2 n�meros e informe se o 1� � igual ao 2� numero
		
		float numero1, numero2;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		numero2 = entrada.nextFloat();
		
		resultado = numero1 == numero2;
		System.out.println("O numero "+ numero1 + " � igual ao numero "+ numero2 + "? " + resultado);
		
		//Fa�a um programa que compare 2 n�meros e informe se o 1� � diferente do 2� numero
		resultado = numero1 != numero2;
		System.out.println("O numero "+ numero1 + " � diferente ao numero "+ numero2 + "? " + resultado);
		

	}

}
