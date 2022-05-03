package br.com.entra21.exercicio.situacao.aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Insert 3 grades to calculate the student's average and 
		 * report if he/she passed or failed*/
		
		float grade1, grade2, grade3, average;
		String name;
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter the student's name:");
		name = enter.nextLine();
		
		System.out.println("Enter the first grade:");
		grade1 = enter.nextFloat();
		
		System.out.println("Enter the second grade:");
		grade2 = enter.nextFloat();
		
		System.out.println("Enter the third grade:");
		grade3 = enter.nextFloat();
		
		average = (grade1 + grade2 + grade3) / 3;
		
		if (average < 7.0) {
			System.out.println(" " + name + "'s average is " + average + " :FAILED");
		} else {
			System.out.println(" " + name + "'s average is " + average + ": PASSED");
		}

	}

}
