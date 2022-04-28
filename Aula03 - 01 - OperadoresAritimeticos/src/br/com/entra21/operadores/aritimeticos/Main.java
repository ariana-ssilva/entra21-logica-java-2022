package br.com.entra21.operadores.aritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores Aritméticos");
		
		System.out.println("Realizando uma soma "+ (1 + 7 ));
		System.out.println(4 + 10 );
		
		float numeroA, numeroB;
		float calculoSoma;
		float resto;
		 // objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao teclado
		Scanner entrada = new Scanner(System.in); 
		// constroi um novo objeto para a classe Scanner e atribui para a variável entrada
		
		System.out.println("Digite o numero A: ");
		numeroA = entrada.nextFloat();
		
		System.out.println("Digite o numero B: ");
		numeroB = entrada.nextFloat();
		
		calculoSoma = numeroA + numeroB;
		System.out.println("A soma é : " + (numeroA + numeroB));
		System.out.println("Outra forma de exibir é : " + calculoSoma);
		System.out.println("A subtração é : " + (numeroA - numeroB));
		System.out.println("A divisão é : " + (numeroA / numeroB));
		System.out.println("A multiplicação é : " + (numeroA * numeroB));
		resto = numeroA % numeroB;
		System.out.println("O resto é: "+resto);
		
		boolean ehDivisivel = numeroA%numeroB == 0;
		System.out.println("É divísivel entre si? "+ ehDivisivel);
		
	}

}
