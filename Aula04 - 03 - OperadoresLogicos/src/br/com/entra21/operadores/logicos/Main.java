package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores Lógicos");
		System.out.println(" && - E - AND - é restritiva ou exclusiva");
		System.out.println("Entre dois booleans ao utilizar o &&, para resultar em true, ambos tem que ser true");
		System.out.println("Se houver um false em uma comparação usando &&, resultará em false");
		
		System.out.println("TABELA VERDADE DO E");
		System.out.println("T && T = T");
		System.out.println("T && F = F");
		System.out.println("F && T = F");
		System.out.println("F && F = F");
		
		byte idade = 19;
		float altura = 1.80f;
		double dinheiro;
		boolean resultado;
		
		resultado = idade < 18; //false
		
		resultado = altura > 2.0f; // false
		
		resultado = (idade < 18 && altura >= 2.0f);
		
		idade = 15;
		altura = 1.9f;
		resultado = (idade < 18) && (altura >= 2.0f);
	
		idade = 20;
		altura = 2.10f;
		dinheiro = 20000;
		
		resultado  = (idade >=18) && (altura >=2.0f) && (dinheiro >= 5000);
		
		
		idade = 30;
		altura = 2.15f;
		dinheiro = 100000;
		resultado  = (idade >=18) && (altura >=2.0f) && (dinheiro >= 5000);
		
		idade = 40;
		altura = 2.35f;
		dinheiro = 100000;
		resultado  = ((idade >= 18)&& (idade <=45)) && (altura < 2.35) && (dinheiro > 50000);
		
		//*********************************************************************//
		
		System.out.println("|| - OU - OR - inclusivo");
		System.out.println("Entre dois booleans ao utilizar o ||, para resultar em true, basta  que um seja true");
		System.out.println("Em outra palavra, apenas quando ambos forem false com || será false");
		
		System.out.println("TABELA VERDADE DO E");
		System.out.println("T && T = T");
		System.out.println("T && F = T");
		System.out.println("F && T = T");
		System.out.println("F && F = F");
		
		
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade >=18) || (dinheiro >= 1000);
		//			(false) || (dinheiro >= 1000)
		//			(false) || (true)
		//				(true)
		
		resultado = (idade <= 14) || (idade >=18);
		//			(false) || (idade >=18)
		//			(false) || (false)
		// 				 (false)
		
		idade = 3;
		resultado = (idade <= 14) || (idade >=18);
		//			(true) || (idade >=18)
		//			(true) || (true)
		//				 (true)
		
		
	}

}


