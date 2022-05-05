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

		System.out.println(" Ol�,digite o dia do seu nascimento:");
		diaNascimento = entrada.nextByte();

		// valida��o de dia limite nos meses
		if (diaNascimento >= 1 && diaNascimento <= DIA_LIMITE_MES) {
			System.out.println("Voc� nasceu no dia " + diaNascimento);
		} else {
			System.out.println("O limite de dias de um m�s � 31!");
			System.exit(0);
		}
		System.out.println("----------------------------------------------------");

		System.out.println("Informe o n� correspondente ao m�s do seu nascimento:");
		System.out.println("----------------------------------------------------");
		System.out.println("  1 | Janeiro     2 | Fevereiro    3 | Mar�o");
		System.out.println("  4 | Abril       5 | Maio         6 | Junho");
		System.out.println("  7 | Julho       8 | Agosto       9 | Setembro");
		System.out.println(" 10 | Outubro    11 | Novembro    12 | Dezembro");
		System.out.println("----------------------------------------------------");

		// validando meses
		mesNascimento = entrada.nextByte();
		if (mesNascimento == 2 && diaNascimento > 29) {
			System.out.println("O limite de dias para este m�s � 29! Execute o programa novamente.");
			System.exit(0);
		} else if (mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9
				|| mesNascimento == 11 && diaNascimento > 30) {
			System.out.println("O limite de dias para este m�s � 30! Execute o programa novamente.");
			System.exit(0);

		} else if (mesNascimento >= 1 && mesNascimento <= 12) {
			System.out.println("Voc� nasceu no m�s " + mesNascimento);
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("Este m�s � inv�lido!");
			System.exit(0);
		}

		// iniciando a valida��o de m�s/dia/signo
		switch (mesNascimento) {
		case 1:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo � CAPRIC�RNIO");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println("H� coisas complicadas, como sempre, por�m, h� um enorme n�mero de "
						+ "situa��es simples que, se bem atendidas e valorizadas, s�o capazes de lhe "
						+ "brindar com suporte para obter o regozijo que � buscado alhures.");
				break;
			} else
				System.out.println("Seu signo � AQU�RIO");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println("A seguran�a � importante, mas se a preserva��o dessa se converter numa"
					+ " pris�o que amarra o esp�rito de aventura, ent�o voc� precisa usar seu "
					+ "discernimento com clareza e firme inten��o, para separar as coisa");
			break;

		case 2:
			if (diaNascimento <= 19) {
				System.out.println("Seu signo � AQU�RIO");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println("A seguran�a � importante, mas se a preserva��o dessa se converter numa"
						+ " pris�o que amarra o esp�rito de aventura, ent�o voc� precisa usar seu "
						+ "discernimento com clareza e firme inten��o, para separar as coisa");
				break;
			} else
				System.out.println("Seu signo � PEIXES");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println("A desordem que incomoda n�o � um castigo, mas um chamado a parar tudo e se "
					+ "dedicar a organizar os pequenos detalhes da vida cotidiana, esses mesmos que, em geral,"
					+ " n�o mereceriam muita aten��o. Agora s�o importantes.");
			break;

		case 3:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo � PEIXES");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println("A desordem que incomoda n�o � um castigo, mas um chamado a parar tudo e se "
						+ "dedicar a organizar os pequenos detalhes da vida cotidiana, esses mesmos que, em geral,"
						+ " n�o mereceriam muita aten��o. Agora s�o importantes.");
				break;
			} else
				System.out.println("Seu signo � �RIES");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println("O que tiver em mente fazer, fa�a em sil�ncio, sob o manto da discri��o, "
					+ "atraindo a menor aten��o poss�vel sobre seus movimentos. S� assim suas a��es ser�o "
					+ "eficientes, al�m de imperturb�veis. Algo muito importante.");
			break;

		case 4:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo � �RIES");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println("O que tiver em mente fazer, fa�a em sil�ncio, sob o manto da discri��o, "
						+ "atraindo a menor aten��o poss�vel sobre seus movimentos. S� assim suas a��es ser�o "
						+ "eficientes, al�m de imperturb�veis. Algo muito importante.");
				break;
			} else
				System.out.println("Seu signo � TOURO");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println("Esperar que algo aconte�a n�o � uma atitude repreens�vel, porque h� momentos da"
					+ " vida em que n�o se pode fazer nada al�m de esperar. Por�m, enquanto espera, sua alma pode"
					+ " usar o tempo para se dedicar a colocar ordem.");
			break;

		case 5:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo � TOURO");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println("Esperar que algo aconte�a n�o � uma atitude repreens�vel, porque h� momentos da"
						+ " vida em que n�o se pode fazer nada al�m de esperar. Por�m, enquanto espera, sua alma pode"
						+ " usar o tempo para se dedicar a colocar ordem.");
				break;
			} else
				System.out.println("Seu signo � G�MEOS");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println("Fa�a o que puder, evite cobrar de sua alma mais do que ela seja capaz de fazer neste "
					+ "momento. � contraproducente se comportar com severidade, porque isso s� faria voc� deixar de "
					+ "gostar do que est� ao alcance fazer.");
			break;

		case 6:
			if (diaNascimento <= 20) {
				System.out.println("Seu signo � GEMEOS");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out
						.println("Fa�a o que puder, evite cobrar de sua alma mais do que ela seja capaz de fazer neste "
								+ "momento. � contraproducente se comportar com severidade, porque isso s� faria voc� deixar de "
								+ "gostar do que est� ao alcance fazer.");
				break;
			} else
				System.out.println("Seu signo � C�NCER");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println(
					"Muitas belas palavras poderiam ser ditas para suavizar uma situa��o tensa, e provavelmente "
							+ "elas ser�o ditas, por�m, no fim do dia, s� importar� o que voc� tiver feito, a maneira com que as "
							+ "palavras se tornam obras.");
			break;

		case 7:
			if (diaNascimento <= 21) {
				System.out.println("Seu signo � CANCER");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println(
						"Muitas belas palavras poderiam ser ditas para suavizar uma situa��o tensa, e provavelmente "
								+ "elas ser�o ditas, por�m, no fim do dia, s� importar� o que voc� tiver feito, a maneira com que as "
								+ "palavras se tornam obras.");
				break;
			} else
				System.out.println("Seu signo � LE�O");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println(
					"Assuma alguns riscos moderados, algo que, se der tudo errado, n�o fa�a tanta diferen�a assim."
							+ "Por meio dos riscos assumidos, voc� encontrar� alguma chance interessante de avan�ar, mesmo que sem "
							+ "garantia de nada.");
			break;

		case 8:
			if (diaNascimento <= 22) {
				System.out.println("Seu signo � LE�O");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println(
						"Assuma alguns riscos moderados, algo que, se der tudo errado, n�o fa�a tanta diferen�a assim."
								+ "Por meio dos riscos assumidos, voc� encontrar� alguma chance interessante de avan�ar, mesmo que sem "
								+ "garantia de nada.");
				break;
			} else
				System.out.println("Seu signo � VIRGEM");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println(
					"O exemplo das pessoas � muito valioso, porque � nesse que sua alma se espelha e se sente estimulada"
							+ " a seguir. N�o importa que o exemplo seja grande ou pequeno, o que importa � sua alma se sentir atra�da por ele.");
			break;

		case 9:
			if (diaNascimento <= 22) {
				System.out.println("Seu signo � VIRGEM");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println(
						"O exemplo das pessoas � muito valioso, porque � nesse que sua alma se espelha e se sente estimulada"
								+ " a seguir. N�o importa que o exemplo seja grande ou pequeno, o que importa � sua alma se sentir atra�da por ele.");
				break;
			} else
				System.out.println("Seu signo � LIBRA");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println(
					"H� emo��es de todos os tipos e para todos os gostos, mas � bastante dif�cil as provocar intencionalmente, a n�o ser que"
							+ " voc� tenha se exercitado nisso. Todas as emo��es s�o sinceras, n�o h� mentira envolvida nelas.");
			break;

		case 10:
			if (diaNascimento <= 22) {
				System.out.println("Seu signo � LIBRA");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println(
						"H� emo��es de todos os tipos e para todos os gostos, mas � bastante dif�cil as provocar intencionalmente, a n�o ser que"
								+ " voc� tenha se exercitado nisso. Todas as emo��es s�o sinceras, n�o h� mentira envolvida nelas.");
				break;
			} else
				System.out.println("Seu signo � ESCORPI�O");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println(
					"H� tanta coisa para viver e experimentar ainda, que seria melhor voc� n�o se encerrar em seus pontos de vista, "
							+ "arrumando conflito sem necessidade. Evite o estresse, viva para agregar alegria com sua presen�a.");
			break;

		case 11:
			if (diaNascimento <= 21) {
				System.out.println("Seu signo � ESCORPI�O");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println(
						"H� tanta coisa para viver e experimentar ainda, que seria melhor voc� n�o se encerrar em seus pontos de vista, "
								+ "arrumando conflito sem necessidade. Evite o estresse, viva para agregar alegria com sua presen�a.");
				break;
			} else
				System.out.println("Seu signo � SAGIT�RIO");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println(
					"Procure passar por essas situa��es que se repetem insistentemente sem lhes dar aten��o suficiente para se tornarem, "
							+ "mais uma vez, conflitos. N�o � de conflito que voc� precisa, mas de espa�o livre.");
			break;

		case 12:
			if (diaNascimento <= 21) {
				System.out.println("Seu signo � SAGIT�RIO");
				System.out.println("Previs�o para hoje 05/05/22:");
				System.out.println(
						"Procure passar por essas situa��es que se repetem insistentemente sem lhes dar aten��o suficiente para se tornarem, "
								+ "mais uma vez, conflitos. N�o � de conflito que voc� precisa, mas de espa�o livre.");
				break;
			} else
				System.out.println("Seu signo � CAPRIC�RNIO");
			System.out.println("Previs�o para hoje 05/05/22:");
			System.out.println("H� coisas complicadas, como sempre, por�m, h� um enorme n�mero de "
					+ "situa��es simples que, se bem atendidas e valorizadas, s�o capazes de lhe "
					+ "brindar com suporte para obter o regozijo que � buscado alhures.");
			break;

		default:
			System.out.println("\n!            M�S INV�LIDO               !");
			System.out.println("----------------------------------------------------");
			System.exit(0);
		}
	}

}