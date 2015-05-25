package br.edu.iftm.aula03;

import java.util.Scanner;
public class ProgImprime {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		int tamanho = nome.length();
		System.out.println("Bem-vindo ao sistema " + nome);
		System.out.print("Tamanho " + tamanho);
		entrada.close();
	}

}
