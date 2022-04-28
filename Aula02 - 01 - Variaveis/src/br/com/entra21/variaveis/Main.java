package br.com.entra21.variaveis;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		byte idade = 21;
		byte outraIdade = 22;
		short ano = 2022;
		short anoPassado = 2021;

		System.out.println(idade + outraIdade);
		System.out.println("Minha idade é " + idade + outraIdade);
		System.out.println("Minha idade é " + (idade + outraIdade));

		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado);

		int habitantesBrasil = 212060000;
		System.out.println("No BR, em " + ano + " temos exatamente " + habitantesBrasil + " milhões de habitantes");

		long habitantesTerra1500 = 790000000;

		double habitantesAtualmente = 7900000000.00;

		float peso = 70.5f, altura = 1.60f;

		System.out.println("Meu peso é: " + peso);
		System.out.println("Minha altura é: " + altura);

		char letra = 'A';

		boolean intervaloAntesDasOito = false;
		boolean intervaloAgora = true;

		String nomeCompleto = "Ariana M. da Silva";

		String nome;
		byte minhaIdade;
		float minhaAltura, salario;

		/*
		 * Scanner entrada; entrada = new Scanner(System.in);
		 * System.out.println("Digite seu nome: "); nome = entrada.next();
		 * System.out.println("Digite a sua idade:"); minhaIdade = entrada.nextByte();
		 * System.out.println("Digite a sua altura:"); minhaAltura =
		 * entrada.nextFloat(); System.out.println("Digite seu salário:"); salario =
		 * entrada.nextFloat(); System.out.println("Bem vindo " + nome +
		 * " agora consigo interagir com humanos e já sei que vc tem " +minhaIdade +
		 * " anos."); System.out.println("Você tem " + minhaAltura +
		 * " de altura e seu salário é " +salario + " reais.");
		 */

		nome = JOptionPane.showInputDialog("Informe novamente seu nome");
		JOptionPane.showMessageDialog(null, "Legal, agora sei seu nome!");
		minhaIdade = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua idade:")
				);
		salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário:")
				);
		JOptionPane.showMessageDialog(null, "Tábom , vc ganha "+salario);
	}

}
