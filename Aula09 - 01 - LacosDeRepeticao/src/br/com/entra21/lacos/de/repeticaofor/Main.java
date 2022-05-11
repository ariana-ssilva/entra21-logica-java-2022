package br.com.entra21.lacos.de.repeticaofor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre for");

		Scanner input = new Scanner(System.in);
		String opcao;
		System.out.println("MENU DO FOR");
		System.out.println("Escolha uma op��o:");
		System.out.println(" 1 - for simples");
		System.out.println(" 2 - nested for");
		System.out.println(" 3 - Solicite ao usu�rio uma quantidade inicial e final, para exibir em tela a repeti��o do inicio at� o final");
		System.out.println(" 4 - Solicite ao usu�rio um valor numero para exibir a contagem regressiva at� o zero");
		System.out.println(" 5 - Retorne a tabuada do numero escolhido");
		System.out.println(" 6 - Retornar todas as tabuadas de 1 at� a tabuada do numero informado pelo usu�rio");

		opcao = input.nextLine();

		switch (opcao.toLowerCase()) {
		case "1", "for simples":
			// fun��o aula for simples
			aulaForSimples(); // fun��o de procedimento n�o precisa de argumento e nem retorno
			break;

		case "2", "nested for":
			// sos ainda n�o sei
			aulaNestedFor(); // fun��o de procedimento n�o precisa de argumento e nem retorno
			break;

		case "3":
			exercicioForLimite(); // fun��o de procedimento n�o precisa de argumento e nem retorno
			break;
		case "4":
			contagemRegressiva();
			break;

		case "5":
			retornarTabuada(input.nextInt());
			break;

		case "6":
			exibirTodasAsTabuadas();
		}

	}

	public static void aulaForSimples() {
		System.out.println("Repeti��o simples de forma linear ede 1 em 1");
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {
			System.out.println("Repetindo o contador1 pela " + contador1 + "� vez");
		}

		System.out.println("===============");

		System.out.println("O incremento ou decremento n�o precisa ser de 1 em 1");
		for (int contador2 = 1; contador2 <= 30; contador2 += 4) {
			System.out.println("Repetindo, mas pulando de 4 rm 4, o contador est� em: " + contador2);
			// System.out.println("Repetindo "+contador1);
			// N�o � poss�vel usar a variavel contador1 pois ela s� existe no outro escopo
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
			System.out.println("Para o n�vel maior, repetindo pela " + contador + " � vez");

			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				System.out.println("Para o n�vel detalhe pela " + contadorInterno + "� vez");

			}
		}

	}

	public static void exercicioForLimite() {
		Scanner input = new Scanner(System.in);

		byte limite;

		System.out.println("At� qual n�mero vc quer contar?");
		limite = input.nextByte();
		System.out.println();

		for (int contador = 1; contador <= limite; contador++) {
			System.out.println("Sua contagem � : " + contador);
		}

	}

	public static void contagemRegressiva() {
		byte numero;

		Scanner input = new Scanner(System.in);

		System.out.println("Escolha um numero para fazer a contagem regressiva:");
		numero = input.nextByte();

		for (int contador = numero; contador > 0; contador--) {
			System.out.println("It's the final countdown: " + contador);
		}

	}

	public static void retornarTabuada(int numero) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um n�mero e te direi a tabuada:");
		numero = input.nextByte();

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
