package br.com.entra21.exercicio.imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//Faça um programa que calcule o IMC> O IMC é o Índice de Massa Corpórea e é calculado com a formula peso dividido pela altura ao quadrado*/

	    float altura, peso, imc;

	    Scanner entrada = new Scanner (System.in);
	    System.out.println("Digite a sua altura:");
	    altura = entrada.nextFloat();

	    System.out.println("Digite o seu peso:");
	    peso = entrada.nextFloat();

	    imc = peso / (altura  * altura);

	    System.out.println("Seu IMC é de : " + imc);

	}

}
