package br.com.entra21.exercicio.media.aritmetica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fa�a um programa que calcule a m�dia aritm�tica de um aluno. Capture o nome do aluno e valor de suas 3 notas para informar a m�dia a formula da m�dia � a soma das notas dividido pela quantidade de notas //

	    float nota1, nota2, nota3, mediaAritmetica;
	    String nomeAluno;

	    Scanner entrada = new Scanner(System.in);

	    System.out.println("Digite o nome do aluno:");
	    nomeAluno = entrada.nextLine();

	    System.out.println("Digite a primeira nota do aluno(a):");
	    nota1 = entrada.nextFloat();

	    System.out.println("Digite a segunda nota do aluno(a):");
	    nota2 = entrada.nextFloat();

	    System.out.println("Digite a terceira nota do aluno(a):");
	    nota3 = entrada.nextFloat();

	    mediaAritmetica = (nota1 + nota2 + nota3) / 3;

	    System.out.println("A m�dia do aluno "+ nomeAluno + "� de : " + mediaAritmetica);    
	    	
	}

}
