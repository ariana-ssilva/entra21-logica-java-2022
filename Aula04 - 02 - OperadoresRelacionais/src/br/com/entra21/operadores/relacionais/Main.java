package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores Relacionais");
		
		System.out.println("Menor <");
		
		byte idadeA= 30 , idadeB = 50;
		boolean result;
		 
		result = idadeA < idadeB;
		
		System.out.println("IdadeA é < que idadeB? " + result);
		
		System.out.println("IdadeA é < que idadeB? " + (idadeA<idadeB));
		
		result = idadeA <= idadeB;
		
		System.out.println("IdadeA é <= que idadeB? " + (idadeA<idadeB));
		
		result = idadeA > idadeB;
		
		System.out.println("IdadeA é > que idadeB? " + result);
		
		System.out.println("IdadeA é >= que idadeB? " + (idadeA>=idadeB));
		
		
		

	}

}
