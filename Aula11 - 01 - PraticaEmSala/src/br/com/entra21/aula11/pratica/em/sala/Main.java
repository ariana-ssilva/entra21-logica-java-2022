package br.com.entra21.aula11.pratica.em.sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nEscolha uma das opções: ");
			System.out.println(" 0 - Sair ");
			System.out.println(" 1 - Calculando a soma ");
			System.out.println(" 2 - Repetir 20 vezes ");
			System.out.println(" 3 - Entre 20 pessoas, exibir a soma das idades");
			System.out.println(" 4 - Verificando quem é de maior ");
			System.out.println(" 5 - Leia o nome e idade de 10 pessoas e exiba o nome da mais nova");
			System.out.println(" 6 - ");
			System.out.println(" 9 - Solicite a quantidade de notas e calcule a média");
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				calculandoSoma();
				break;

			case 2:
				repetir20();
				break;

			case 3:
				somarIdade();
				break;

			case 4:
				verificandoDeMaior();
				break;

			case 5:
				exibirMaisNovo();
				break;

			case 9:
				calculandoMedia();
				break;
			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

		} while (option != 0);
		System.out.println("Obrigada por usar o programa Lista de Exercicios!");
	}

	public static void calculandoSoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);

		}
	}

	public static void repetir20() {

		for (byte counter = 1; counter <= 20; counter++) {
			System.out.print("Eu gosto de algoritmo " + (counter % 5 == 0 ? "\n" : ""));

			/*
			 * if(counter%5==0) { System.out.print("\n"); }
			 */
		}
	}

	public static void somarIdade() {
		int sumAge = 0;
		byte idade;
		Scanner input = new Scanner(System.in);

		for (byte counter = 1; counter <= 5; counter++) {
			System.out.println("No momento a soma está em : " + sumAge);
			System.out.println("Digite a idade da pessoa " + counter);
			idade = input.nextByte();
			sumAge = sumAge + idade;
		}
		System.out.println("A soma total das idades foi: " + sumAge);
	}

	public static void verificandoDeMaior() {
		System.out.println("Exibir apenas os de maior");
		byte maiores = 0;
		byte idade, counter;
		Scanner input = new Scanner(System.in);
		for (counter = 1; counter <= 20; counter++) {
			System.out.println("Informe a idade da pessoa " + counter);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior.");
			}
		}
		System.out.println("Entre " + (counter - 1) + " pessoas, apenas " + maiores + " são de maior.");

	}

	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Após isso tudo o mais novo é: " + youngerName + " " + ageMinimal);

	}

	public static void calculandoMedia() {
		Scanner input = new Scanner(System.in);
		byte qtdNotas;
		float nota, soma = 0f;
		String resposta;
		
		System.out.println("Digite a quantidade de notas:  ");
		qtdNotas = input.nextByte();
		
		byte contador = 0;
		do {
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat() ;
			if(contador >= qtdNotas) {
				System.out.println("Gostaria de capturar mais alguma nota?");
				resposta = input.next();
				if(resposta.equals("sim")) {
					contador--;
				}
			}
			soma = soma + nota;
		} while (contador <= qtdNotas);
		System.out.println("Nota: " + soma);
	}
	

}
