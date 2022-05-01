package br.com.entra21.exercicio.comparar.numeros.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Capturar 2 números e informar qual é o maior
		
		Scanner entrada = new Scanner(System.in);
		
		byte numeroA, numeroB;
		
		System.out.println("Digite o primeiro numero:");
		numeroA = entrada.nextByte();
		
		System.out.println("Digite o segundo numero:");
		numeroB = entrada.nextByte();
		
		if(numeroA > numeroB) {
			System.out.println("O primeiro numero é maior");
		} else if(numeroA == numeroB){
			System.out.println("Os numeros são iguais");
		} else {
			System.out.println("O segundo numero é maior ");
		}
	}
}
