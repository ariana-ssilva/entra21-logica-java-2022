package br.com.entra21.lacos.de.repeticaofor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre for");

		Scanner entrada = new Scanner(System.in);
		String opcao;
		System.out.println("MENU DO FOR");
		System.out.println("Escolha uma opção:");
		System.out.println(" 1 - for simples");
		System.out.println(" 2 - nested for");
		System.out.println(" 3 - Solicite ao usuário uma quantidade inicial e final, para exibir em tela a repetição do inicio até o final");
		System.out.println(" 4 - Solicite ao usuário um valor numero para exibir a contagem regressiva até o zero");
		System.out.println(" 5 - Retorne a tabuada do numero escolhido");
		System.out.println(" 6 - Retornar todas as tabuadas de 1 até a tabuada do numero informado pelo usuário");

		opcao = entrada.nextLine();

		switch (opcao.toLowerCase()) {
		case "1", "for simples":
			// função aula for simples
			aulaForSimples(); // função de procedimento não precisa de argumento e nem retorno
			break;

		case "2", "nested for":
			// sos ainda não sei
			aulaNestedFor(); // função de procedimento não precisa de argumento e nem retorno
			break;

		case "3":
			exercicioForLimite(); // função de procedimento não precisa de argumento e nem retorno
			break;
		case "4":
			contagemRegressiva();
			break;

		case "5":
			retornarTabuada(entrada.nextInt());
			break;

		case "6":
			exibirTodasAsTabuadas();
		}

	}

	public static void aulaForSimples() {
		System.out.println("Repetição simples de forma linear ede 1 em 1");
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {
			System.out.println("Repetindo o contador1 pela " + contador1 + "ª vez");
		}

		System.out.println("===============");

		System.out.println("O incremento ou decremento não precisa ser de 1 em 1");
		for (int contador2 = 1; contador2 <= 30; contador2 += 4) {
			System.out.println("Repetindo, mas pulando de 4 rm 4, o contador está em: " + contador2);
			// System.out.println("Repetindo "+contador1);
			// Não é possível usar a variavel contador1 pois ela só existe no outro escopo
			// do for.
		}

		System.out.println("===============");

		for (int contador3 = 10; contador3 <= -10; contador3--) {
			System.out.println("Contagem regressiva " + contador3);

		}

		System.out.println("===============");

		int fator = 3;
		int contador;
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada | " + contador + " x = " + (fator * contador));

		}

		System.out.println("Olha como ficou o contador: " + contador);

	}

	public static void aulaNestedFor() {
		System.out.println("Nested For");

		byte nivelMaior = 5, nivelDetalhe = 10;

		for (int contador = 1; contador <= nivelMaior; contador++) {
			System.out.println("Para o nível maior, repetindo pela " + contador + " ª vez");

			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				System.out.println("Para o nível detalhe pela " + contadorInterno + "ª vez");

			}
		}

	}

	public static void exercicioForLimite() {
		Scanner entrada = new Scanner(System.in);

		byte limite;

		System.out.println("Até qual número vc quer contar?");
		limite = entrada.nextByte();
		System.out.println();

		for (int contador = 1; contador <= limite; contador++) {
			System.out.println("Sua contagem é : " + contador);
		}

	}

	public static void contagemRegressiva() {
		byte numero;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha um numero para fazer a contagem regressiva:");
		numero = entrada.nextByte();

		for (int contador = numero; contador > 0; contador--) {
			System.out.println("It's the final countdown: " + contador);
		}

	}

	public static void retornarTabuada(int numero) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número e te direi a tabuada:");
		numero = entrada.nextByte();

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
		}

	}
	
	public static void exibirTodasAsTabuadas() {
		for(int numero = 1; numero  <= 10; numero++) {
			System.out.println("Quero ver a tabuada do: " );
			
			for (int contador=1; contador<=10; contador++) {
				System.out.println(+ numero + " x " + contador + " = " + (numero*contador));
			}
			
		}
	}
}
