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
				criarMatrizes5vetores3posicoes();
				break;

			case 4:
				solicitarTamanhoMatrizParaPreencher();
				break;

			case 5:
				break;

			case 6:
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
		char matrizChars[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 'A', 'E', 'V' }, { 'R', 'D', 'O' }, { 'F', 'F', 'C', 'A' }, // irregular porque tem tamanhos diferente
																				// de index
		};
		boolean matrizBooleans[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ true, false, true, false }, { true, false, true, false }, { true, false, true, false }, // regular
		};
		byte matrizBytes[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 10, 20, 30, 44, 50 }, { 11, 22, 33 }, { 13, 24 }, { 18 }, // irregular porque tem tamanhos diferente
																			// de index
		};
		short matrizShorts[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 300, 400, 1000 }, { 500, 600, 100 }, { 1000, 4000, 5000 }, // regular porque todos a mesma capacidade
																				// de itens por vetores
		};
		int matrizInts[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100 }, { 200 }, { 10000 }, // regular porque todos a mesma capacidade de itens por vetores
		};
		long matrizLongs[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 300, 400, 500, 600 }, { 10000000, 5000000, 300 }, { 1000000, 100000 }, // irregular porque tem
																							// tamanhos diferente de
																							// index
		};
		float matrizFloats[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100000f }, { 20000f, 30000f }, { 30000000000f }, // irregular porque tem tamanhos diferente de index
		};
		double matrizDouble[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100, 400, 500 }, { 100, 200, 400 }, { 1000, 4000, 5000, 6000 }, // irregular porque tem tamanhos
																					// diferente de index
		}
	}
	public static void criarMatrizes5vetores3posicoes() {

		byte matrizBytes[][] = new byte[5][3];

		System.out.println("Para o primeiro vetor, informe o primeiro valor:");
		matrizBytes[0][0] = input.nextByte();

		System.out.println("Para o primeiro vetor, informe o segundo valor:");
		matrizBytes[0][1] = input.nextByte();

		System.out.println("Para o primeiro vetor, informe o terceiro valor:");
		matrizBytes[0][2] = input.nextByte();

		// --------------------------------------------------------------------

		System.out.println("Para o segundo vetor, informe o primeiro valor:");
		matrizBytes[1][0] = input.nextByte();

		System.out.println("Para o segundo vetor, informe o segundo valor:");
		matrizBytes[1][1] = input.nextByte();

		System.out.println("Para o segundo vetor, informe o terceiro valor:");
		matrizBytes[1][2] = input.nextByte();

		for (byte vetor = 2; vetor < matrizBytes.length; vetor++) {// [2][3][4]// Continuando minha captura com FOR

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				System.out.println("Para o " + (vetor + 1) + "ª vetor informe o " + (detalhe + 1) + "ª valor");
				matrizBytes[vetor][detalhe] = input.nextByte();

			}
		}

	}

	public static void solicitarTamanhoMatrizParaPreencher() {

		byte tamanhoVetor, tamanhoDetalhe;
		byte matrizBytes[][];

		System.out.println("Quantos vetores vc quer na sua matriz: ");
		tamanhoVetor = input.nextByte();
		System.out.println("Quantos itens vc quer em cada vetor: ");
		tamanhoDetalhe = input.nextByte();

		matrizBytes = new byte[tamanhoVetor][tamanhoDetalhe];

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {

				System.out.println("Para o indice [" + vetor + "] detalhe [" + detalhe + "] informe o valor ");
				matrizBytes[vetor][detalhe] = input.nextByte();
			}
		}

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {

				System.out.println(
						"Matriz bytes [" + vetor + "] detalhe [" + detalhe + "] ==> " + matrizBytes[vetor][detalhe]);

			}
		}

	}

}
