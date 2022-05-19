package br.com.entra21.aula12.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Learning about array");
		Scanner inPut = new Scanner(System.in);
		byte option;

		do {
			System.out.println("0- Exit");
			System.out.println("01- Declaring Array");
			System.out.println("02- Accessing indexes");
			System.out.println("03- Assigning values and indexes");
			System.out.println("04- Average using Array");
			option = inPut.nextByte();

			switch (option) {

				case 0:
					// case empty just to don't go to default option
					break;

				case 1:
					runDeclaringArray();
					break;

				case 2:
					runAcessingIndexes();
					break;

				case 3:
					runUpdatingValues();
					break;
				case 4:
					runCalculatingAverageUsingArray();
					break;
			}

		} while (option != 0);
		System.out.println("Thanks for running the code!");

	}

	public static void runDeclaringArray() {

		byte ages[]; // Create the variable, that will be an array of any type

		ages = new byte[15]; // Define the length

		System.out.println("The length is " + ages.length); // Then, use or uptade

		// how to acess any index and the content
		float grades[] = { 1, 3.5f, 8 }; // Creating the second variable and definin the length and the values

	}

	public static void runAcessingIndexes() {

		byte ages[]; // Create the variable, that will be an array of any type
		ages = new byte[15]; // Define the length

		System.out.println("The length is: " + ages.length); // Then, use or uptade
		System.out.println("The index [1] content is  " + ages[1]);
		System.out.println("The last index's content is " + ages[2]);

	}

	public static void runUpdatingValues() {
		float grades[] = { 1, 3.5f, 8 }; // Creating the variable and definin the length and the values
		grades[0] = 33; // Assign a grade to the index '0'
		grades[2] = 12; // Assign a grade to the index '2'

	}

	public static void runCalculatingAverageUsingArray() {
		Scanner input = new Scanner(System.in);
		float grades[] = new float[2];

		for (byte counter = 0; counter < grades.length; counter++) {
			System.out.println("Enter the " + (counter + 1) + " grade:");
			grades[counter] = input.nextFloat();

		}
		System.out.println("The second grade is " + grades[1]);
		float sum = 0;
		for (byte counter = 0; counter < grades.length; counter++) {
			System.out.println(grades[counter]);
			sum = sum + grades[counter];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum / grades.length);
	}
}
