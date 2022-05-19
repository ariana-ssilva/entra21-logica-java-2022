package br.com.entra21.exericio.imc.faixa.de.peso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Write a program to calculate BMI. BMI is the Body Mass Index and is
		 * calculated by using the formula : weight divided by height squared.
		 * Display the result and in which weight range it is;
		 */
		float height, weight, bmi;

		Scanner enter = new Scanner(System.in);
		System.out.println("Enter your height (put a point or comma):");
		height = enter.nextFloat();

		System.out.println("Enter your weight:");
		weight = enter.nextFloat();

		bmi = weight / (height * height);

		if(bmi < 18.5f) {
			System.out.println("BMI is: " + bmi + " you're 'underwight'!");
		} else if (bmi >= 18.5f || bmi <= 24.5f) {
			System.out.println("BMI is: " + bmi + " you're 'normal'!");
		} else if (bmi >= 25.0f || bmi <= 30.0) {
			System.out.println("BMI is: " + bmi + " you're overwight'!");
		} else if (bmi >= 35.0f || bmi <= 39.5) {
			System.out.println("BMI is: " + bmi + " you're Obese Class I'!");
		} else if (bmi >= 40.0f || bmi <= 44.5) {
			System.out.println("BMI is: " + bmi + " you're Obese Class II'!");
		}else {
			System.out.println("BMI is: " + bmi + " you're Obese Class III'!");
		}

	}

}
