package br.com.entra21.aula11.pratica.em.sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nChoose an option: ");
			System.out.println(" 0 - Quit ");
			System.out.println(" 1 - Addition ");
			System.out.println(" 2 - Repeting 20 times ");
			System.out.println(" 3 - Sum de ages betweem 20 people");
			System.out.println(" 4 - Verifying who is older than 18 years old ");
			System.out.println(" 5 - Get name and age of 10 people and return the youngest's name");
			System.out.println(" 6 - ");
			System.out.println(" 7 - ");
			System.out.println(" 8 - ");
			System.out.println(" 9 - Get the amount of grades and calculate the average");
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Exiting...");
				break;

			case 1:
				runSum();
				break;

			case 2:
			runRepeat20();
				break;

			case 3:
			runSumAge();
				break;

			case 4:
			runVerifyingThe18();
				break;

			case 5:
			runTheYoungest();
				break;

			case 9:
			runCalculatingAverage();
				break;
			default:
				System.out.println("Escolha uma op��o v�lida!");
				break;
			}

		} while (option != 0);
		System.out.println("Thanks for running this code!");
	}

	public static void runSum() {
		System.out.println("ADDITION");
		byte sum = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = sum + counter,  " + sum + " = " + sum + " + " + counter + " ==> " + (sum + counter));
			sum = (byte) (sum + counter);

		}
	}

	public static void runRepeat20() {

		for (byte counter = 1; counter <= 20; counter++) {
			System.out.print("I like algorithms! " + (counter % 5 == 0 ? "\n" : ""));

			/*
			 * if(counter%5==0) { System.out.print("\n"); }
			 */
		}
	}

	public static void runSumAge() {
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte counter = 1; counter <= 5; counter++) {
			System.out.println("Right here the sum is : " + sumAge);
			System.out.println("Enter the person's age: " + counter);
			age = input.nextByte();
			sumAge = sumAge + age;
		}
		System.out.println("The final sum is: " + sumAge);
	}

	public static void runVerifyingThe18() {
		System.out.println("Show only the ones who are older than 18");
		byte maiores = 0;
		byte age, counter;
		Scanner input = new Scanner(System.in);
		for (counter = 1; counter <= 20; counter++) {
			System.out.println("Enter the person's age: " + counter);
			age = input.nextByte();
			if (age >= 18) {
				maiores++;
				System.out.println("The last person infomed was older than 18.");
			}
		}
		System.out.println("Between " + (counter - 1) + " people, only " + maiores + " are older than 18.");

	}

	private static void runTheYoungest() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = " ";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Enter your name: ");
			name = input.next();
			System.out.println(name + " please, enter your age: ");
			age = input.nextByte();
			// in the first loop, the first age always will be the youngest
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("I'm the first, so I'm the youngest:  " + name + " " + age);
			} else {
				// it's necessary to compare with ageMininal
				System.out.println("I'm on loop"  + count + " I need to verify");
				if (age < ageMinimal) {
					System.out.println(
							"Now the youngest person is " + name + " with  " + age + " y.o");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("For sure, the youngest person is: " + youngerName + " " + ageMinimal);

	}

	public static void runCalculatingAverage() {
		Scanner input = new Scanner(System.in);
		byte gradesQty;
		float grade, sum = 0f;
		String answer;
		
		System.out.println("Enter the amount of grades:  ");
		gradesQty = input.nextByte();
		
		byte counter = 0;
		do {
			counter++;
			System.out.println("Enter the grade:");
			grade = input.nextFloat() ;
			if(counter >= gradesQty) {
				System.out.println("Do you want to insert another grade? ( yes / no)?");
				answer = input.next();
				if(answer.equals("sim")) {
					counter--;
				}
			}
			sum = sum + grade;
		} while (counter <= gradesQty);
		System.out.println("Grade: " + sum);
	}
	

}
