package br.com.entra21.exercicio.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
  /*Write a calculator program. Capture username and 2 
  numeric values. After capturing the numbers, individually display the result using the operators (+, -, / and *).*/

	    float num1, num2;
      String nameUser;
    
	    Scanner enter = new Scanner(System.in);

      System.out.println("Enter your name:");
      nameUser = enter.nextLine();

	    System.out.println("Enter the first number:");
	    num1 = enter.nextFloat();

	    System.out.println("Enter the second number:");
	    num2 = enter.nextFloat();
	    
	    System.out.println(" - ADDITION");
	      System.out.println(" " + num1+ " + " + " " + num2 + " = " + " " + (num1 + num2));
	        System.out.println("");
	    
	    System.out.println(" - SUBTRACTION");
	      System.out.println(" " + num1+ " - " + " " + num2 + " = " + " " + (num1 - num2));
	        System.out.println("");

	    System.out.println(" - DIVISION");
	      System.out.println(" " + num1+ " ÷ " + " " + num2 + " = " + " " + (num1 / num2));
	        System.out.println("");

	    System.out.println(" - MULTIPLICATION");
	      System.out.println(" " + num1+ " x " + " " + num2 + " = " + " " + (num1 * num2));
	        System.out.println("");

	    System.out.println(" - REMAINDER AFTER DIVISION");
	      System.out.println(" " + num1+ " % " + " " + num2 + " = " + " " + (num1 % num2));	
	}

}

