package br.com.entra21.exercicio.estacoes.doano;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Show a list of options to the user choose one and for each
		 * choice return a different message.
		 *  What is your favorite season?
		 * 1 = spring 2 = autumn 3 = winter 4 = summer
		 */
		
		byte option;
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Choose a number that corresponds to your favourite season");
		System.out.println("I 'll recommend a song ... ");
		System.out.println(" 1 is for SPRING");
		System.out.println(" 2 is for AUTUMN");
		System.out.println(" 3 is for WINTER");
		System.out.println(" 4 is for SUMMER");
		
		System.out.println();
		option = enter.nextByte();
		
		switch (option) {
		case 1:
			System.out.println("Fluorescent Adolescent - by Arctic Monkeys");
			break;
		case 2:
			System.out.println("It's hard to get around in the wind - by Alex Turner");
			break;
		case 3:
			System.out.println("505 - by Arctic Monkeys");
			break;
		case 4:
			System.out.println("Star treatment - by Arctic Monkeys");
			break;
		default:
			System.out.println("Please, choose one...");
			break;
		}
	}

}
