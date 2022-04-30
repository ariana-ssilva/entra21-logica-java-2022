package br.com.entra21.elseIf;

public class Main {

	public static void main(String[] args) {
		System.out.println("Condicionais elseIf");
		
		float altura = 1.5f;
		double dinheiro	= 3000f;
		
		if(altura < 1.5) {
			System.out.println("É baixinho?");
		} else if (altura <= 1.9f) {
			System.out.println("É alto");
		} else {
			// msm não fazendo nada aqui, é uma boa prática ter o else
		}
		
		// se até 1200, até 1800 , até 2000
		if(dinheiro <= 1200) {
			System.out.println("salario minimo");
		} else if ( dinheiro <= 1800) {
			System.out.println("Tá ficando rico");
		}else if (dinheiro <= 2000) {
			System.out.println("me empresta");
		}else {
			System.out.println("Me contrata vai");
		}

	}

}
