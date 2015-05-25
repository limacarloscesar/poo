package br.iftm.edu.prova2;

import java.util.Scanner;

public class ProgSmart {
	static Scanner scan = new Scanner(System.in);
	static Smart smart = new Smart();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu Aviao\n 1 - Cadastra\n 2 - Consulta\n 3 - Sair");
		int opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			cadastra();
			break;
		case 2:
			consulta();
			break;
		case 3:
			sair();
			break;
		default:
			break;
		}
		

	}
	public static void cadastra(){
		System.out.println("Cadastro Smartphone");
		System.out.println("Marca: ");
		smart.setMarca(scan.nextLine());
		System.out.println("Modelo: ");
		smart.setModelo(scan.nextLine());
		System.out.println("Processador: ");
		smart.setProcessador(scan.nextLine());
		System.out.println("Quantidade de memória: ");
		smart.setMemoria(scan.nextInt());
		System.out.println("Tamanho da tela: ");
		smart.setTela(scan.nextInt());
		
		Smart.salvaSmart(smart);
	}
	
	public static void consulta(){
		System.out.println("Digite o id do Smartphone: ");
		Smart.buscaSmart(scan.nextInt());
	}
	
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
