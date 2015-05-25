package br.edu.iftm.simulado2;

import java.util.Scanner;

public class ProgComputador {
	static Scanner scan = new Scanner(System.in);
	static Computador comp = new Computador();
	

	public static void main(String[] args) {
		System.out.println("Computador\n 1 - Cadastrar\n 2 - Consultar\n 3 - Sair\n ");
		int opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			cadastrarComputador();
			break;
		case 2:
			consultarComputador();
			break;
		case 3:
			sair();
			break;
		default:
			break;
		}
	}
	public static void cadastrarComputador(){
		System.out.println("CADASTRA COMPUTADOR");
		System.out.println("Marca: ");
		comp.setMarca(scan.nextLine());
		System.out.println("Modelo: ");
		comp.setModelo(scan.nextLine());
		System.out.println("Processador: ");
		comp.setProcessador(scan.nextLine());
		System.out.println("Tamanho do hd: ");
		comp.setHd(scan.nextInt());
		System.out.println("Quantidade de memória: ");
		comp.setMemoria(scan.nextInt());
		
		Computador.gravaComputador(comp);
	}
	public static void consultarComputador(){
		System.out.println("Digite o id do computador");
		Computador.buscaComputador(scan.nextInt());
	}
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
