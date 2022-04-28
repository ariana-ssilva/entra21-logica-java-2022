package br.com.entra21.operadores.de.igualdade;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores de Igualdade == e !=");

		byte idadeA, idadeB;
		boolean resultado;

		idadeA = 10;
		idadeB = 10;
		
		resultado = idadeA == idadeB;
		
		System.out.println("Comparando a igualdade resultou em " + resultado);
		
		resultado = idadeA != idadeB;
		
		System.out.println("Comparando desigualdade resultou em " + resultado);
		
		

	}

}
