package br.com.entra21.exercicio.area.perimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    float area, perimeter, base, height;

			Scanner enter = new Scanner(System.in);

			System.out.println("Enter a base for the rectangle: ");
			base = enter.nextFloat();
	    
			System.out.println("Enter a height for the rectangle: ");
			height = enter.nextFloat();

			area = base * height;

			System.out.println("The height is: " + area);

			perimeter = base * 2 + height * 2;

			System.out.println("The perimeter is: " + perimeter);

	}

}
