package br.com.entra21.aula15.exericios.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		byte option;

		do {
			System.out.println(runMenu());
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Exiting...");
				break;

			case 1:
				runBidimensionalArray();
				break;

			case 2:
				runBidimensionalInitializedArray();
				break;

			case 3:
				createArray5x3();
				break;

			case 4:
				askMultiArraySize();
				break;
				
			default:
				System.out.println("Enter a valid option!");
				break;
			}
		} while (option != 0);
		System.out.println("Thanks for running the code!");
	}

	public static String runMenu() {
		String menu = "Choose an option ";
		menu += "\n 0 - Exit";
		menu += "\n 1 - Create a bidimensional array for each primitive type and display their size in console ";
		menu += "\n 2 - Create a bidimensional initialized array for each primitive type and display their size in console";
		menu += "\n 3- Create 1 array of 5 positions with 3 capacity items, for the user to feed these values";
		menu += "\n 4- Create an array with the size and capacity entered by the user and then ask the user to enter the respective values";

		return menu;
	}

	public static void runBidimensionalArray() {
		byte bytesArray[][] = new byte[2][2]; // two arrays where each one can storage two characters
		short shortsArray[][] = new short[2][2]; // two arrays where each one can storage two characters
		int intsArray[][] = new int[2][3]; // two arrays where each one can storage three integer values
		long longsArray[][] = new long[2][2]; // two arrays where each one can storage two decimal values
		char charsArray[][] = new char[2][3]; // two arrays where each one can storage three values
		float floatsArray[][] = new float[3][3]; // three arrays where each one can storage three decimal values
		double doublesArray[][] = new double[2][2]; // two arrays where each one can storage two decimal values
		boolean booleansArray[][] = new boolean[3][2]; // three arrays where each one can storage two boolean values

		System.out.println(
				"bitesArray has " + bytesArray.length + " indexes lenght" + " and size " + bytesArray[0].length);
		System.out.println(
				"shortsArray has " + shortsArray.length + " indexes lenght" + " and size " + shortsArray[0].length);
		System.out
				.println("intsArray has " + intsArray.length + " indexes lenght" + " and size " + intsArray[0].length);
		System.out.println(
				"longsArray has " + longsArray.length + " indexes lenght" + " and size " + longsArray[0].length);
		System.out.println(
				"charsArray has " + charsArray.length + " indexes lenght" + " and size " + charsArray[0].length);
		System.out.println(
				"floatsArray has " + floatsArray.length + " indexes lenght" + " and size " + floatsArray[0].length);
		System.out.println(
				"doublesArray has " + doublesArray.length + " indexes lenght" + " and size " + doublesArray[0].length);
		System.out.println("booleansArray has " + booleansArray.length + " indexes lenght" + " and size "
				+ booleansArray[0].length);
		;

	}

	public static void runBidimensionalInitializedArray() {
		char charsArray[][] = { { 'A', 'E', 'V' }, { 'R', 'D', 'O' }, { 'F', 'F', 'C', 'A' }, };
		
		boolean booleansArray[][] = { { true, false, true, false }, { true, false, true, false },
				{ true, false, true, false }, };
		
		byte bytesArray[][] = { { 10, 20, 30, 44, 50 }, { 11, 22, 33 }, { 13, 24 }, { 18 }, };
		
		short shortsArray[][] = { { 300, 400, 1000 }, { 500, 600, 100 }, { 1000, 4000, 5000 }, };
		
		int intsArray[][] = { { 100 }, { 200 }, { 10000 }, };
		
		long longsArray[][] = { { 300, 400, 500, 600 }, { 10000000, 5000000, 300 }, { 1000000, 100000 }, };
		
		float floatsArray[][] = { { 100000f }, { 20000f, 30000f }, { 30000000000f }, };
		
		double doublesArray[][] = { { 100, 400, 500 }, { 100, 200, 400 }, { 1000, 4000, 5000, 6000 }, };
	}

	public static void createArray5x3() {

		byte bytesMultiArray[][] = new byte[5][3];
		System.out.println("Enter the first value for the first array:");
		bytesMultiArray[0][0] = input.nextByte();

		System.out.println("Enter the second value for the first array:");
		bytesMultiArray[0][1] = input.nextByte();

		System.out.println("Enter the third value for the first array:");
		bytesMultiArray[0][2] = input.nextByte();

		// --------------------------------------------------------------------

		System.out.println("Enter the first value for the second array:");
		bytesMultiArray[1][0] = input.nextByte();

		System.out.println("Enter the second value for the second array:");
		bytesMultiArray[1][1] = input.nextByte();

		System.out.println("Enter the third value for the second array:");
		bytesMultiArray[1][2] = input.nextByte();

		for (byte array = 2; array < bytesMultiArray.length; array++) {// [2][3][4]// 

			for (byte detail = 0; detail < bytesMultiArray[array].length; detail++) {
				System.out.println("For " + (array + 1) + " array  " + (detail + 1) + " the value.");
				bytesMultiArray[array][detail] = input.nextByte();

			}
		}

	}

	public static void askMultiArraySize() {

		byte arraySize, detailSize;
		byte bytesMultiArray[][];

		System.out.println("How many array fo you want to a multidimensional Array:: ");
		arraySize = input.nextByte();
		System.out.println("How many itens for each array?");
		detailSize = input.nextByte();

		bytesMultiArray = new byte[arraySize][detailSize];

		for (byte array = 0; array < bytesMultiArray.length; array++) {

			for (byte detail = 0; detail < bytesMultiArray[array].length; detail++) {

				System.out.println("For the index [" + array + "] detail [" + detail + "] ,  enter the value ");
				bytesMultiArray[array][detail] = input.nextByte();
			}
		}

		for (byte array = 0; array < bytesMultiArray.length; array++) {

			for (byte detail = 0; detail < bytesMultiArray[array].length; detail++) {

				System.out.println(
						"Multidimensional bytesArray [" + array + "] detail [" + detail + "] ==> " + bytesMultiArray[array][detail]);

			}
		}

	}

}
