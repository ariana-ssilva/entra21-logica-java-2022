package br.com.entra21.exercicio.comparar.numeros.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Capturar 2 n�meros e informar qual � o maior
		
		Scanner entrada = new Scanner(System.in);
		
		byte numeroA, numeroB;
		
		System.out.println("Digite o primeiro numero:");
		numeroA = entrada.nextByte();
		
		System.out.println("Digite o segundo numero:");
		numeroB = entrada.nextByte();
		
		if(numeroA > numeroB) {
			System.out.println("O primeiro numero � maior");
		} else if(numeroA == numeroB){
			System.out.println("Os numeros s�o iguais");
		} else {
			System.out.println("O segundo numero � maior ");
		}
	}
}
