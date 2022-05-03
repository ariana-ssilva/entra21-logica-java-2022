package br.com.entra21.exercicio.idade.para.votar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Insert the birth year to know if you can vote:");
		short birthYear, canVote;
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter the birth year:");
		birthYear = enter.nextShort();
		
		canVote = (short) (2022 - birthYear);
		
		if (canVote >= 16) {
			System.out.println("You can vote");
		} else {
			System.out.println("Calm down!");
		}
		System.out.println(canVote>=16?"VOTE!":"WAIT A LITTLE MORE");

	}
}
