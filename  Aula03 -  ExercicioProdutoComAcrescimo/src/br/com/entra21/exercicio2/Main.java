package br.com.entra21.exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 /*
		 * Make a program that requests the name and cost price of any product.
		 * Afterwards, process a 65% increase and inform what the sale price will be.
		 * Increasing a percentage value is obtained mathematically by adding the value
		 * of the product to the result of the calculation: product * (65/100), that is,
		 * increase = product + product * (60/100).
		 */
		float costPrice, salePrice;
		String productsName;

		Scanner enter = new Scanner(System.in);

		System.out.println("Enter the product's name:");
		productsName = enter.next();

		System.out.println("Enter the cost price:");
		costPrice = enter.nextFloat();

		salePrice = costPrice + (costPrice * 65 / 100);

		System.out.println("The " + productsName +"'s sale price is: " + salePrice);

	}

}
