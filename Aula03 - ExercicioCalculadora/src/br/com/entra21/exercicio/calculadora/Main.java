package br.com.entra21.exercicio.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//Faça um programa de calculadora.Capture o nome do usuário e 2 valores numéricos. 
	//Após a captura dos numeros,exiba de forma individual o resultado utilizando os operadores (+,-,/ e*) //

	    float num1, num2;

	    Scanner entrada = new Scanner(System.in);

	    System.out.println("Digite o primeiro número:");
	    num1 = entrada.nextFloat();

	    System.out.println("Digite o segundo número:");
	    num2 = entrada.nextFloat();
	    
	    System.out.println(" - ADIÇÃO");
	      System.out.println(" " + num1+ " + " + " " + num2 + " = " + " " + (num1 + num2));
	        System.out.println("");
	    
	    System.out.println(" - SUBTRAÇÃO");
	      System.out.println(" " + num1+ " - " + " " + num2 + " = " + " " + (num1 - num2));
	        System.out.println("");

	    System.out.println(" - DIVISÃO");
	      System.out.println(" " + num1+ " ÷ " + " " + num2 + " = " + " " + (num1 / num2));
	        System.out.println("");

	    System.out.println(" - MULTIPLICAÇÃO");
	      System.out.println(" " + num1+ " x " + " " + num2 + " = " + " " + (num1 * num2));
	        System.out.println("");

	    System.out.println(" - RESTO DA DIVISÃO");
	      System.out.println(" " + num1+ " % " + " " + num2 + " = " + " " + (num1 % num2));	
	}

}
