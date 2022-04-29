package br.com.entra21.exercicio.operadores.logicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fa�a um programa que capture 3 informa��es o nome,  idade e altura. 
		//Deve ser informado se o usu�rio � maior ou igual que 170cm E tem � maior de idade (utilizar o &&)
		
		String nome;
		byte idade;
		float altura;
		boolean resultado;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o nome:");
		nome = entrada.nextLine();
		
		System.out.println("Digite a idade:");
		idade = entrada.nextByte();
		
		System.out.println("Digite a altura em cent�metros:");
		altura = entrada.nextFloat();
		
		resultado = (altura >= 170) && (idade >= 18);
		
		System.out.println("O usu�rio " + nome + " tem 1,70 cm ou mais de altura e � maior de 18 anos?");
		System.out.println("A altura � "+ altura + " e a idade � de " + idade + " " + resultado);
		
		// Fa�a um programa que capture 3 informa��es o nome,  idade e altura.
		// Deve ser informado se o usu�rio � maior ou igual que 170cm OU tem � maior de idade (utilizar o ||)
		
		resultado = (altura >= 170) ||(idade >= 18);
		
		System.out.println("O usu�rio " + nome + " tem 1,70 cm ou mais de altura ou � maior de 18 anos?");
		System.out.println("A altura � "+ altura + " e a idade � de " + idade + " " + resultado);
		
	}

}
