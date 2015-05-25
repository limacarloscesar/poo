package br.edu.iftm.simulado2;

import java.util.Scanner;

public class ProgCidade {
static Scanner scan = new Scanner(System.in);
static Cidade city = new Cidade();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int opcao;
		
		System.out.println("CIDADE\n" + "1 cadastra cidade \n"
		+ "2 consulta cidade\n" + "3 sair do sistema");
		opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
			case 1:
				cadastraCidade();
			break;
			
			case 2:
				buscaCidade();
			break;
				
			case 3:
				System.out.println("Saindo do sistema");
				System.exit(0);
			

		default:
			break;
		}

	}
	
	public static void cadastraCidade(){
		System.out.println("Digite o nome da cidade: ");
		city.setNome(scan.nextLine());
		System.out.println("Digite o estado: ");
		city.setEstado(scan.nextLine());
		System.out.println("Digite a dimensao: ");
		city.setDimensao(scan.nextInt());
		
		Cidade.salvaCidade(city);
		
	}
	
	public static void buscaCidade(){
		System.out.println("Digite o id da cidade: ");
		Cidade.buscaCidade(scan.nextInt());
	}

}
