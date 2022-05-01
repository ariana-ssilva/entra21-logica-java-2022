package br.com.entra21.exercicio.imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 /*Write a program to calculate BMI.
 BMI is the Body Mass Index and is calculated by using the formula : weight divided by height squared*/
		
    float height, weight, bmi;

    Scanner enter = new Scanner (System.in);
	    System.out.println("Enter your height (put a point or comma):");
	    height = enter.nextFloat();

	    System.out.println("Enter your weight:");
	    weight = enter.nextFloat();

	    bmi = weight / (height  * height);

	    System.out.println("BMI is: " + bmi);

	}

}
