package br.com.entra21.exercicio.idade.para.votar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar ano de nascimento e informar se já tem idade para votar");
		short anoNascimento, calculo;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o ano de nascimento");
		anoNascimento = entrada.nextShort();
		
		calculo = (short) (2022 - anoNascimento);
		
		if (calculo >= 16) {
			System.out.println("Já pode votar");
		} else {
			System.out.println("Te aquieta vivente");
		}
		System.out.println(calculo>=16?"VOTE!":"PERA AE");

	}

}
