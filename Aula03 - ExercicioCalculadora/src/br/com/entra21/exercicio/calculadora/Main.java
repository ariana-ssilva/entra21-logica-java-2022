package br.com.entra21.exercicio.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//Fa�a um programa de calculadora.Capture o nome do usu�rio e 2 valores num�ricos. 
	//Ap�s a captura dos numeros,exiba de forma individual o resultado utilizando os operadores (+,-,/ e*) //

	    float num1, num2;

	    Scanner entrada = new Scanner(System.in);

	    System.out.println("Digite o primeiro n�mero:");
	    num1 = entrada.nextFloat();

	    System.out.println("Digite o segundo n�mero:");
	    num2 = entrada.nextFloat();
	    
	    System.out.println(" - ADI��O");
	      System.out.println(" " + num1+ " + " + " " + num2 + " = " + " " + (num1 + num2));
	        System.out.println("");
	    
	    System.out.println(" - SUBTRA��O");
	      System.out.println(" " + num1+ " - " + " " + num2 + " = " + " " + (num1 - num2));
	        System.out.println("");

	    System.out.println(" - DIVIS�O");
	      System.out.println(" " + num1+ " � " + " " + num2 + " = " + " " + (num1 / num2));
	        System.out.println("");

	    System.out.println(" - MULTIPLICA��O");
	      System.out.println(" " + num1+ " x " + " " + num2 + " = " + " " + (num1 * num2));
	        System.out.println("");

	    System.out.println(" - RESTO DA DIVIS�O");
	      System.out.println(" " + num1+ " % " + " " + num2 + " = " + " " + (num1 % num2));	
	}

}
