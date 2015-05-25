package br.iftm.edu.prova2;

import java.util.Scanner;

public class ProgAviao {
	static Scanner scan = new Scanner(System.in);
	static Aviao nave = new Aviao();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu Aviao\n 1 - Cadastra\n 2 - Consulta\n 3 - Sair");
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
		System.out.println("Cadastro Aviao");
		System.out.println("Marca: ");
		nave.setMarca(scan.nextLine());
		System.out.println("Modelo: ");
		nave.setModelo(scan.nextLine());
		System.out.println("Ano de Fabricação: ");
		nave.setAnoFabricacao(scan.nextLine());
		
		Aviao.salvaAviao(nave);
	}
	
	public static void consultaAviao(){
		System.out.println("Digite o id do Aviao: ");
		Aviao.buscaAviao(scan.nextInt());
	}
	
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
