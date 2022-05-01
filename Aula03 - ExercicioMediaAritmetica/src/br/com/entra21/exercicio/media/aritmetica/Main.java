package br.com.entra21.exercicio.media.aritmetica;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Write a program that calculates the arithmetic average of a student. Capture
		 * student's name and value of their 3 grades.To inform the average the formula
		 * is : the sum of the grades divided by the amount of notes
		 */
		float grade1, grade2, grade3, arithmeticAverage;
		String studentsName;

		Scanner enter = new Scanner(System.in);

		System.out.println("Enter the student's name::");
		studentsName = enter.nextLine();

		System.out.println("Enter the first grade:");
		grade1 = enter.nextFloat();

		System.out.println("Enter the second grade:");
		grade2 = enter.nextFloat();

		System.out.println("Enter the third grade:");
		grade3 = enter.nextFloat();

		arithmeticAverage = (grade1 + grade2 + grade3) / 3;

		System.out.println("The arithmetic average of the student " + studentsName + " is : " + arithmeticAverage);

	}

}
