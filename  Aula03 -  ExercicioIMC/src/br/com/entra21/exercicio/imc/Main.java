package br.com.entra21.exercicio.imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//Fa�a um programa que calcule o IMC> O IMC � o �ndice de Massa Corp�rea e � calculado com a formula peso dividido pela altura ao quadrado*/

	    float altura, peso, imc;

	    Scanner entrada = new Scanner (System.in);
	    System.out.println("Digite a sua altura:");
	    altura = entrada.nextFloat();

	    System.out.println("Digite o seu peso:");
	    peso = entrada.nextFloat();

	    imc = peso / (altura  * altura);

	    System.out.println("Seu IMC � de : " + imc);

	}

}
