package br.com.entra21.aulawhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Learning loop structures:");
		System.out.println("( 0 ) Quit\n( 1 ) while\n( 2 ) do-while");
		System.out.println(" Chooose an option:");

		// instanciando um objeto da classe Scanner e já utilizando o método next.
		switch (new Scanner(System.in).next().toLowerCase()) {
		case "0", "quit":
			System.out.println("Quit...");
			break;

		case "1", "while":
			learnWhile();
			break;

		case "2", " do-while":
			learnDoWhile();
			break;

		default:
			System.out.println("Invalid option!");
			main(null);
			break;
		}
		System.out.println("Come back lately...");

	}

	public static void learnWhile() {
		System.out.println("Let's learn while structure");
		byte counter = 1;
		while (counter <= 10) {
			System.out.println("Counting until " + counter);
			counter++;
		}
		System.out.println("Finished");

		Scanner enter = new Scanner(System.in);
		System.out.println("Do you want to move on?");
		String answer = enter.next();
		while (answer.equalsIgnoreCase("yes") || answer.equals("continue")) { // equals compara o que foi digitado com
																				// "continuar
			System.out.println("Your answer was : " + answer);
			System.out.println("Do you want to move on?");
			answer = enter.next();
			main(null);
		}

		System.out.println("While is over!");
		main(null);

	}

	public static void learnDoWhile() {
		System.out.println("Let's learn do-while structure");
		Scanner enter = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Existiam 2 dogs, PITA e REPITA, PITA morreu, quem ficou?");
			answer = enter.next();
		} while (answer.equalsIgnoreCase("repita"));

		byte birthday;
		byte counter = 0; 

		do {
			System.out.println("Enter your birthday:");
			birthday = enter.nextByte();
			
		} while (birthday > 31);

		System.out.println("Got it?");
		
		byte month;
		
		do {
			System.out.println("dia aniver");
			birthday = enter.nextByte();
			
			System.out.println("mes aniver");
			month = enter.nextByte();
			
			counter++;
		} while (birthday < 1 ||  birthday > 31 || month <1 ||month > 12);
			System.out.println("Finalmente acertou mizeravi " + birthday + " errou " + --counter + " vezes");

		main(null);

	}
}
