package br.com.entra21.aulaswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Condicionais - Switch");

		System.out.println("Serve para escolher entre opções pré definidas");

		System.out.println("Geralmente quando há muitos ifs elses ifs baseados em igualdade");
		
		float altura = 1.5f;
		
		if (altura == 1.0) {
			System.out.println("nanico");
		} else if (altura == 1.2) {
			System.out.println("ainda nanico");
		}else if (altura == 1.5) {
			System.out.println("quase não nanico");
		}else {
			System.out.println("não é mais nanico");
		}
		
		System.out.println("1 = Intervalo");
		System.out.println("2 = Exercicio");
		System.out.println("3 = Prova");
		
		Scanner entrada = new Scanner(System.in);
		
		byte opcao;
		
		System.out.println("Digite um numero");
		opcao = entrada.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("Vamos para o intervalo");
			break;
			
		case 2:
			System.out.println("Vamos para os exercícios");
			break;	
			
		case 3:
			System.out.println("Era dia 5 mas podemos fazer hoje");
			break;
		}
		
		String resposta;
		System.out.println("Queremos intervalo?");
		resposta = entrada.next();
		
		switch(resposta) {
		case "sim":
			System.out.println("Hj foi na hora H");
			break;
			
		case "não":
			System.out.println("Esperar mais um pouco");
			break;
			
		default:
			System.out.println("era uma pergunta tão simples...");
			break;
		}
		
		System.out.println("Escolha um numero");
		System.out.println("1 = vermelho ");
		System.out.println("2 = azul");
		resposta= entrada.next();
		
		
		switch (resposta) {
		case "1":
			System.out.println("Azul... blue");
			break;
			
		case "2":
			System.out.println("Vermelho... red");
			break;
			
		case "nenhuma":
			System.out.println("AFFFFF");
			break;
			
		default:
			System.out.println("opção invalida");
			break;
		}
	}

}
