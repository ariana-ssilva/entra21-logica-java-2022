package br.com.entra21.prova01.descubra.seu.signo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Vamos descobrir seu signo!");

		descubraSeuSigno(receberNome());
		validarMesEDia();

	}

	public static void descubraSeuSigno(String nome) {
		System.out.println("----------------------------------------------------");
	}

	public static String receberNome() {
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		return nome;
	}

	public static void validarMesEDia() {
		byte diaNascimento, mesNascimento;
		final byte DIA_LIMITE_MES = 31;
		Scanner entrada = new Scanner(System.in);

		System.out.println(" Olá,digite o dia do seu nascimento:");
		diaNascimento = entrada.nextByte();

		// validação de dia limite nos meses
		if (diaNascimento >= 1 && diaNascimento <= DIA_LIMITE_MES) {
			System.out.println("Você nasceu no dia " + diaNascimento);
		} else {
			System.out.println("O limite de dias de um mês é 31!");
			System.exit(0);
		}
		System.out.println("----------------------------------------------------");

		System.out.println("Informe o nº correspondente ao mês do seu nascimento:");
		System.out.println("----------------------------------------------------");
		System.out.println("  1 | Janeiro     2 | Fevereiro    3 | Março");
		System.out.println("  4 | Abril       5 | Maio         6 | Junho");
		System.out.println("  7 | Julho       8 | Agosto       9 | Setembro");
		System.out.println(" 10 | Outubro    11 | Novembro    12 | Dezembro");
		System.out.println("----------------------------------------------------");

		// validando meses
		mesNascimento = entrada.nextByte();
		if (mesNascimento == 2 && diaNascimento > 29) {
			System.out.println("O limite de dias para este mês é 29! Execute o programa novamente.");
			System.exit(0);
		} else if (mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9
				|| mesNascimento == 11 && diaNascimento > 30) {
			System.out.println("O limite de dias para este mês é 30! Execute o programa novamente.");
			System.exit(0);

		} else if (mesNascimento >= 1 && mesNascimento <= 12) {
			System.out.println("Você nasceu no mês " + mesNascimento);
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Este mês é inválido!");
			System.exit(0);
		}

		// iniciando a validação de mês/dia/signo
		switch (mesNascimento) {
		case 1:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo é CAPRICÓRNIO");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println("Há coisas complicadas, como sempre, porém, há um enorme número de "
						+ "situações simples que, se bem atendidas e valorizadas, são capazes de lhe "
						+ "brindar com suporte para obter o regozijo que é buscado alhures.");
				break;
			} else
				System.out.println("Seu signo é AQUÁRIO");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println("A segurança é importante, mas se a preservação dessa se converter numa"
					+ " prisão que amarra o espírito de aventura, então você precisa usar seu "
					+ "discernimento com clareza e firme intenção, para separar as coisa");
			break;

		case 2:
			if (diaNascimento <= 19) {
				System.out.println("Seu signo é AQUÁRIO");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println("A segurança é importante, mas se a preservação dessa se converter numa"
						+ " prisão que amarra o espírito de aventura, então você precisa usar seu "
						+ "discernimento com clareza e firme intenção, para separar as coisa");
				break;
			} else
				System.out.println("Seu signo é PEIXES");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println("A desordem que incomoda não é um castigo, mas um chamado a parar tudo e se "
					+ "dedicar a organizar os pequenos detalhes da vida cotidiana, esses mesmos que, em geral,"
					+ " não mereceriam muita atenção. Agora são importantes.");
			break;

		case 3:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo é PEIXES");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println("A desordem que incomoda não é um castigo, mas um chamado a parar tudo e se "
						+ "dedicar a organizar os pequenos detalhes da vida cotidiana, esses mesmos que, em geral,"
						+ " não mereceriam muita atenção. Agora são importantes.");
				break;
			} else
				System.out.println("Seu signo é ÁRIES");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println("O que tiver em mente fazer, faça em silêncio, sob o manto da discrição, "
					+ "atraindo a menor atenção possível sobre seus movimentos. Só assim suas ações serão "
					+ "eficientes, além de imperturbáveis. Algo muito importante.");
			break;

		case 4:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo é ÁRIES");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println("O que tiver em mente fazer, faça em silêncio, sob o manto da discrição, "
						+ "atraindo a menor atenção possível sobre seus movimentos. Só assim suas ações serão "
						+ "eficientes, além de imperturbáveis. Algo muito importante.");
				break;
			} else
				System.out.println("Seu signo é TOURO");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println("Esperar que algo aconteça não é uma atitude repreensível, porque há momentos da"
					+ " vida em que não se pode fazer nada além de esperar. Porém, enquanto espera, sua alma pode"
					+ " usar o tempo para se dedicar a colocar ordem.");
			break;

		case 5:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo é TOURO");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println("Esperar que algo aconteça não é uma atitude repreensível, porque há momentos da"
						+ " vida em que não se pode fazer nada além de esperar. Porém, enquanto espera, sua alma pode"
						+ " usar o tempo para se dedicar a colocar ordem.");
				break;
			} else
				System.out.println("Seu signo é GÊMEOS");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println("Faça o que puder, evite cobrar de sua alma mais do que ela seja capaz de fazer neste "
					+ "momento. É contraproducente se comportar com severidade, porque isso só faria você deixar de "
					+ "gostar do que está ao alcance fazer.");
			break;

		case 6:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo é GEMEOS");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out
						.println("Faça o que puder, evite cobrar de sua alma mais do que ela seja capaz de fazer neste "
								+ "momento. É contraproducente se comportar com severidade, porque isso só faria você deixar de "
								+ "gostar do que está ao alcance fazer.");
				break;
			} else
				System.out.println("Seu signo é CÂNCER");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println(
					"Muitas belas palavras poderiam ser ditas para suavizar uma situação tensa, e provavelmente "
							+ "elas serão ditas, porém, no fim do dia, só importará o que você tiver feito, a maneira com que as "
							+ "palavras se tornam obras.");
			break;

		case 7:
			if (diaNascimento <= 21) {
				System.out.println("Seu signo é CANCER");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println(
						"Muitas belas palavras poderiam ser ditas para suavizar uma situação tensa, e provavelmente "
								+ "elas serão ditas, porém, no fim do dia, só importará o que você tiver feito, a maneira com que as "
								+ "palavras se tornam obras.");
				break;
			} else
				System.out.println("Seu signo é LEÃO");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println(
					"Assuma alguns riscos moderados, algo que, se der tudo errado, não faça tanta diferença assim."
							+ "Por meio dos riscos assumidos, você encontrará alguma chance interessante de avançar, mesmo que sem "
							+ "garantia de nada.");
			break;

		case 8:
			if (diaNascimento <= 22) {
				System.out.println("Seu signo é LEÃO");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println(
						"Assuma alguns riscos moderados, algo que, se der tudo errado, não faça tanta diferença assim."
								+ "Por meio dos riscos assumidos, você encontrará alguma chance interessante de avançar, mesmo que sem "
								+ "garantia de nada.");
				break;
			} else
				System.out.println("Seu signo é VIRGEM");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println(
					"O exemplo das pessoas é muito valioso, porque é nesse que sua alma se espelha e se sente estimulada"
							+ " a seguir. Não importa que o exemplo seja grande ou pequeno, o que importa é sua alma se sentir atraída por ele.");
			break;

		case 9:
			if (diaNascimento <= 22) {
				System.out.println("Seu signo é VIRGEM");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println(
						"O exemplo das pessoas é muito valioso, porque é nesse que sua alma se espelha e se sente estimulada"
								+ " a seguir. Não importa que o exemplo seja grande ou pequeno, o que importa é sua alma se sentir atraída por ele.");
				break;
			} else
				System.out.println("Seu signo é LIBRA");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println(
					"Há emoções de todos os tipos e para todos os gostos, mas é bastante difícil as provocar intencionalmente, a não ser que"
							+ " você tenha se exercitado nisso. Todas as emoções são sinceras, não há mentira envolvida nelas.");
			break;

		case 10:
			if (diaNascimento <= 22) {
				System.out.println("Seu signo é LIBRA");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println(
						"Há emoções de todos os tipos e para todos os gostos, mas é bastante difícil as provocar intencionalmente, a não ser que"
								+ " você tenha se exercitado nisso. Todas as emoções são sinceras, não há mentira envolvida nelas.");
				break;
			} else
				System.out.println("Seu signo é ESCORPIÃO");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println(
					"Há tanta coisa para viver e experimentar ainda, que seria melhor você não se encerrar em seus pontos de vista, "
							+ "arrumando conflito sem necessidade. Evite o estresse, viva para agregar alegria com sua presença.");
			break;

		case 11:
			if (diaNascimento <= 21) {
				System.out.println("Seu signo é ESCORPIÃO");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println(
						"Há tanta coisa para viver e experimentar ainda, que seria melhor você não se encerrar em seus pontos de vista, "
								+ "arrumando conflito sem necessidade. Evite o estresse, viva para agregar alegria com sua presença.");
				break;
			} else
				System.out.println("Seu signo é SAGITÁRIO");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println(
					"Procure passar por essas situações que se repetem insistentemente sem lhes dar atenção suficiente para se tornarem, "
							+ "mais uma vez, conflitos. Não é de conflito que você precisa, mas de espaço livre.");
			break;

		case 12:
			if (diaNascimento <= 21) {
				System.out.println("Seu signo é SAGITÁRIO");
				System.out.println("Previsão para hoje 05/05/22:");
				System.out.println(
						"Procure passar por essas situações que se repetem insistentemente sem lhes dar atenção suficiente para se tornarem, "
								+ "mais uma vez, conflitos. Não é de conflito que você precisa, mas de espaço livre.");
				break;
			} else
				System.out.println("Seu signo é CAPRICÓRNIO");
			System.out.println("Previsão para hoje 05/05/22:");
			System.out.println("Há coisas complicadas, como sempre, porém, há um enorme número de "
					+ "situações simples que, se bem atendidas e valorizadas, são capazes de lhe "
					+ "brindar com suporte para obter o regozijo que é buscado alhures.");
			break;

		default:
			System.out.println("\n!            MÊS INVÁLIDO               !");
			System.out.println("----------------------------------------------------");
			System.exit(0);
		}
	}

}