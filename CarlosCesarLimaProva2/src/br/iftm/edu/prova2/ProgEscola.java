package br.iftm.edu.prova2;

import java.util.Scanner;

public class ProgEscola {
	static Scanner scan = new Scanner(System.in);
	static Escola escola = new Escola();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu Escola\n 1 - Cadastra\n 2 - Consulta\n 3 - Sair");
		int opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			cadastraAviao();
			break;
		case 2:
			consultaAviao();
			break;
		case 3:
			sair();
			break;
		default:
			break;
		}
	}
	public static void cadastraAviao(){
		System.out.println("Cadastro Escola");
		System.out.println("nome: ");
		escola.setNome(scan.nextLine());
		System.out.println("Cidade: ");
		escola.setCidade(scan.nextLine());
		System.out.println("Estado: ");
		escola.setEstado(scan.nextLine());
		
		Escola.salvaEscola(escola);
	}
	
	public static void consultaAviao(){
		System.out.println("Digite o id da escola: ");
		Escola.buscaEscola(scan.nextInt());
	}
	
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
