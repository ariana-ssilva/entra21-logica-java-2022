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

		System.out.println("Digite o primeiro n�mero:");
		numeroA = calcular.nextFloat();

		System.out.println("Digite o segundo n�mero:");
		numeroB = calcular.nextFloat();

		System.out.println("As opera��es que voc� pode escolher s�o as seguintes:");
		System.out.println("---------------------------------------------------- ");
		System.out.println("( 1 ) - Adi��o       ( 2 ) - Subtra��o");
		System.out.println("( 3 ) - Divis�o      ( 4 ) - Multiplica��o");
		System.out.println("( 0 ) - SAIR");
		System.out.println("---------------------------------------------------- ");
		System.out.println("Digite o n�mero que corresponde � op��o desejada:");
		operacaoDesejada = calcular.nextByte();
		
		
		// Validando a opera��o escolhida
		switch (operacaoDesejada) {
		case 1:
			soma = numeroA + numeroB;
			System.out.println(" A SOMA de " + numeroA + " + " + numeroB + " � de : " + soma);
			break;

		case 2:
			subtracao = numeroA - numeroB;
			System.out.println(" A SUBTRA��O de " + numeroA + " - " + numeroB + " � de : " + subtracao);
			break;

		case 3:
			divisao = numeroA / numeroB;
			System.out.println(" A DIVIS�O de " + numeroA + " / " + numeroB + " � de : " + divisao);
			break;

		case 4:
			multiplicacao = numeroA * numeroB;
			System.out.println(" A MULTIPLICA��O de " + numeroA + " * " + numeroB + " � de : " + multiplicacao);
			break;
		
		case 0:
			System.out.println("SAINDO...");
			System.exit(0);
			
		default:
			System.out.println("Opera��o inv�lida");
			System.exit(0);
		}
	}

}
