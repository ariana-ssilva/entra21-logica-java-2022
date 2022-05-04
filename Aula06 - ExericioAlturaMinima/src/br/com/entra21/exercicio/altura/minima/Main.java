package br.com.entra21.exercicio.altura.minima;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Write a program that: Set as a constant the minimum height allowed to enter a
		 * toy. (Pay attention to the name and use the constant in the IF) Capture user
		 * name and height. Validate if the height informed is smaller than the allowed
		 * If it is SMALLER, please inform politely, mentioning the user's name and
		 * height, what is the minimum parameter to enter the toy. If it is not MINOR,
		 * inform that the entry is released.
		 */

		final float MINIMUN_HEIGHT = 1.50f;
		float yourHeight;
		String yourName;
		Scanner enter = new Scanner(System.in);

		System.out.println("Please enter your name:");
		yourName = enter.nextLine();

		System.out.println(" " + yourName + " please, enter your height to know if you can use the toy:");
		yourHeight = enter.nextFloat();

		if (yourHeight < MINIMUN_HEIGHT) {
			System.out.println("Sorry " + yourName + ", you're smaller than the allowed height!");
			System.out.println("Your height: " + yourHeight + "| Minimum Height: " +MINIMUN_HEIGHT);
		} else {
			System.out.println("Hello " + yourName + ", you're allowed to use the toy!");
		}

	}

}
