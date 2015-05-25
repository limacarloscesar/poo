package br.edu.iftm.simulado2;

import java.util.Scanner;

public class ProgTelevisao {
		static Scanner scan = new Scanner(System.in);
		static Televisao tele = new Televisao();
	public static void main(String[] args) {
		
		
		System.out.println("Digite uma opção:\n 1 - Cadastra TV\n 2 - Consulta TV\n 3 - Sair");
		int opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			cadastraTv();
			break;
		case 2:
			consultaTv();
			break;
		case 3:
			sair();
			break;

		default:
			break;
		}

	}
	public static void cadastraTv(){
		System.out.println("CADASTRO DE TV");
		System.out.println("Digite a marca: ");
		tele.setMarca(scan.nextLine());
		System.out.println("Digite o modelo: ");
		tele.setModelo(scan.nextLine());
		System.out.println("Digite o volume: ");
		tele.setVolume(scan.nextInt());
		System.out.println("Digite o canal: ");
		tele.setCanal(scan.nextInt());
		System.out.println("Digite o status: ");
		tele.setStatus(scan.nextBoolean());
		
		tele.gravaTv(tele);
	}
	
	public static void consultaTv(){
		System.out.println("Digite o id da Tv");
		tele.buscaTelevisao(scan.nextInt());
	}
	
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
