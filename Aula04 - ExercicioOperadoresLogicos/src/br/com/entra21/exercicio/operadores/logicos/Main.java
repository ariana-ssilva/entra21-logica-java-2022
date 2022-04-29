package br.com.entra21.exercicio.operadores.logicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Faça um programa que capture 3 informações o nome,  idade e altura. 
		//Deve ser informado se o usuário é maior ou igual que 170cm E tem é maior de idade (utilizar o &&)
		
		String nome;
		byte idade;
		float altura;
		boolean resultado;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o nome:");
		nome = entrada.nextLine();
		
		System.out.println("Digite a idade:");
		idade = entrada.nextByte();
		
		System.out.println("Digite a altura em centímetros:");
		altura = entrada.nextFloat();
		
		resultado = (altura >= 170) && (idade >= 18);
		
		System.out.println("O usuário " + nome + " tem 1,70 cm ou mais de altura e é maior de 18 anos?");
		System.out.println("A altura é "+ altura + " e a idade é de " + idade + " " + resultado);
		
		// Faça um programa que capture 3 informações o nome,  idade e altura.
		// Deve ser informado se o usuário é maior ou igual que 170cm OU tem é maior de idade (utilizar o ||)
		
		resultado = (altura >= 170) ||(idade >= 18);
		
		System.out.println("O usuário " + nome + " tem 1,70 cm ou mais de altura ou é maior de 18 anos?");
		System.out.println("A altura é "+ altura + " e a idade é de " + idade + " " + resultado);
		
	}

}
