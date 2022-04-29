package br.com.entra21.If.Else;

public class Main {

	public static void main(String[] args) {
		System.out.println("Condicionais (ifElse)");
		
		if(true) {
			System.out.println("Vai passar aqui quando a condição for true");
		} else {
			System.out.println("Vai passar aqui quando a condição for false");
		}
		
		byte idade = 15;
		
		if (idade > 17) {
			System.out.println("É maior de idade");
		} else {
			System.out.println("É menor de idade");
		}

	}

}
