package br.com.entra21.exercicio.comparando.dois.numeros.relacional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 - Fa�a um programa que informe se o 1� numero � maior que o 2� numero
		
		float numero1, numero2;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		numero2 = entrada.nextFloat();
		
		resultado = numero1 > numero2;
		System.out.println("O numero "+ numero1 + " � maior que o numero "+ numero2 + "? " + resultado);
		
		// 2 - Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero
		resultado = numero1 >= numero2;
		System.out.println("O numero "+ numero1 + " � maior/igual ao numero "+ numero2 + "? " + resultado);
		
		// 3 - Fa�a um programa que informe se o 1� numero � menor que o 2� numero
		resultado = numero1 < numero2;
		System.out.println("O numero "+ numero1 + " � menor que o numero "+ numero2 + "? " + resultado);
		
		//4 - Fa�a um programa que informe se o 1� numero � menor ou igual que o 2� numero
		resultado = numero1 <= numero2;
		System.out.println("O numero "+ numero1 + " � menor/igual que o numero "+ numero2 + "? " + resultado);
	}
}
