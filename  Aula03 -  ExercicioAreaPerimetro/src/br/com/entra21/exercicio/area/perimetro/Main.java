package br.com.entra21.exercicio.area.perimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float area, perimetro, base, altura;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a base para o retangulo: ");
		base = entrada.nextFloat();
		System.out.println("Digite a altura para o retangulo: ");
		altura = entrada.nextFloat();

		area = base * altura;

		System.out.println("A altura é: " + area);

		perimetro = base * 2 + altura * 2;

		System.out.println("O perímetro é: " + perimetro);

	}

}
