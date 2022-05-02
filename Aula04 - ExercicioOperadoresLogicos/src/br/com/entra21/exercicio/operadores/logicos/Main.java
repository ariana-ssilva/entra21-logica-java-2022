package br.com.entra21.exercicio.operadores.logicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 /*Write a program that requests 3 informations: name, age and height. It must
		 * be informed if the user is taller than or equal to 170cm AND is over eighteen
		 * (use the && operator).*/

		String name;
		byte age;
		float height;
		boolean result;

		Scanner enter = new Scanner(System.in);

		System.out.println("Enter the name:");
		name = enter.nextLine();

		System.out.println("Enter the age:");
		age = enter.nextByte();

		System.out.println("Enter the height:");
		height = enter.nextFloat();

		result = (height >= 1.70) && (age >= 18);

		System.out.println("> Is  " + name + " 1,70cm or taller than, AND is over eighteen?");
		System.out.println(">> The height is " + height + " and the age is " + age + ". " + result);

		/*It must be informed if the user is taller than or equal to 170cm OR is over eighteen
		 * (use the || operator).*/
		result = (height >= 1.70) || (age >= 18);
		
		System.out.println("> Is  " + name + " 1,70cm or taller than, OR is over eighteen?");
		System.out.println(">> The height is " + height + " and the age is " + age + ". " + result);
	}
}
