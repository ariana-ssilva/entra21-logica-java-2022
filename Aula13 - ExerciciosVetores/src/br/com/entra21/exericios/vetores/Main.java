package br.com.entra21.exericios.vetores;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println(runMenu());

			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Thanks for running the program");
				break;
			case 1:
				showArraySize();
				break;
			case 2:
				showInitializedArraySize();
				break;
			case 3:
				feedArray();
				break;
			case 4:
				defineSizeInitialize();
				break;
			case 5:
				AscDescInitializeArray();
				break;
			case 6:
				showIntergerNotInitializeArray();
			default:
				break;
			}
		} while (option != 0);

	}

	public static String runMenu() {
		String menu = "Choose an option\n";
		menu += "0 - \n";
		menu += "1 - Create arrays for each primitive type and display their size in the console\n";
		menu += "2 - Create initialized arrays for each primitive type and display their size in the console\n";
		menu += "3 - Create a 5-position vector, for the user to feed these values\n";
		menu += "4 - Create a vector with the size informed by the user and then ask the user to inform the respective values\n";
		menu += "5 - Create a vector of initialized integers, to traverse: from start to finish, from end to start, to display the values\n";
		menu += "6 - Create an uninitialized array of integers\n";
		menu += "---------------------------------------------";

		return menu;

	}

	public static void showArraySize() {
		byte bytesArray[] = new byte[1];
		short shortsArray[] = new short[2];
		int intsArray[] = new int[3];
		long longsArray[] = new long[4];
		char charsArray[] = new char[5];
		float floatsArray[] = new float[6];
		double doublesArray[] = new double[7];
		boolean booleansArray[] = new boolean[8];

		System.out.println("bytesArray size = " + bytesArray.length);
		System.out.println("shortsArray size = " + shortsArray.length);
		System.out.println("intsArray size = " + intsArray.length);
		System.out.println("longsArray size = " + longsArray.length);
		System.out.println("charsArray size = " + charsArray.length);
		System.out.println("floatsArray size = " + floatsArray.length);
		System.out.println("doublesArray size = " + doublesArray.length);
		System.out.println("booleansArray size = " + booleansArray.length);
	}

	public static void showInitializedArraySize() {
		byte bytesArray[] = { 1, 3, 5, 7, 9 };
		short shortsArray[] = { 128, 130, 132, 134 };
		int intsArray[] = { 1000, 1002 };
		long longsArray[] = { 110000, 200000 };
		char charsArray[] = { 'a', 'r', 'i', 'a', 'n', 'a' };
		float floatsArray[] = { 1000.50f, 32698.89f };
		double doublesArray[] = { 15000.54d, 78946.56d };
		boolean booleansArray[] = { false, true, false, false, true, true };

		System.out.println("bytesArray size = " + bytesArray.length);
		System.out.println("shortsArray size = " + shortsArray.length);
		System.out.println("intsArray size = " + intsArray.length);
		System.out.println("longsArray size = " + longsArray.length);
		System.out.println("charsArray size = " + charsArray.length);
		System.out.println("floatsArray size = " + floatsArray.length);
		System.out.println("doublesArray size = " + doublesArray.length);
		System.out.println("booleansArray size = " + booleansArray.length);
	}

	public static void feedArray() {
		byte bytesArray[] = new byte[5];
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count < bytesArray.length; count += 2) {
			System.out.println("Initializing the position " + (count + 1) + " on the index " + count);
			bytesArray[count] = input.nextByte();
		}
	}

	public static void defineSizeInitialize() {
		Scanner input = new Scanner(System.in);
		byte size;
		byte bytesArray[];
		System.out.println("Enter the array size:");
		size = input.nextByte();
		bytesArray = new byte[size];
		for (byte counter = 0; counter < bytesArray.length; counter++) {
			System.out.println("Enter the value for " + (counter + 1) + " on the index [" + counter + "]");
			bytesArray[counter] = input.nextByte();

		}

	}

	private static void AscDescInitializeArray() {
		byte intArray[] = { 12, 28, 37, 59, 6 };
		for (byte count = 0; count < intArray.length; count++) {
			System.out.println(intArray[count]);

		}
		System.out.println("----");
		for (byte count = (byte) (intArray.length - 1); count >= 0; count--) {
			System.out.println(intArray[count]);
		}
	}

	public static void showIntergerNotInitializeArray() {
		byte bytesArray[] = new byte[10];
		Scanner input = new Scanner(System.in);
		String answer;
		byte index = 0;

		do {
			System.out.println("Enter a value to the index [" + index + "]");
			bytesArray[index] = input.nextByte();
			System.out.println("Would you like to initialize another index?");
			answer = input.next();

			if (answer.equalsIgnoreCase("yes")) {
				do {
					System.out.println("Enter a valid index between 0 and " + (bytesArray.length - 1));
					index = input.nextByte();
				} while (index < 0 || index >= bytesArray.length);
			}
		} while (answer.equalsIgnoreCase("yes"));
		for (byte counter = 0; counter < bytesArray.length; counter++) {
			System.out.println("bytesArray[" + counter + "] = " + bytesArray[counter]);
		}

	}
}
