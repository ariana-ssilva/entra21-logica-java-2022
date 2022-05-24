package br.com.entra21.exercicio.cor.favorita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String option;
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Choose your favourite color and type it.");
		System.out.println("I 'll tell you a fun fact about it... ");
		System.out.println("Green");
		System.out.println("Blue");
		System.out.println("Yellow");
		System.out.println("Red");
		
		System.out.println("Type here:");
		option = enter.nextLine();
		
		switch (option) {
		case "green":
			System.out.println("GREEN is the second most popular favorite color");
			break;
		case "blue":
			System.out.println("BLUE is the rarest colour in nature");
			break;
		case "yellow":
			System.out.println("YELLOW is considered a lucky color in China.");
			break;
		case "red":
			System.out.println("RED translates to beautiful in Russian.");
			break;
		}

	}

}
