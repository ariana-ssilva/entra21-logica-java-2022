package br.com.entra21.calculadora.em.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Vamos calcular?");
		calculadoraJava();

	}

	public static void calculadoraJava() {
		float numeroA, numeroB, soma, subtracao, multiplicacao, divisao;
		byte operacaoDesejada;
		Scanner calcular = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		numeroA = calcular.nextFloat();

		System.out.println("Digite o segundo número:");
		numeroB = calcular.nextFloat();

		System.out.println("As operações que você pode escolher são as seguintes:");
		System.out.println("---------------------------------------------------- ");
		System.out.println("( 1 ) - Adição       ( 2 ) - Subtração");
		System.out.println("( 3 ) - Divisão      ( 4 ) - Multiplicação");
		System.out.println("( 0 ) - SAIR");
		System.out.println("---------------------------------------------------- ");
		System.out.println("Digite o número que corresponde à opção desejada:");
		operacaoDesejada = calcular.nextByte();
		
		
		// Validando a operação escolhida
		switch (operacaoDesejada) {
		case 1:
			soma = numeroA + numeroB;
			System.out.println(" A SOMA de " + numeroA + " + " + numeroB + " é de : " + soma);
			break;

		case 2:
			subtracao = numeroA - numeroB;
			System.out.println(" A SUBTRAÇÃO de " + numeroA + " - " + numeroB + " é de : " + subtracao);
			break;

		case 3:
			divisao = numeroA / numeroB;
			System.out.println(" A DIVISÃO de " + numeroA + " / " + numeroB + " é de : " + divisao);
			break;

		case 4:
			multiplicacao = numeroA * numeroB;
			System.out.println(" A MULTIPLICAÇÃO de " + numeroA + " * " + numeroB + " é de : " + multiplicacao);
			break;
		
		case 0:
			System.out.println("SAINDO...");
			System.exit(0);
			
		default:
			System.out.println("Operação inválida");
			System.exit(0);
		}
	}

}
