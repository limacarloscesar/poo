package br.iftm.edu.prova2;

import java.util.Scanner;

public class ProgCondicionador {
	static Scanner scan = new Scanner(System.in);
	static Condicionador condic = new Condicionador();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu Condicionador de ar\n 1 - Cadastra\n 2 - Consulta\n 3 - Sair");
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
		System.out.println("Cadastro Condicionador de ar");
		System.out.println("Marca: ");
		condic.setMarca(scan.nextLine());
		System.out.println("Modelo: ");
		condic.setModelo(scan.nextLine());
		System.out.println("Potencia: ");
		condic.setPotencia(scan.nextInt());
		System.out.println("Status: ");
		condic.setStatus(scan.nextBoolean());
		
		
		Condicionador.salvaConcionador(condic);
	}
	
	public static void consulta(){
		System.out.println("Digite o id do Condicionador: ");
		Condicionador.buscaCondicionador(scan.nextInt());
	}
	
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
