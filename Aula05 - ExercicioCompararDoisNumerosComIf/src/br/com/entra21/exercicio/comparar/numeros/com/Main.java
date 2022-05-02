package br.com.entra21.exercicio.comparar.numeros.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Insert 2 numbers and inform which one is greater
		
		Scanner enter = new Scanner(System.in);
		
		byte numberA, numberB;
		
		System.out.println("Enter the first number:");
		numberA = enter.nextByte();
		
		System.out.println("Enter the second number:");
		numberB = enter.nextByte();
		
		if(numberA > numberB) {
			System.out.println("The firts number is greater.");
		} else if(numberA == numberB){
			System.out.println("Both numbers are equal.");
		} else {
			System.out.println("The second is greater.");
		}
	}
}
