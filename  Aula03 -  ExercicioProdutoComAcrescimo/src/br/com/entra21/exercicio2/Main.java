package br.com.entra21.exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float precoOriginal, precoComAumento;
		String nomeProduto;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		nomeProduto = entrada.next();
		
		System.out.println("Digite o preço do produto:");
		precoOriginal = entrada.nextFloat();
		
		precoComAumento = precoOriginal + (precoOriginal*65/100);
		
		System.out.println("O preço do produto "+ nomeProduto+ 
				" com aumento de 65& é de :" + precoComAumento);
		
		
	}

}
