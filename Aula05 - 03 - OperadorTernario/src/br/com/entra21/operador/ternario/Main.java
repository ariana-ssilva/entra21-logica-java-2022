package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operador Tern�rio");

		String userName;
		boolean condicao = true;

		userName = (true) ? "userName" : "SobreuserName";

		System.out.println("Ent�o vc � " + (condicao ? "de maior" : "de menor"));

		byte idade = 30;

		if (idade > 17) {
			System.out.println("Vc � de maior");
		} else {
			System.out.println("VC � de menor");
		}

		System.out.println("Vc � " + (idade > 17 ? "de maior" : "de menor"));

		condicao = (idade == 30 ? true : false);
	}

}
